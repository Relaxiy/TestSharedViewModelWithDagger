package com.example.testsharedviewmodel.di

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.example.testsharedviewmodel.presentation.TestedViewModel
import dagger.Module
import dagger.Provides

@Module
class SharedViewModelsModule {
    @SharedViewModel
    @Provides
    fun provideTestedViewModel(
        viewModelStoreOwner: ViewModelStoreOwner
    ): TestedViewModel{
        return ViewModelProvider(viewModelStoreOwner)[TestedViewModel::class.java]
    }
}