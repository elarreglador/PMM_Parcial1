package com.elarreglador.pmm_parcial1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.elarreglador.pmm_parcial1.ui.theme.Blanco
import com.elarreglador.pmm_parcial1.ui.theme.Negro
import com.elarreglador.pmm_parcial1.ui.theme.PMM_Parcial1Theme
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(key1 = true){
        delay(5000)
        navController.popBackStack()
        navController.navigate("Main")
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {

            Image(
                painter = androidx.compose.ui.res.painterResource(id = com.elarreglador.pmm_parcial1.R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(
                        width = 150.dp,
                        height = 150.dp
                    )
                    .clip(CircleShape)
                    .background(Negro)
                    .border(
                        width = 1.dp,
                        color = Blanco,
                        shape = CircleShape
                    )

            )

            Spacer(modifier = Modifier.height(100.dp)) // Espacio entre imagen y texto

            Text(
                text = "Bienvenidos a Projects",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge
            )

            // Autor (yo mismo)
            Text(
                text = "By: David Moreno Bolivar",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}

@Preview
@Composable
fun SplashScreenPreview() {
    val navController = androidx.navigation.compose.rememberNavController()
    SplashScreen(navController)
}