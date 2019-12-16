package com.sandoval.bogosunny.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sandoval.bogosunny.ViewModelFactory
import com.sandoval.bogosunny.di.ViewModelKey
import com.sandoval.bogosunny.ui.add_city.AddCityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(AddCityViewModel::class)
    internal abstract fun postAddCityViewModel(addCityViewModel: AddCityViewModel): ViewModel
}