package com.dgdavidgreene.gratitude_domain.use_case

import com.dgdavidgreene.gratitude_domain.model.Gratitude
import com.dgdavidgreene.gratitude_domain.repository.GratitudeRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class DeleteGratitude(
    private val repository: GratitudeRepository
) {

    suspend operator fun invoke(gratitude: Gratitude) {
        repository.deleteGratitude(gratitude)
    }
}