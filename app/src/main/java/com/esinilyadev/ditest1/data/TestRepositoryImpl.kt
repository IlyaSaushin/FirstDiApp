package com.esinilyadev.ditest1.data

import com.esinilyadev.ditest1.R
import com.esinilyadev.ditest1.domain.MainRepository

class TestRepositoryImpl: MainRepository {

    val dogList = listOf(
        R.mipmap.ic_dog
    )

    val catList = listOf(
        R.mipmap.ic_cat
    )

    override fun getPicture(animal: Int): Int {
        return if (animal == 1){
            dogList.random()
        } else {
            catList.random()
        }
    }
}