package com.example.sampleshoppingjpcapplication

import SampleData
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.*
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.outlined.Face
import androidx.ui.material.icons.outlined.Home
import androidx.ui.material.icons.outlined.Notifications
import androidx.ui.material.icons.outlined.Search
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.font.FontWeight.Companion.Bold
import androidx.ui.text.style.TextAlign
import androidx.ui.text.typefaceFromFontFamily
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.sampleshoppingjpcapplication.model.*
import com.example.sampleshoppingjpcapplication.ui.SampleShoppingJPCApplicationTheme

import com.example.sampleshoppingjpcapplication.ui.home.*


import com.example.sampleshoppingjpcapplication.model.Place


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleShoppingJPCApplicationTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    VerticalScroller() {
        Column {
            titleBox()
            CategoriesSample(types = SampleData().types)
            Divider(color = Color.Transparent)
            CardCategeriesSingle()
            HotDealsEvents(SampleData().upcomingEvents)
            // MostLovedBrands(SampleData().breathTaking)

            /*Text("Horizontal Scrollable Carousel",modifier = Modifier.padding(10.dp))
            HorizontalScrollableComponent(getPersonList())*/
            Text(
                "Horizontal Scrollable Carousel width of the screen",
                modifier = Modifier.padding(16.dp)
            )
            HorizontalScrollableComponentWithScreenWidth(getPersonList())

            CardBestStyles()


        }
    }
    BottomNavigationSample()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleShoppingJPCApplicationTheme {
        Greeting()
    }
}


@Composable
fun BottomNavigationSample() {
    val selectedItem = state { 0 }
    val items = listOf(
        NavigationItem("Home", Icons.Outlined.Home),
        NavigationItem("Search", Icons.Outlined.Search),
        NavigationItem("Notifications", Icons.Outlined.Notifications),
        NavigationItem("Profile", Icons.Outlined.Face)
    )
    Column(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom
    ) {
        //Spacer(modifier = Modifier.preferredHeight(64.dp))
        BottomNavigation(
            backgroundColor = Color.White,
            elevation = 16.dp
        ) {
            items.forEachIndexed { index, item ->
                BottomNavigationItem(
                    icon = { Icon(item.icon) },
                    text = { Text(text = item.name) },
                    selected = selectedItem.value == index,
                    onSelected = { selectedItem.value = index },
                    activeColor = Color.Black,
                    inactiveColor = Color.DarkGray
                )
            }
        }
    }
}

data class NavigationItem(
    val name: String,
    val icon: VectorAsset
)

@Composable
fun CategoriesSample(types: List<Type>) {

    Heading(
        "Categories",
        modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp),
        onClick = {})
    HorizontalScroller() {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            for (type in types) {
                CategoryCard(type, Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Composable
private fun HotDealsEvents(events: List<Event>) {

    /*Heading(
        "Hot Deals On Top Styles",
        modifier = Modifier.padding(start = 16.dp, top = 40.dp, end = 16.dp),
        onClick = {})*/
    Text(
        "Hot Deals On Top Styles",
        modifier = Modifier.padding(start = 16.dp, top = 40.dp, end = 16.dp),
        fontStyle = FontStyle.Normal
    )
    HorizontalScroller() {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            for (event in events) {
                EventCard(
                    event, Modifier.padding(start = 8.dp)
                )
            }
        }

    }

}


@Composable
private fun MostLovedBrands(places: List<Place>) {

    /*  Heading(
          "Most Loved Brands",
          modifier = Modifier.padding(start = 16.dp, top = 24.dp, end = 16.dp),
          onClick = {})*/
    Text(
        text = "Hot Deals",
        style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(10.dp), textAlign = TextAlign.Center
    )
    HorizontalScroller() {
        Row(modifier = Modifier.padding(start = 8.dp, top = 8.dp, end = 16.dp)) {
            for (place in places) {
                PlaceCardWrapContent(
                    place,
                    Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Composable
fun CardCategeriesSingle() {
    val context = ContextAmbient.current
    Column {
        Clickable(onClick = {
           Toast.makeText(context, "Thank You Page", Toast.LENGTH_SHORT).show() })
       // navigateTo() })
    {
            Column {
                Card(modifier = Modifier.wrapContentWidth().padding(20.dp)) {
                    Column() {
                        val image = imageResource(id = R.drawable.photoheader)
                        val imageModifier = Modifier
                            .preferredHeightIn(maxHeight = 180.dp)
                            .fillMaxWidth()

                        Image(
                            image, modifier = imageModifier,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Thank You, India!\nHere's how you made it the\n biggest sale of the year",
                            modifier = Modifier
                                .clickable(onClick = {})
                                .padding(16.dp), textAlign = TextAlign.Center, style = TextStyle(
                                fontSize = (25.sp),
                                fontStyle = FontStyle.Normal,
                                fontWeight = Bold
                            )
                        )
                    }
                }
            }
        }

    }

}


@Composable
fun CardBestStyles() {
    val context = ContextAmbient.current
    Column {
        Clickable(onClick = {
            Toast.makeText(context, "Thank You Page", Toast.LENGTH_SHORT).show()
        }) {
            Column {
                Card(modifier = Modifier.wrapContentWidth().padding(20.dp)) {
                    Column() {
                        val image = imageResource(id = R.drawable.photoheader)
                        val imageModifier = Modifier
                            .preferredHeightIn(maxHeight = 180.dp)
                            .fillMaxWidth()

                        Image(
                            image, modifier = imageModifier,
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }

    }

}





