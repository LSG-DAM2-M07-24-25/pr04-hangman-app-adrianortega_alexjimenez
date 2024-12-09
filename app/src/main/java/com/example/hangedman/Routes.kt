package com.example.hangedman

sealed class Routes(val route: String) {
    object LoadingScreen:Routes("loadingScreen")

    object MenuScreen:Routes("menuScreen") {
        fun createRoute() = "menuScreen"
    }
    object GameScreen:Routes("gameScreen/{dificultad}") {
        fun createRoute(dificultad: String) = "gameScreen/$dificultad"
    }
    object ScoreScreen:Routes("scoreScreen") {
        fun createRoute() = "scoreScreen"
    }
}