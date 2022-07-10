package com.esinilyadev.ditest1.di

import androidx.lifecycle.ViewModel

interface BaseModule<T: ViewModel> {
    fun viewModel(): T
}