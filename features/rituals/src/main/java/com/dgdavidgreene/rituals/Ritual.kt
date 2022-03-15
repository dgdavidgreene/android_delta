package com.dgdavidgreene.rituals

data class Ritual(
    val name: String,
    val description: String?,
    val ordinal: Int?,
    val associations: List<Association>,
)