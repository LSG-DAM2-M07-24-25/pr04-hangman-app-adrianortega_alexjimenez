package com.example.hangedman

sealed class Routes(val route: String) {
    object LoadingScreen:Routes("loadingScreen")
    object MenuScreen:Routes("menuScreen")
    object GameScreen:Routes("gameScreen")
    object ScoreScreen:Routes("scoreScreen")
}