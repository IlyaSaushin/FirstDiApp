package com.esinilyadev.ditest1.presentation

import android.graphics.drawable.Drawable
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.esinilyadev.ditest1.di.CoreModule

class MainViewModel(
    private val provider: ResourceProvider,
    private val coreModule: CoreModule
): ViewModel() {

    private var liveData = MutableLiveData<Drawable>()

    fun observe(owner: LifecycleOwner, observer: Observer<Drawable>){
        liveData.observe(owner, observer)
    }

    fun getCat(animal: Int){
        val resultCat = coreModule.answerUseCase.getPicture(animal)
        liveData.value = provider.answerPicture(resultCat)
    }

    fun getDog(animal: Int){
        val resultDog = coreModule.answerUseCase.getPicture(animal)
        liveData.value = provider.answerPicture(resultDog)
    }
}