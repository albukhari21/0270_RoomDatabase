package com.example.praktikum9.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.praktikum9.view.uicontroller.SiswaApp as ViewSiswaApp
import com.example.praktikum9.view.uicontroller.HostNavigasi as ViewHostNavigasi

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier = Modifier) {
    ViewSiswaApp(navController = navController, modifier = modifier)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    ViewHostNavigasi(navController = navController, modifier = modifier)
}
