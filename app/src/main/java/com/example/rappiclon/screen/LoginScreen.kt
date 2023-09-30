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
import androidx.navigation.NavController
import com.example.rappiclon.R
import com.example.rappiclon.component.ButtonBase
import com.example.rappiclon.component.LogoApp
import com.example.rappiclon.component.TextClickBase
import com.example.rappiclon.component.TextFieldBase
import com.example.rappiclon.component.TextFieldPasswordBase
import com.example.rappiclon.navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
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
                LogoApp()
                Spacer(modifier = Modifier.padding(20.dp))
                //Email
                TextFieldBase("Correo electrónico", emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                //Contraseña
                TextFieldPasswordBase("Contraseña", passwordValue, passwordVisible)
                Spacer(modifier = Modifier.padding(5.dp))
                //Botón de inicio de sesión
                ButtonBase("Iniciar sesión", onClick = {
                    navController.navigate(Screen.HomeScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive = true
                        }
                    }
                })
                // Texto de registro
                TextClickBase("¿No tienes cuenta? Regístrate", onClick = {
                    navController.navigate(Screen.SignUpScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive = true
                        }
                    }

                })
            }
        }
    }
}
