package com.esinilyadev.ditest1.di

import android.content.Context

interface DependencyContainer {

    fun module(feature: Feature): BaseModule<*>

    class Base(private val coreModule: CoreModule, private val context: Context): DependencyContainer {
        override fun module(feature: Feature): BaseModule<*> {
            return when(feature){
                Feature.MAIN -> MainModule(coreModule, context)
            }
        }
    }
}