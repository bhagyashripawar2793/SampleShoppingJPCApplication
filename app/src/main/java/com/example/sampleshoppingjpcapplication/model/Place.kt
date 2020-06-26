package com.example.sampleshoppingjpcapplication.model

import android.location.Location


data class Type(
    val name: String,
    val imageResource: Int
)

data class Person(
    val name: String,
    val age: Int,
    val profilePictureUrl: String? = null
)

// Methods
fun getPersonList() = listOf(
    Person("Grace Hopper", 25),
    Person("Ada Lovelace", 29),
    Person("John Smith", 28),
    Person("Elon Musk", 41),
    Person("Will Smith", 31),
    Person("Robert James", 42),
    Person("Anthony Curry", 91),
    Person("Kevin Jackson", 22),
    Person("Robert Curry", 1),
    Person("John Curry", 9),
    Person("Ada Jackson", 2),
    Person("Joe Defoe", 35)
)


data class Place(
    val id: Int,
    val name: String,
    val address: String,
    //  val location : Location,
    val descriptions: String,
    val difficulty: Int,
    val elevation: Long,
    val imageResources: List<Int>,
    val feedBack: FeedBack
)

data class Event(
    val id: Int,
    val title: String,
    val imageResource: Int,
    val place: Place,
    val status: Int
)

data class FeedBack(
    val totalNoOfReview: Int,
    val overallRatting: Float,
    val ratting: Ratting,
    val reviews: List<Review>
)

data class Review(
    val text: String,
    val date: String,
    val ratting: Float,
    val user: User,
    val noOfReply: Int,
    val likes: Int
)


data class User(
    val id: Int,
    val name: String,
    val icon: Int
)


data class Ratting(
    val count: Int,
    val display: String,
    val value: Double,
    val one: States,
    val two: States,
    val three: States,
    val four: States,
    val five: States
)

data class States(val percentage: Int)