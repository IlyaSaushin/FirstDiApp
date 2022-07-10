package com.esinilyadev.ditest1.domain

class AnswerUseCase(private val repository: MainRepository) {

    fun getPicture(animal: Int): Int {
        return repository.getPicture(animal)
    }
}