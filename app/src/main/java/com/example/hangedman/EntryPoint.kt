package com.example.hangedman

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun EntryPoint(navigationController: NavController){
NavHost(
    navController = navigationController as NavHostController,
    startDestination = Routes.MenuScreen.route
) {
    composable(Routes.MenuScreen.route) { LoadingScreen(navigationController) }
}
}