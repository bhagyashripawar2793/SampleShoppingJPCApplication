package com.example.sampleshoppingjpcapplication.ui.home

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.BlendMode
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.layout.*
import androidx.ui.layout.RowScope.weight
import androidx.ui.material.Card
import androidx.ui.material.IconButton
import androidx.ui.material.MaterialTheme

import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import com.example.sampleshoppingjpcapplication.model.Event
import com.example.sampleshoppingjpcapplication.ui.Screen
import com.example.sampleshoppingjpcapplication.ui.navigateTo


@Composable
fun EventCard(event: Event, modifier: Modifier) {
    val context = ContextAmbient.current
    Column(modifier = modifier.preferredWidth(130.dp)) {
        Box(Modifier.clickable(onClick = {
            navigateTo(
                Screen.DetailsNew(
                    event
                )
            )
        }), children = {

            Column {
                Card() {

                    Stack() {
                        ImageEvent(event = event)

                    }
                }

                Row()
                {

                    Text(
                        text = event.title,
                        modifier = Modifier.padding(top = 8.dp).weight(9f),
                        style = MaterialTheme.typography.body2,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                    IconButton(onClick = {
                        navigateTo(
                            Screen.Home
                        )
                    }, modifier = Modifier.weight(1f).padding(8.dp).size(18.dp)) {
                    }
                }
                Text(
                    text = event.place.address,
                    style = MaterialTheme.typography.caption,
                    maxLines = 1,
                    color = Color.Gray,
                    overflow = TextOverflow.Ellipsis
                )
            }
        })
    }
}

@Composable
fun ImageEvent(event: Event) {
    Image(
        imageResource(id = event.imageResource),
        modifier = Modifier.fillMaxWidth().preferredSize(120.dp),
        contentScale = ContentScale.Crop,
        colorFilter = ColorFilter.tint(Color.White.copy(alpha = 0.5f))
            .copy(blendMode = BlendMode.darken)
    )
    IconButton(onClick = {
        navigateTo(
            Screen.Home
        )
    }, modifier = Modifier.weight(1f).padding(8.dp).size(18.dp)) {
    }
}