package com.example.mobileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobileapp.ui.theme.MobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavGraph(navController = navController)
                }
            }
        }
    }
}

sealed class NavigationRoute(
    val route: String
) {
    data object Diary : NavigationRoute("Diary")
    data object Search : NavigationRoute("Search")
    data object Profile : NavigationRoute("Profile")
    data object Diet : NavigationRoute("Diet")
    data object Overview : NavigationRoute("Overview")
    data object AddFood : NavigationRoute("AddFood")
    data object InsertFood : NavigationRoute("InsertFood")
    data object AddExercise : NavigationRoute("AddExercise")
    data object InsertExercise : NavigationRoute("InsertExercise")
    data object AddRecipe : NavigationRoute("AddRecipe")
    data object InsertRecipe : NavigationRoute("InsertRecipe")
}

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Diary.route,
        modifier = modifier
    ) {
        composable(NavigationRoute.Diary.route) {

        }
        composable(NavigationRoute.Diary.route) {

        }
    }
}