package com.example.sampleshoppingjpcapplication.ui

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.ui.animation.Crossfade
import androidx.ui.core.*

import com.example.sampleshoppingjpcapplication.ui.home.*

import ga.awsapps.jetexplore.ui.details.PlaceDetails
import ga.awsapps.jetexplore.ui.details.PlaceDetailsNew

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ExploreTheme() {
                Crossfade(JetExposeStatus.currentScreen) { screen ->
                    when (screen) {
                        is Screen.Home -> Greeting()
                        is Screen.Details -> PlaceDetails(screen.place)
                        is Screen.DetailsNew -> PlaceDetailsNew(screen.event)

                    }
                }
            }
        }
    }
}
