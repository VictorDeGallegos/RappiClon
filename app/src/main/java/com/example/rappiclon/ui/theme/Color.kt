package com.example.rappiclon.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


val primaryColor = HexToColor.getColor("#fa3d22")
val whiteColor = HexToColor.getColor("#ffffff")
val backgroundDarkColor = HexToColor.getColor("#19202c")
val blackColor = HexToColor.getColor("#222a32")
val surfaceDark = HexToColor.getColor("#1c2639")

object HexToColor {
    fun getColor(color: String): Color {
        return Color(android.graphics.Color.parseColor(color))
    }
}