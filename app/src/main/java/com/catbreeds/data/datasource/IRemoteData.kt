package com.catbreeds.data.datasource

import com.catbreeds.domain.Cat

interface IRemoteData {
    suspend fun getCats(): List<Cat>?
}