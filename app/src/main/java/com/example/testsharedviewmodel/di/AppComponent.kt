package com.example.testsharedviewmodel.di

import androidx.lifecycle.ViewModelStoreOwner
import com.example.testsharedviewmodel.presentation.FirstTestedFragment
import com.example.testsharedviewmodel.presentation.SecondTestedFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [View::class])
interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun viewStore(viewModelStoreOwner: ViewModelStoreOwner): Builder

        fun build(): AppComponent
    }
   // fun viewModel(testedViewModel: TestedViewModel): TestedViewModel
    fun inject(firstTestedFragment: FirstTestedFragment)
    fun inject(secondTestedFragment: SecondTestedFragment)
}