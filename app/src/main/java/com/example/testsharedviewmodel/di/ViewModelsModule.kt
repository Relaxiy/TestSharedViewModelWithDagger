package com.example.testsharedviewmodel.di

import androidx.lifecycle.ViewModel
import com.example.testsharedviewmodel.presentation.TestedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(TestedViewModel::class)
    fun provideTestedViewModel(
        testedViewModel: TestedViewModel
    ): TestedViewModel
}