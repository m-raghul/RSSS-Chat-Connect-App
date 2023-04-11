package com.project.raghul.RsssChat.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.project.raghul.RsssChat.ui.theme.FlashChatTheme


@Composable
fun AuthenticationView(register: () -> Unit, login: () -> Unit) {
    FlashChatTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Title(title = "Welcome To RSSS-ChatConnect")
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 45.dp, end = 45.dp)) {
                    Buttons(title = "Sign up", onClick = register, backgroundColor =  Color(0xFF005C4B))
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 45.dp, end = 45.dp)) {
                    Buttons(title = "Sign in", onClick = login, backgroundColor =  Color(0xFF005C4B))
                }
            }
        }
    }
}
