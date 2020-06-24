package com.example.sampleshoppingjpcapplication.ui.home

import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.layout.ColumnScope.gravity
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple

import androidx.ui.res.imageResource

import androidx.ui.text.TextStyle
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.sampleshoppingjpcapplication.model.Type


@Composable
fun HorizontalScrollableComponent(personList: List<com.example.sampleshoppingjpcapplication.model.Person>) {

    HorizontalScroller(modifier = Modifier.fillMaxWidth()) {

        Row {

            for((index, person) in personList.withIndex()) {

                Card(shape = RoundedCornerShape(4.dp), /*color = colors[index % colors.size],*/
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text("nameBhagya",
                        modifier = Modifier.padding(16.dp),
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun HorizontalScrollableComponentWithScreenWidth(personList: List<com.example.sampleshoppingjpcapplication.model.Person>) {

    HorizontalScroller(modifier = Modifier.fillMaxWidth()) {

        val context = ContextAmbient.current
        val resources = context.resources
        val displayMetrics = resources.displayMetrics
        val screenWidth = displayMetrics.widthPixels / displayMetrics.density
        val spacing = 16.dp

        Row {

            for(person in personList) {
             //   val image = imageResource(id = type.imageResource)
                Card(shape = RoundedCornerShape(4.dp),/* color = colors[index % colors.size],*/
                    modifier = Modifier.padding(16.dp)
                ) {

                    Box(modifier = Modifier.preferredWidth(screenWidth.dp - (spacing * 2)),
                        gravity = ContentGravity.Center) {

                        Text(
                            // text = person.name,
                            text="Demo",
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 20.sp
                            )
                        )

                     //   Image(asset = image, modifier = Modifier.size(80.dp), contentScale = ContentScale.Crop)
                    }
                }
            }
        }
    }
}

/*
@Composable
fun HorizontalScrollableComponentWithScreenWidthNew(type: Type, modifier: Modifier) {

    HorizontalScroller(modifier = Modifier.fillMaxWidth()) {

        val context = ContextAmbient.current
        val resources = context.resources
        val displayMetrics = resources.displayMetrics
        val screenWidth = displayMetrics.widthPixels / displayMetrics.density
        val spacing = 16.dp

        Row {

            for(type in types) {
                //   val image = imageResource(id = type.imageResource)
                Card(shape = RoundedCornerShape(4.dp),*/
/* color = colors[index % colors.size],*//*

                    modifier = Modifier.padding(16.dp)
                ) {

                    Box(modifier = Modifier.preferredWidth(screenWidth.dp - (spacing * 2)),
                        gravity = ContentGravity.Center) {

                        Text(
                            // text = person.name,
                            text="Demo",
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 20.sp
                            )
                        )

                        //   Image(asset = image, modifier = Modifier.size(80.dp), contentScale = ContentScale.Crop)
                    }
                }
            }
        }
    }
}

*/

