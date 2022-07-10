package com.esinilyadev.ditest1.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esinilyadev.ditest1.presentation.MainViewModel

class ViewModelsFactory(private val container: DependencyContainer): ViewModelProvider.Factory {

    private val map = HashMap<Class<*>, Feature>().apply {
        put(MainViewModel::class.java, Feature.MAIN)
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val feature = map[modelClass] ?: throw IllegalStateException("viewModel $modelClass must not be null")
        return container.module(feature).viewModel() as T
    }
}