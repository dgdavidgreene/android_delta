package com.dgdavidgreene.gratitude_domain.use_case

import com.dgdavidgreene.gratitude_domain.model.Preamble
import com.dgdavidgreene.gratitude_domain.model.Gratitude
import com.dgdavidgreene.gratitude_domain.repository.GratitudeRepository
import java.time.LocalDate

class Gratitude(
    private val repository: GratitudeRepository
) {

    suspend operator fun invoke(
        sentiment: String,
        preamble: Preamble,
        date: LocalDate
    ) {
        repository.insertGratitude(
            Gratitude(
                sentiment = sentiment,
                preamble = preamble,
                date = date,
            )
        )
    }
}