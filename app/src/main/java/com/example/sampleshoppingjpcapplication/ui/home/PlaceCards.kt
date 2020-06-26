package com.example.sampleshoppingjpcapplication.ui.home

import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.*
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.res.loadVectorResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.sampleshoppingjpcapplication.model.Place
import com.example.sampleshoppingjpcapplication.ui.Screen
import com.example.sampleshoppingjpcapplication.ui.navigateTo
import com.example.sampleshoppingjpcapplication.R

@Composable
fun PlaceCardWrapContent(place: Place, modifier: Modifier) {

    Card(
        modifier.preferredSize(width = 150.dp, height = 200.dp).ripple(),
        color = Color.Black,
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(Modifier.clickable(onClick = {
            navigateTo(
                Screen.Details(
                    place
                )
            )
        }), children = {
            ImagePlaceCardWrapContent(place)
        })
    }
}

@Composable
fun PlaceCardFullWidth(place: Place, modifier: Modifier) {
    Box(modifier.fillMaxWidth().ripple()
        .clickable(onClick = {
            navigateTo(
                Screen.Details(
                    place
                )
            )
        }), children = {
        Column()
        {

            ImagePlaceCardFullWidth(place)

            Column() {

                Text(
                    modifier = Modifier.padding(16.dp),
                    text = place.name,
                    maxLines = 3,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = (25.sp),
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

        }

    })
}

@Composable
fun ImagePlaceCardWrapContent(place: Place) {
    Image(
        modifier = Modifier.preferredSize(width = 150.dp, height = 200.dp),
        asset = imageResource(
            place.imageResources[0]
        ), contentScale = ContentScale.Crop
    )
}

@Composable
fun ImagePlaceCardFullWidth(place: Place) {
    Image(
        asset = imageResource(id = place.imageResources[0]), contentScale = ContentScale.Crop,
        modifier = Modifier.preferredHeightIn(maxHeight = 180.dp).fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
    )
}

