package com.dgdavidgreene.gratitude_domain.repository

import com.dgdavidgreene.gratitude_domain.model.Gratitude
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

interface GratitudeRepository {

    /*suspend fun searchGratitude(
        query: String,
        page: Int,
        pageSize: Int
    ): Result<List<Gratitude>>*/

    suspend fun insertGratitude(gratitude: Gratitude)

    suspend fun deleteGratitude(gratitude: Gratitude)

    fun getGratitudeForDate(localDate: LocalDate): Flow<List<Gratitude>>
}