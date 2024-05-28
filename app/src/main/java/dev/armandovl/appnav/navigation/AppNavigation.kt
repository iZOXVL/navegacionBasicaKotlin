package dev.armandovl.appnav.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.armandovl.appnav.screens.FirstScreen
import dev.armandovl.appnav.screens.SecondScreen

@SuppressLint("SuspiciousIndentation")
@Composable
fun AppNavigation() {
 val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(route = AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}