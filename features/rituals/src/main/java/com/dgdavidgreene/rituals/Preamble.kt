package com.dgdavidgreene.rituals

data class Preamble(
    val name: String,
    val description: String?,
    val ordinal: Int?,
    val ritual: Ritual,
)
