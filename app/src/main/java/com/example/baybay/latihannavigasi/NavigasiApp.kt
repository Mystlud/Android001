package com.example.baybay.latihannavigasi

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigasiApp(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavRoute.screen_1.name
    ) {
        composable(NavRoute.screen_1.name){
            Screen1(navController)
        }
        composable(NavRoute.screen_2.name){
            Screen2(navController)
        }

    }
}