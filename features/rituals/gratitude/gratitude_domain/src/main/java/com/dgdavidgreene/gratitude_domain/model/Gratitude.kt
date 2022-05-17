package com.dgdavidgreene.gratitude_domain.model

import java.time.LocalDate

data class Gratitude(
    val sentiment: String,
    val preamble: Preamble,
    val date: LocalDate,
    val id: Int? = null
)
