package org.poli.reservas.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = GreenPrimary,
    primaryVariant = GreenPrimaryVariant,
    secondary = GreenSecondary,
    background = GreenBackground,
    surface = GreenSurface,
    error = GreenError,
    onPrimary = GreenOnPrimary,
    onSecondary = GreenOnSecondary,
    onBackground = GreenOnBackground,
    onSurface = GreenOnSurface,
    onError = GreenOnError
)

private val LightColorPalette = lightColors(
    primary = GreenPrimary,
    primaryVariant = GreenPrimaryVariant,
    secondary = GreenSecondary,
    background = GreenBackground,
    surface = GreenSurface,
    error = GreenError,
    onPrimary = GreenOnPrimary,
    onSecondary = GreenOnSecondary,
    onBackground = GreenOnBackground,
    onSurface = GreenOnSurface,
    onError = GreenOnError
)

@Composable
fun YourAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}