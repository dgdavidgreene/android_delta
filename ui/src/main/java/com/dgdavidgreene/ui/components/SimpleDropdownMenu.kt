package com.dgdavidgreene.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.dgdavidgreene.ui.R

@Composable
fun SimpleDropdownMenu(
    menuItems: List<String>,
    menuExpandedState: Boolean,
    selectedIndex : Int,
    updateMenuExpandStatus : () -> Unit,
    onDismissMenuView : () -> Unit,
    onMenuItemClick : (Int) -> Unit,
    padding: Int = 16,
    iconSize: Int = 24,
    borderWidth: Float = 1.0f,
    borderAlpha: Float = 0.5f,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
            .border(borderWidth.dp, MaterialTheme.colors.onSurface.copy(alpha = borderAlpha))
            .clickable(
                onClick = {
                    updateMenuExpandStatus()
                },
            ),

        ) {

        ConstraintLayout (
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding.dp)
        ){

            val (label, iconView) = createRefs()

            Text(
                text = menuItems[selectedIndex],
                // color = selectedIndex.dropdownDisableColor(),
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(label) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(iconView.start)
                        width = Dimension.fillToConstraints
                    }
            )

            var iconId = R.drawable.ic_baseline_arrow_drop_down_24
            if (menuExpandedState)
                iconId = R.drawable.ic_baseline_arrow_drop_up_24
            val displayIcon: Painter = painterResource(
                id = iconId
            )
            Icon(
                painter = displayIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(iconSize.dp, iconSize.dp)
                    .constrainAs(iconView) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    },
                tint = MaterialTheme.colors.onSurface
            )

            DropdownMenu(
                expanded = menuExpandedState,
                onDismissRequest = { onDismissMenuView() },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.surface)
            ) {
                menuItems.forEachIndexed { index, title ->
                    DropdownMenuItem(
                        onClick = {
                            onMenuItemClick(index)
                        }) {
                        Text(text = title)
                    }
                }
            }
        }
    }
}
