package com.loeth.shopspot

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.createGraph
import com.loeth.data.network.NetworkServiceImpl
import com.loeth.shopspot.ui.feature.home.HomeScreen
import com.loeth.shopspot.ui.theme.ShopSpotTheme
import io.ktor.client.HttpClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.d("getProduct begin", "getProduct begins")
//        enableEdgeToEdge()
//        CoroutineScope(Dispatchers.IO).launch {
//            val networkService = NetworkServiceImpl(get()) // Ensure your HttpClient is correctly initialized
//            val result = networkService.getProducts()
//            Log.d("API Result", result.toString()) // Log the result for testing
//        }
        setContent {
            ShopSpotTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        HomeScreen(navController)
                    }

                }
            }
        }
    }
}
