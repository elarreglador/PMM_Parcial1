package com.elarreglador.pmm_parcial1.navigation

import android.os.UserHandle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.composable
import com.elarreglador.pmm_parcial1.screens.Main
import com.elarreglador.pmm_parcial1.screens.SplashScreen
import com.elarreglador.pmm_parcial1.screens.User

@Composable
fun Navigator() {

    // Navegacion
    val navController = androidx.navigation.compose.rememberNavController()
    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = "SplashScreen"
    ) {
        composable("SplashScreen") {
            SplashScreen(navController)
        }
        composable("Main") {
            Main(navController)
        }
        composable("User") {
            User(navController)
        }
    }

}