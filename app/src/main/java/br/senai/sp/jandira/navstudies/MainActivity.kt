package br.senai.sp.jandira.navstudies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.composable
import br.senai.sp.jandira.navstudies.screens.login.LogintScreen
import br.senai.sp.jandira.navstudies.screens.menu.MenuScreen
import br.senai.sp.jandira.navstudies.screens.pedido.PedidosScreen
import br.senai.sp.jandira.navstudies.screens.perfil.PerfilScreen
import br.senai.sp.jandira.navstudies.ui.theme.NavStudiesTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavStudiesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        exitTransition = {
                            slideOutOfContainer(
                                AnimatedContentScope.SlideDirection.Start,
                                tween(1000)
                                )
                        },
                        enterTransition = {
                            scaleIn(tween(500))
                        }
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






