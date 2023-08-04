package br.senai.sp.jandira.navstudies.screens.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MenuScreen(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){

        Row {
            Text(
                text = "Menu",
                color = Color.White,
                fontSize = 32.sp

            )
        }

        Button(
            onClick = {navController.navigate("perfil")},
            modifier = Modifier
                .height(100.dp)
                .width(200.dp),
            shape = RoundedCornerShape(50.dp)
        ) {
            Text(text = "Perfil")
        }

        Button(
            onClick = {navController.navigate("pedidos")},
            modifier = Modifier
                .height(100.dp)
                .width(200.dp),
            shape = RoundedCornerShape(50.dp)
            ) {
            Text(text = "Pedidos")
        }

        Button(
            onClick = {navController.navigate("login")},
            modifier = Modifier
                .height(100.dp)
                .width(200.dp),
            shape = RoundedCornerShape(50.dp)
            ) {
            Text(text = "Sair")
        }
    }
}

