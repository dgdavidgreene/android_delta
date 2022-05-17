package com.dgdavidgreene.gratitude_ui.gratitude_overview

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GratitudeOverviewViewModel @Inject constructor(): ViewModel() {
    var state by mutableStateOf(GratitudeOverviewState())
        private set

    init {}
}