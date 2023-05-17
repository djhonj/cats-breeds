package com.catbreeds.ui

import com.catbreeds.domain.Cat
import com.catbreeds.usecases.GetCats

class MainPresenter(private val getCats: GetCats) {
    suspend fun getCats(): List<Cat> {

        return getCats.invoke()
    }
}