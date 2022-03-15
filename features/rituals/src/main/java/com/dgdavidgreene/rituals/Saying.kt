package com.dgdavidgreene.rituals

data class Saying(
    val name: String,
    val description: String?,
    val ordinal: Int?,
    val associations: List<Association>,
    )
