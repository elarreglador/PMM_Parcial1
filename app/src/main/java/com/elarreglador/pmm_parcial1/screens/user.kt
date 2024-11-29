package com.elarreglador.pmm_parcial1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.House
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.elarreglador.pmm_parcial1.ui.theme.Negro
import kotlinx.coroutines.delay








@Composable
fun User (navController: NavHostController) {

    Scaffold (
        topBar = {},
        content = { paddingValues ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {

                Spacer(modifier = Modifier.height(150.dp)) // Espacio entre imagen y texto

                Image(
                    painter = androidx.compose.ui.res.painterResource(id = com.elarreglador.pmm_parcial1.R.drawable.user4),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(
                            width = 150.dp,
                            height = 150.dp
                        )
                        .clip(CircleShape)
                        .background(Negro)
                )

                Spacer(modifier = Modifier.height(20.dp)) // Espacio entre imagen y texto

                Text(
                    text = "Usuario: @David",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleLarge

                )

                Spacer(modifier = Modifier.height(15.dp)) // Espacio entre imagen y texto

                // El mail es demasiado largo para una sola linea)
                Text(
                    text = "Correo:",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "elarreglador@protonmail.com",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleLarge
                )
            }
        },
        bottomBar = {
            Row (
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.secondary)
                    .padding(8.dp)
            ) {

                IconButton (
                    onClick = {
                        navController.navigate("Main")
                    },
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = CircleShape
                        )
                ){
                    Icon(
                        imageVector = Icons.Filled.House,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                    )
                }

                IconButton (
                    onClick = {},
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = CircleShape
                        )
                ){
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                    )
                }

                IconButton (
                    onClick = {},
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = CircleShape
                        )
                ){
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                    )
                }

                IconButton (
                    onClick = {},
                    modifier = Modifier
                    .background(
                        MaterialTheme.colorScheme.tertiary,
                        shape = CircleShape
                    )
                ){
                    Icon(
                        imageVector = Icons.Filled.AccountBox,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.tertiary)
                    )
                }
            }
        },
    )



}

@Preview
@Composable
fun UserPreview() {
    val navController = androidx.navigation.compose.rememberNavController()
    User(navController)
}