import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        NavigationGraph(navController)
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf("Home", "Search", "Notifications", "Profile")
    var selectedItem by remember { mutableStateOf(0) }

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary
    ) {
        items.forEachIndexed {index, label ->
            BottomNavigationItem(
                icon = {
                    when (index) {
                        0 -> Icon(Icons.Default.Home, contentDescription = "Home")
                        1 -> Icon(Icons.Default.Search, contentDescription = "Search")
                        2 -> Icon(Icons.Default.Notifications, contentDescription = "Notifications")
                        3 -> Icon(Icons.Default.AccountCircle, contentDescription = "Profile")
                    }
                },
                label = { Text(text = label)},
                selected = index == selectedItem,
                onClick = {
                    selectedItem = index

                    when (index) {
                        0 -> navController.navigate("home")
                        1 -> navController.navigate("search")
                        2 -> navController.navigate("notifications")
                        3 -> navController.navigate("profile")
                    }
                }
            )
        }
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("search") { SearchScreen() }
        composable("notifications") { NotificationsScreen() }
        composable("profile") { ProfileScreen() }
    }
}

@Composable
fun HomeScreen() {
    Surface(color = Color.White) {
        Text("Home Screen", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun SearchScreen() {
    Surface(color = Color.White) {
        Text("Search Screen", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun NotificationsScreen() {
    Surface(color = Color.White) {
        Text("Notifications Screen", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun ProfileScreen() {
    Surface(color = Color.White) {
        Text("Profile Screen", style = MaterialTheme.typography.h4)
    }
}