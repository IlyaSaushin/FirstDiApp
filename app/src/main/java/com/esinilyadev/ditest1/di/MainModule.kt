package com.esinilyadev.ditest1.di

import android.content.Context
import com.esinilyadev.ditest1.presentation.MainViewModel
import com.esinilyadev.ditest1.presentation.ResourceProvider

class MainModule(
    private val coreModule: CoreModule,
    private val context: Context,
): BaseModule<MainViewModel> {

    override fun viewModel(): MainViewModel {
        val provider = ResourceProvider.Base(context)
        return MainViewModel(provider, coreModule)
    }
}