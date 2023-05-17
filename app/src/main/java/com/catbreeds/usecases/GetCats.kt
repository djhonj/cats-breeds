package com.catbreeds.usecases

import com.catbreeds.data.CatRepository

class GetCats (private val catRepository: CatRepository) {
    suspend fun invoke() = catRepository.getCats() ?: listOf()
}