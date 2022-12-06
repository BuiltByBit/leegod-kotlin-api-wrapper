package dev.imanity.bbbapi.example

import dev.imanity.bbbapi.BBBClient
import dev.imanity.bbbapi.model.Token
import dev.imanity.bbbapi.model.Type
import dev.imanity.bbbapi.model.sort.Order
import dev.imanity.bbbapi.model.sort.SortOptions
import dev.imanity.bbbapi.request.listPublicResources
import dev.imanity.bbbapi.request.retrieveMemberResourceReview
import kotlinx.coroutines.runBlocking

fun main() {
    val client = BBBClient(Token("o8jbSjHw+eMJLZIhJFIFqgmwTmOOgM2G", Type.PRIVATE))

    runBlocking {
        val review = client.retrieveMemberResourceReview(1, 1)

        println(review)
    }
}