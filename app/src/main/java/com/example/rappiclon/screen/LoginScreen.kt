package com.example.rappiclon.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rappiclon.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    //Variables de inicio de sesión
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }

    Scaffold {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            item {
                //Logo
                Image(
                    painter = painterResource(id = R.drawable.rappi_logo), contentDescription = "",
                    modifier = androidx.compose.ui.Modifier
                        .height(100.dp)
                        .width(100.dp)
                )
                Text(
                    text = "Fácil, rápido y seguro",
                    fontSize = 30.sp,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.15.sp,
                        color = MaterialTheme.colorScheme.primary
                    )
                )
                Spacer(modifier = Modifier.padding(20.dp))
                //Formulario de inicio de sesión
                OutlinedTextField(
                    value = emailValue.value,
                    onValueChange = { emailValue.value = it },
                    label = {
                        Text(
                            text = "Correo electrónico",
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    singleLine = true
                )
                Spacer(modifier = Modifier.padding(10.dp))
                OutlinedTextField(
                    value = passwordValue.value,
                    onValueChange = { passwordValue.value = it },
                    trailingIcon = {
                        IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
                                tint = if (passwordVisible.value) MaterialTheme.colorScheme.primary else Color.Gray,
                                contentDescription = ""
                            )
                        }
                    },

                    label = {
                        Text(
                            text = "Contraseña",
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    singleLine = true,
                    visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
                )
                Spacer(modifier = Modifier.padding(20.dp))
                //Botón de inicio de sesión
                Button(onClick = {}) {
                    Text(
                        text = "Iniciar sesión",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Text(text = "Crear cuenta", color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.clickable(onClick = {

                    })
                )
            }
        }
    }
}
