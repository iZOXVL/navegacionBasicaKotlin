package dev.armandovl.appnav.navigation

sealed class AppScreens(val route: String) {
    data object FirstScreen: AppScreens("first_screen")
    data object SecondScreen: AppScreens("second_screen")
}