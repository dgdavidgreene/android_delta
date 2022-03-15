package com.dgdavidgreene.rituals

data class Sentiment(
    val name: String,
    val description: String?,
    val ordinal: Int?,
    val associations: List<Association>,
    )
