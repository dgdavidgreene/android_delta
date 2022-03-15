package com.dgdavidgreene.rituals

data class Suggestion(
    val name: String,
    val description: String?,
    val ritual: Ritual,
    val preamble: Preamble,
    val ordinal: Int,
    val associations: List<Association>,
)
