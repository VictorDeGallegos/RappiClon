package com.example.rappiclon.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rappiclon.component.ButtonBase
import com.example.rappiclon.component.LogoApp
import com.example.rappiclon.component.TextClickBase
import com.example.rappiclon.component.TextFieldBase
import com.example.rappiclon.component.TextFieldPasswordBase

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun SignUpScreen() {
    //Variables de inicio de sesión
    val nameValue = remember { mutableStateOf("") }
    val emailValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val passwordValueConfirm = remember { mutableStateOf("") }
    val passwordVisibleConfirm = remember { mutableStateOf(false) }

    Scaffold {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            item {
                //Logo
                LogoApp()
                Spacer(modifier = Modifier.padding(20.dp))
                //Nombre
                TextFieldBase("Nombre", nameValue)
                Spacer(modifier = Modifier.padding(5.dp))
                //Email
                TextFieldBase("Email", emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                //Telefono
                TextFieldBase("Telefono", phoneValue)
                Spacer(modifier = Modifier.padding(5.dp))
                //Contraseña
                TextFieldPasswordBase("Contraseña", passwordValue, passwordVisible)
                Spacer(modifier = Modifier.padding(5.dp))
                //Confirmar contraseña
                TextFieldPasswordBase("Confirmar contraseña", passwordValueConfirm, passwordVisibleConfirm)
                Spacer(modifier = Modifier.padding(10.dp))
                //Botón de inicio de sesión
                ButtonBase("Registrarse", onClick = {})
                Spacer(modifier = Modifier.padding(5.dp))
                // Texto de inicio de sesión
                TextClickBase("¿Ya tienes una cuenta? Inicia sesión", onClick = {})
            }
        }
    }
}
