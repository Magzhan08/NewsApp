package com.loc.newsapp.presentation.nvgraph

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.loc.newsapp.presentation.onboarding.OnBoardingScreen
import com.loc.newsapp.presentation.onboarding.OnBoardingViewModel
import com.loc.newsapp.presentation.search.SearchScreen
import com.loc.newsapp.presentation.search.SearchViewModel

@Composable
fun NavGraph(
    startDestination: String
) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(
                route = Route.OnBoardingScreen.route
            ) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ) {
            composable(
                route = Route.NewsNavigatorScreen.route
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxSize()

                ){
                    Log.d("MyTag", "HomeScreen HomeScreen HomeScreen")
                    val viewModel: SearchViewModel = hiltViewModel()
                    SearchScreen(state = viewModel.state.value, event = viewModel::onEvent, navigate = {})
                }
            }
        }
    }

}