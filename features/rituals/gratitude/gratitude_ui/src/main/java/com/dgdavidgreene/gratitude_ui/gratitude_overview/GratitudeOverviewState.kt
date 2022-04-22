package com.dgdavidgreene.gratitude_ui.gratitude_overview

import java.time.LocalDate

data class GratitudeOverviewState(
    val date: LocalDate = LocalDate.now(),
)
