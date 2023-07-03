package com.example.ics342

sealed class Screens(val route: String) {
    object Home: Screens("home_screen")
    object ForecastScreen: Screens("ForeCaseScreen_screen")
}