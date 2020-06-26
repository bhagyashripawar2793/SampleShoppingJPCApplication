package com.example.sampleshoppingjpcapplication.ui.home


import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.BlendMode
import androidx.ui.graphics.Color
import androidx.ui.graphics.ColorFilter
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.sampleshoppingjpcapplication.R
import com.example.sampleshoppingjpcapplication.model.Type
import com.example.sampleshoppingjpcapplication.ui.Screen
import com.example.sampleshoppingjpcapplication.ui.navigateTo

@Composable
fun HorizontalScrollableComponentWithScreenWidth(personList: List<com.example.sampleshoppingjpcapplication.model.Person>) {

    HorizontalScroller(modifier = Modifier.fillMaxWidth()) {

        val context = ContextAmbient.current
        val resources = context.resources
        val displayMetrics = resources.displayMetrics
        val screenWidth = displayMetrics.widthPixels / displayMetrics.density
        val spacing = 16.dp

        Row {

            for (person in personList) {
                Card(
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier.padding(16.dp)
                ) {

                    Box(
                        modifier = Modifier.preferredWidth(screenWidth.dp - (spacing * 2)),
                        gravity = ContentGravity.Center
                    ) {

                        Text(
                            // text = person.name,
                            text = "Demo",
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

@Composable
fun HorizontalScrollableViewPager(types: List<Type>) {

    HorizontalScroller(modifier = Modifier.fillMaxWidth()) {

        val context = ContextAmbient.current
        val resources = context.resources
        val displayMetrics = resources.displayMetrics
        val screenWidth = displayMetrics.widthPixels / displayMetrics.density
        val spacing = 16.dp

        Row {

            for (type in types) {
                Card(
                    shape = RoundedCornerShape(4.dp),/* color = colors[index % colors.size],*/
                    modifier = Modifier.padding(16.dp)
                ) {
                    Box(Modifier.clickable(onClick = {
                        Toast.makeText(context, "HEllO", Toast.LENGTH_SHORT).show()
                    }), children = {

                        Box(
                            modifier = Modifier.size(screenWidth.dp - (spacing * 2), 180.dp),
                            gravity = ContentGravity.Center
                        ) {

                            Column {
                                val image = imageResource(id = type.imageResource)
                                Image(
                                    asset = image,
                                    modifier = Modifier.size(200.dp)
                                        .width(screenWidth.dp - (spacing * 2)),
                                    contentScale = ContentScale.Crop,
                                    colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.5f))
                                        .copy(blendMode = BlendMode.darken)
                                )
                                // Icon(asset = vectorResource(id = R.drawable.ic_more), tint = Color.Red)
                                //      Icon(asset = vectorResource(id = R.drawable.ic_three_dots_com), tint = Color.Red)}

                                /* Text(
                                    text = type.name,
                                    color = Color.Gray,
                                    modifier = Modifier.padding(top = 8.dp)
                                        .gravity(Alignment.CenterHorizontally),
                                    style = MaterialTheme.typography.body2,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )*/
                            }
                        }
                    })
                }
            }
        }
    }
}

