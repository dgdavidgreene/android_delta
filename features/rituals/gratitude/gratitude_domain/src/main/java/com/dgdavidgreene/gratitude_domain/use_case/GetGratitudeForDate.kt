package com.dgdavidgreene.gratitude_domain.use_case

import com.dgdavidgreene.gratitude_domain.model.Gratitude
import com.dgdavidgreene.gratitude_domain.repository.GratitudeRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class GetGratitudeForDate(
    private val repository: GratitudeRepository
) {

    operator fun invoke(date: LocalDate): Flow<List<Gratitude>> {
        return repository.getGratitudeForDate(date)
    }
}