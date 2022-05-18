package com.dgdavidgreene.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimpleDropdown(inputItems: List<String>, padding: Int  = 16){

    val items =  inputItems

    var isMenuExpanded by remember { mutableStateOf(false) }

    var selectedIndex by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        SimpleDropdownMenu(
            menuItems = items,
            menuExpandedState = isMenuExpanded,
            selectedIndex = selectedIndex,
            updateMenuExpandStatus = {
                isMenuExpanded = true
            },
            onDismissMenuView = {
                isMenuExpanded = false
            },
            onMenuItemClick = { index->
                selectedIndex = index
                isMenuExpanded = false
            }
        )
    }
}