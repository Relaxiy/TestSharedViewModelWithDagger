package com.example.testsharedviewmodel.di

import android.app.Activity
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.example.testsharedviewmodel.presentation.TestedViewModel
import dagger.Module
import dagger.Provides

@Module
class View {
    @Provides
    fun provideTestedViewModel(
        viewModelStoreOwner: ViewModelStoreOwner
    ): TestedViewModel{
        return ViewModelProvider(viewModelStoreOwner)[TestedViewModel::class.java]
    }
}