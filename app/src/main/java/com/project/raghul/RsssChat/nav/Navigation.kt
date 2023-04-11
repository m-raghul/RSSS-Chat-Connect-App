package com.project.raghul.RsssChat.nav

import androidx.navigation.NavHostController
import com.project.raghul.RsssChat.nav.Destination.Home
import com.project.raghul.RsssChat.nav.Destination.Login
import com.project.raghul.RsssChat.nav.Destination.Register


object Destination {
    const val AuthenticationOption = "authenticationOption"
    const val Register = "register"
    const val Login = "login"
    const val Home = "home"
}


class Action(navController: NavHostController) {
    val home: () -> Unit = {
        navController.navigate(Home) {
            popUpTo(Login) {
                inclusive = true
            }
            popUpTo(Register) {
                inclusive = true
            }
        }
    }
    val login: () -> Unit = { navController.navigate(Login) }
    val register: () -> Unit = { navController.navigate(Register) }
    val navigateBack: () -> Unit = { navController.popBackStack() }
}