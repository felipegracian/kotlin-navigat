package br.senai.sp.jandira.navstudies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navstudies.screens.login.LogintScreen
import br.senai.sp.jandira.navstudies.screens.menu.MenuScreen
import br.senai.sp.jandira.navstudies.screens.pedido.PedidosScreen
import br.senai.sp.jandira.navstudies.screens.perfil.PerfilScreen
import br.senai.sp.jandira.navstudies.ui.theme.NavStudiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavStudiesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        composable(route = "login"){ LogintScreen(navController)}
                        composable(route = "menu"){ MenuScreen(navController)}
                        composable(route = "pedidos"){ PedidosScreen(navController)}
                        composable(route = "perfil"){ PerfilScreen(navController)}
                    }
                }
            }
        }
    }
}






