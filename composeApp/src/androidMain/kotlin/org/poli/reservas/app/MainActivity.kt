package org.poli.reservas.app

//import App
import MainScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            YourAppTheme {
                MainScreen()
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    MainScreen()
}

@Composable
fun ProfileScreen() {
    Surface(color = Color.White) {
        Text("Profile Screen", style = MaterialTheme.typography.h4)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YourAppTheme {
        MainScreen()
    }
}