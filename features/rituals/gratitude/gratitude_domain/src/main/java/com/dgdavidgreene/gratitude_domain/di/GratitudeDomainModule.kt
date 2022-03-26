package com.dgdavidgreene.gratitude_domain.di

import com.dgdavidgreene.gratitude_domain.use_case.ValidateNutrientsX
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object GratitudeDomainModule {

    @Provides
    @ViewModelScoped
    fun provideValidateNutrientsUseCase(): ValidateNutrientsX {
        return ValidateNutrientsX()
    }
}