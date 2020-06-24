package com.example.sampleshoppingjpcapplication.ui.home

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Row
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButton
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp

@Composable
fun Heading(title: String, modifier: Modifier, onClick: () -> Unit){

    Row( verticalGravity = Alignment.CenterVertically, modifier = modifier ) {
        Text(
                text = title,
                style = MaterialTheme.typography.body1.copy( fontWeight = FontWeight.SemiBold ),
                modifier = Modifier.padding(end = 16.dp).weight(1f)
        )
        TextButton( onClick = onClick ) {
            Text(
                    text = "View All",
                    style =MaterialTheme.typography.body1.copy(  fontWeight = FontWeight.W600)
            )
        }
    }
    
}