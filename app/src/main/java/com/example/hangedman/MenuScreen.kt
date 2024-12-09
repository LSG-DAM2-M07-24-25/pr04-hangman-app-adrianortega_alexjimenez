package com.example.hangedman

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hangedman.ui.theme.HangedManTheme
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.hangedman.Routes

@Composable
fun MenuScreen(navController: NavController){
    Row (
        verticalAlignment = Alignment.Top
    ){
        Image(painter = painterResource(id = R.drawable.stickman), contentDescription = "Logo")
    }

    Row (
        verticalAlignment = Alignment.Bottom
    ){
        Button(
            onClick = { navController.navigate(Routes.GameScreen.createRoute(dificultad))}
        ) {

        }
    }
}