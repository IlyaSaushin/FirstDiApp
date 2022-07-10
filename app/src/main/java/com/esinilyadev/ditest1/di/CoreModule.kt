package com.esinilyadev.ditest1.di

import android.content.Context
import com.esinilyadev.ditest1.data.TestRepositoryImpl
import com.esinilyadev.ditest1.domain.AnswerUseCase
import com.esinilyadev.ditest1.presentation.ResourceProvider

class CoreModule {

   lateinit var provider: ResourceProvider
   lateinit var answerUseCase: AnswerUseCase

   fun init(context: Context){
       provider = ResourceProvider.Base(context)
       val repository = TestRepositoryImpl()
       answerUseCase = AnswerUseCase(repository)
   }
}