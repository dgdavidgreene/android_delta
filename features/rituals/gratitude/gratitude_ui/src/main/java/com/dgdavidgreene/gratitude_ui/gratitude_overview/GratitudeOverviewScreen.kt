package com.dgdavidgreene.gratitude_ui.gratitude_overview

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import com.dgdavidgreene.ui.LocalSpacing
import com.dgdavidgreene.ui.components.InlineDropdown
import com.dgdavidgreene.ui.components.SimpleDropdown


@ExperimentalCoilApi
@Composable
fun GratitudeOverviewScreen(
    //viewModel: GratitudeOverviewViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    //val state = viewModel.state
    //val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = spacing.spaceMedium)
    ) {
        item {
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            SimpleFilledTextFieldSample()
            Spacer(modifier = Modifier.height(spacing.spaceMedium))

            ComposeMenu()

        }
    }
}

@Composable
fun SimpleFilledTextFieldSample() {
    var text  = "Hello"

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}

@Composable
fun ComposeMenu() {
    val menuItems = listOf("I am thankful for", "I am grateful that", "I am blessed with")
    SimpleDropdown(menuItems)
    InlineDropdown(menuItems)
}
