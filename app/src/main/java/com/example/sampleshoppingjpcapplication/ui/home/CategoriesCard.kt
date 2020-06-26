package com.example.sampleshoppingjpcapplication.ui.home

import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.ripple
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp
import com.example.sampleshoppingjpcapplication.model.Type

@Composable
fun CategoryCard(type: Type, modifier: Modifier) {
    val context = ContextAmbient.current
    Column(modifier = modifier.preferredWidth(80.dp).ripple()) {
        Box(Modifier.clickable(onClick = { Toast.makeText(context, "HEllO", Toast.LENGTH_SHORT).show() }),
            children = {

                Column {
                    val image = imageResource(id = type.imageResource)
                    Card(Modifier.wrapContentSize(Alignment.Center), shape = CircleShape) {

                        Image(
                            asset = image,
                            modifier = Modifier.size(80.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Text(
                        text = type.name,
                        color = Color.Gray,
                        modifier = Modifier.padding(top = 8.dp).gravity(Alignment.CenterHorizontally),
                        style = MaterialTheme.typography.body2,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            })
    }
}