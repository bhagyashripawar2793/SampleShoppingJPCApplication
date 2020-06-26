package ga.awsapps.jetexplore.ui.details

import androidx.compose.*
import androidx.ui.core.*
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*

import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowBack
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign

import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.sampleshoppingjpcapplication.model.Event
import com.example.sampleshoppingjpcapplication.model.Place
import com.example.sampleshoppingjpcapplication.ui.Screen
import com.example.sampleshoppingjpcapplication.ui.navigateTo


@Composable
    fun PlaceDetailsNew(event: Event)
    {
    Stack(modifier = Modifier.fillMaxSize()) {

        backButtonNew( )
     //   SampleText()
        findButtonNew( )
    }
}

@Composable
fun  StackScope.backButtonNew( )
{
    IconButton(onClick = {
        navigateTo(
            Screen.Home
        )
    }, modifier = Modifier.padding( top = 24.dp,  bottom = 24.dp)) {
        Modifier.preferredSize(24.dp).gravity(Alignment.Center)
        Icon(Icons.Filled.ArrowBack,tint =  Color.Black)
    }
}

@Composable
fun  StackScope.findButtonNew( )
{
    ExtendedFloatingActionButton(

        text = { Text("Submit", color = Color.Black) },
        onClick = {},
        modifier = Modifier.fillMaxWidth().padding(24.dp).gravity(Alignment.BottomCenter).tag("find_btn")
    )
}

@Composable
fun SampleText(){
    Text(
        text = "Thank You, India!\nHere's how you made it the\n biggest sale of the year",
        modifier = Modifier
            .clickable(onClick = {})
            .padding(160.dp),
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = (25.sp),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
    )
}




