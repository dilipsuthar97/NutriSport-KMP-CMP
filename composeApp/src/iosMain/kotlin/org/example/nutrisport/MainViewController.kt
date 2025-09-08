package org.example.nutrisport

import androidx.compose.ui.window.ComposeUIViewController
import com.example.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initializeKoin()
    }
) { App() }