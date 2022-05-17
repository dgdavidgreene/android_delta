package com.dgdavidgreene.gratitude_domain.use_case

data class TrackerUseCases(
    val trackGratitude: Gratitude,
    val getGratitudeForDate: GetGratitudeForDate,
    val deleteGratitude: DeleteGratitude,
)
