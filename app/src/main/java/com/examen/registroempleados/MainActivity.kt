package com.examen.registroempleados

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.examen.registroempleados.ui.theme.RegistroEmpleadosTheme
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun
            onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroEmpleadosTheme {
                EmployeeApp()
            }
        }
    }
        override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStop")
    }
        override fun onStop() {
            super.onStop()
            Log.i(TAG,"onStop")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.i(TAG, "onDestroy")
        }
    }
@Composable
fun EmployeeApp(){
    var nombre by remember { mutableStateOf("")}
    var cargo by remember { mutableStateOf("")}
    var departamento by remember { mutableStateOf("")}
    var salario by remember { mutableStateOf("")}
    var fecha by remember { mutableStateOf("")}

    val empleados = remember {
        mutableStateListOf<Employee>()
    }
    Column(
        modifier = Modifier
            .fillMaxSize ()
            .padding(16.dp)
    ){
        Text(
            text = "Registro de Empleados",
                style =
                MaterialTheme.typography.headlineMedium
    )
        Spacer(
            modifier = Modifier.height(16.dp)
    )
        OutlinedTextField(
            value = nombre,
            onValueChange = {
                nombre = it
            },
            label = {
                Text("Nombre completo")
            }
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        OutlinedTextField(
            value = cargo,
            onValueChange = {
                cargo = it
            },
            label = {
                Text("Cargo")
            }
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        OutlinedTextField(
            value = departamento,
            onValueChange = {
                departamento = it
            },
            label = {
                Text("Departamento")
            }
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        OutlinedTextField(
            value = salario,
            onValueChange = {
                salario = it
            },
            label = {
                Text("Salario")
            }
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        OutlinedTextField(
            value = fecha,
            onValueChange = {
                fecha = it
            },
            label = {
                Text("Fecha de contratación")
            }
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
Button(
    onClick = {
        empleados.add(
            Employee(
                nombre = nombre,
                cargo = cargo,
                departamento = departamento,
                salario = salario,
                fecha = fecha
            )
        )
        nombre = ""
        cargo = ""
        departamento = ""
        salario = ""
        fecha = ""
    }
) {
    Text("Registrar empleado")
}
    Spacer(
        modifier = Modifier.height(16.dp)
    )
    LazyColumn {
        items(empleados) { empleado ->
            EmployeeItem(
                empleado = empleado,
                onDelete = {
                    empleados.remove(empleado)
                }
            )
            Spacer(
                modifier = Modifier.height(8.dp)
            )
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RegistroEmpleadosTheme {
        Greeting("Android")
    }
}