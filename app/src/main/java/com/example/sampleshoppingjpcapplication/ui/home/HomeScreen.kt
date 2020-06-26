package com.example.sampleshoppingjpcapplication.ui.home

import SampleData
import android.widget.Toast
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
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.sampleshoppingjpcapplication.R
import com.example.sampleshoppingjpcapplication.model.Event
import com.example.sampleshoppingjpcapplication.model.Place
import com.example.sampleshoppingjpcapplication.model.Type
import com.example.sampleshoppingjpcapplication.model.getPersonList
import com.example.sampleshoppingjpcapplication.ui.SampleShoppingJPCApplicationTheme


@Composable
fun Greeting() {
    VerticalScroller() {
        Column {
            titleBox()
            CategoriesSample(types = SampleData().types)
            Divider(color = Color.Transparent)
            Spacer(modifier = Modifier.preferredHeight(30.dp))
            Recommended(SampleData().recommended)
            HotDealsEvents(SampleData().upcomingEvents)
            Text(
                "Horizontal Scrollable Carousel width of the screen",
                modifier = Modifier.padding(16.dp)
            )
            //  HorizontalScrollableComponentWithScreenWidth(getPersonList())
            HorizontalScrollableViewPager(types = SampleData().types)
            MostLovedBrands(SampleData().brands)
            Text(
                "Horizontal Scrollable Carousel width of the screen",
                modifier = Modifier.padding(16.dp)
            )
            CardCategeriesSingle()
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
                CategoryCard(
                    type, Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Composable
private fun HotDealsEvents(events: List<Event>) {
    Text(
        "Hot Deals On Top Styles",
        modifier = Modifier.padding(start = 16.dp, top = 30.dp, end = 16.dp, bottom = 10.dp),
        fontStyle = FontStyle.Normal,
        fontSize = (25.sp)
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

    Text(
        "Most Loved Brands",
        modifier = Modifier.padding(start = 16.dp, top = 30.dp, end = 16.dp, bottom = 10.dp),
        fontStyle = FontStyle.Normal,
        fontSize = (25.sp)
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
        Box(Modifier.clickable(onClick = {
            Toast.makeText(context, "Thank You Page", Toast.LENGTH_SHORT).show()
        }),
            // navigateTo() })
            children = {
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
                                    .padding(16.dp),
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = (25.sp),
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }
                    }
                }
            })
    }
}

@Composable
fun Recommended(places: List<Place>) {
    VerticalScroller() {
        Column(modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp)) {
            for (place in places) {
                PlaceCardFullWidth(place, Modifier)
            }
        }
    }
}


