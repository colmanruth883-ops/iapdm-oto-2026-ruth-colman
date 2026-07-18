package com.examen.registroempleados

import androidx.compose.foundation.hoverable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EmployeeItem(
    empleado: Employee,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = empleado.nombre,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(
                modifier = Modifier.height(8.dp)
            )
            LazyRow {
                item {
                    Text("Cargo: $ {empleado.cargo}")
                }
                item {
                    Spacer(
                        modifier = Modifier.width(10.dp)
                    )
                }
                item {
                    Text("Depto: $ empleado.departamento")
                }
                item {
                    Spacer(
                        modifier = Modifier.width(10.dp)
                )
                }
                item {
                    Text("Salario: $ {empleado.salario}")
                }
                item {
                    Spacer(
                        modifier = Modifier.width(10.dp)
                )
                }
                item {
                    Text("Fecha: $ {empleado.fecha}")
                }
            }
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Button(
                onClick = onDelete
            ) {
                Text("Eliminar")
            }
        }
    }
}