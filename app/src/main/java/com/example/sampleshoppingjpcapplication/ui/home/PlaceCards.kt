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
import androidx.ui.material.IconButton
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.res.loadVectorResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.TextUnit
import androidx.ui.unit.dp
import com.example.sampleshoppingjpcapplication.model.Place
import com.example.sampleshoppingjpcapplication.model.Screen
import com.example.sampleshoppingjpcapplication.model.navigateTo
import com.example.sampleshoppingjpcapplication.R
import com.example.sampleshoppingjpcapplication.model.Type


/*
@Composable
fun PlaceCardWrapContent(place: Place, modifier: Modifier) {

    Card( modifier. preferredSize(width = 125.dp, height =  120.dp).ripple(),color = Color.Black,shape = CircleShape) {
       */
/* Box(Modifier.clickable*//*

        Box(Modifier.clickable(onClick = {
            navigateTo(
                Screen.Details(
                    place
                ))

        })) {
            ImagePlaceCardWrapContent(place)
        }
    }
}

*/
@Composable
fun PlaceCardWrapContent(place: Place, modifier: Modifier) {
    val context= ContextAmbient.current
    Column{
        Clickable(onClick = {Toast.makeText(context,"Hello card",Toast.LENGTH_SHORT).show() }) {

    Column {
        navigateTo(
            Screen.Details(
                place
            )
        )
        Card(
            modifier.preferredSize(width = 125.dp, height = 120.dp).ripple(),
            color = Color.Black,
            shape = CircleShape
        ) { ImagePlaceCardWrapContent(place) }
    }
    }}
}

@Composable
fun PlaceCardFullWidth(place: Place, modifier: Modifier)
{
    Clickable(onClick = {
        navigateTo(
            Screen.Details(
                place
            )
        )
    },  modifier = modifier.fillMaxWidth().ripple()
    ) {
        Row()
        {

            ImagePlaceCardFullWidth(place)

            Column() {

                Text(
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
                    text = place.name,
                    maxLines = 1,
                    style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.SemiBold)
                )

                Text(
                    modifier = Modifier.padding(start = 16.dp, top = 4.dp, end = 16.dp),
                    text = place.descriptions,
                    style = MaterialTheme.typography.subtitle2,
                    maxLines = 3,
                    color = Color.DarkGray,
                    overflow = TextOverflow.Ellipsis
                )

                Row(modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp))
                {
                    val vectorAsset = loadVectorResource(R.drawable.ic_distance)
                    vectorAsset.resource.resource?.let {
                        Image(
                            asset = it,
                            modifier = Modifier.preferredSize(18.dp, 18.dp),
                            contentScale = ContentScale.Inside,
                            colorFilter = ColorFilter.tint(Color.DarkGray)
                        )
                    }

                }
            }

        }

    }
}


@Composable
fun ImagePlaceCardWrapContent(place: Place)
{
                Image( modifier =  Modifier.preferredSize(24.dp),
                asset = imageResource(
                    place.imageResources[0]
                ),contentScale =  ContentScale.Crop)

}

@Composable
fun ImagePlaceCardFullWidth(place: Place)
{
    Image(asset = imageResource(id = place.imageResources[0]), contentScale =  ContentScale.Crop
        , modifier = Modifier.size(120.dp, 140.dp).clip(RoundedCornerShape(8.dp)))
}