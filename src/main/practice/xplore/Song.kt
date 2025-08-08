package main.practice.xplore

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 08, August 2025
 * EMAIL: damexxey94@gmail.com
 */

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDetails() {
        println("Title: $title")
        println("Performed by: $artist")
        println("Released in year: $yearPublished")
        println("Number of streams: $playCount")
    }
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minPrice: Int): Int {
    return bid?.amount ?: minPrice
}


fun main() {
    val song = Song(title = "Faith", artist = "The Weeknd", yearPublished = 2023, playCount = 100_000)
    song.printDetails()
    println("Is this song popular? ${song.isPopular}")

    val winningBid = Bid(amount = 6500, bidder = "Damola Onikoyi")

    println("The song playwrights is sold for ${auctionPrice(bid = winningBid, minPrice = 500)}")
}