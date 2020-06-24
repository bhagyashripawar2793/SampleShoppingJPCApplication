package com.example.sampleshoppingjpcapplication.ui.home

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.tag
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.IconButton
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.ShoppingCart
import androidx.ui.res.imageResource
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import com.example.sampleshoppingjpcapplication.R


@Composable
fun titleBox( ) {
    ConstraintLayout(
        constraintSet = ConstraintSet {
        }
    ) {
        TopAppBar(
            backgroundColor = Color.Red,
            elevation = 8.dp,
            title = { Text("Shopping JPC App", color = Color.White) },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.Menu, tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(asset = Icons.Default.ShoppingCart, tint = Color.White)
                }
            }
        )
    }

}
