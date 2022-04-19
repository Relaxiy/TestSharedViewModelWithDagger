package com.example.testsharedviewmodel.di

import androidx.lifecycle.ViewModelStoreOwner
import com.example.testsharedviewmodel.presentation.FirstTestedFragment
import com.example.testsharedviewmodel.presentation.SecondTestedFragment
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@SharedViewModel
@Component(modules = [SharedViewModelsModule::class])
interface ActivityComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun viewStore(viewModelStoreOwner: ViewModelStoreOwner): Builder

        fun build(): ActivityComponent
    }

    fun inject(firstTestedFragment: FirstTestedFragment)
    fun inject(secondTestedFragment: SecondTestedFragment)
}