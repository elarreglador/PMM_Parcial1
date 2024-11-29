package com.elarreglador.pmm_parcial1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.House
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.elarreglador.pmm_parcial1.R
import com.elarreglador.pmm_parcial1.ui.theme.Blanco
import com.elarreglador.pmm_parcial1.ui.theme.Negro

@Composable
fun Main(navController: NavController) {

    Scaffold (
        topBar = {
            LazyRow (
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                    .padding(
                        top = 24.dp,
                        bottom = 8.dp
                    )
            ){

                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user1),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(
                                    width = 88.dp,
                                    height = 88.dp
                                )
                                .clip(CircleShape)
                                .background(Negro)
                                .border(
                                    width = 1.dp,
                                    color = Blanco,
                                    shape = CircleShape
                                )
                        )
                        Text(
                            "Story 1",
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                }

                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user2),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(
                                    width = 88.dp,
                                    height = 88.dp
                                )
                                .clip(CircleShape)
                                .background(Negro)
                                .border(
                                    width = 1.dp,
                                    color = Blanco,
                                    shape = CircleShape
                                )
                        )
                        Text(
                            "Story 1",
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                }

                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user3),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(
                                    width = 88.dp,
                                    height = 88.dp
                                )
                                .clip(CircleShape)
                                .background(Negro)
                                .border(
                                    width = 1.dp,
                                    color = Blanco,
                                    shape = CircleShape
                                )
                        )
                        Text(
                            "Story 2",
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                }

                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user4),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(
                                    width = 88.dp,
                                    height = 88.dp
                                )
                                .clip(CircleShape)
                                .background(Negro)
                                .border(
                                    width = 1.dp,
                                    color = Blanco,
                                    shape = CircleShape
                                )
                        )
                        Text(
                            "Story 3",
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                }

                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.user5),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(
                                    width = 88.dp,
                                    height = 88.dp
                                )
                                .clip(CircleShape)
                                .background(Negro)
                        )
                        Text(
                            "Story 4",
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                }

            }
        },


        content = { paddingValues ->
            LazyColumn (
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(Negro)
            ) {

                // En el previo la imagen llega hasta el borde pero en mi
                // Android 10 hay un par de milimetros hasta el borde
                item{
                        Text(
                            "Publicacion 1",
                            style = MaterialTheme.typography.titleMedium,
                            color = Blanco,
                        )
                        Image(
                            painter = painterResource(id = R.drawable.foto1),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .fillParentMaxSize(1f)
                        )
                }

                item{
                    Text(
                        "Publicacion 2",
                        style = MaterialTheme.typography.titleMedium,
                        color = Blanco,
                        )
                    Image(
                        painter = painterResource(id = R.drawable.foto2),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .fillParentMaxSize(1f)
                    )
                }

                item{
                    Text(
                        "Publicacion 3",
                        style = MaterialTheme.typography.titleMedium,
                        color = Blanco,
                        )
                    Image(
                        painter = painterResource(id = R.drawable.foto3),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .fillParentMaxSize(1f)
                    )
                }

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
                    onClick = {},
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.tertiary,
                            shape = CircleShape
                        )
                ){
                    Icon(
                        imageVector = Icons.Filled.House,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.tertiary)

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
                    onClick = {
                        navController.navigate("User")
                    },
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = CircleShape
                        )
                ){
                    Icon(
                        imageVector = Icons.Filled.AccountBox,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                    )
                }
            }
        },
    )

}


@Preview(showSystemUi = true)
@Composable
fun MainPreview(){
    val navController = rememberNavController()
    Main(navController)
}