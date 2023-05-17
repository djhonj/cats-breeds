package com.catbreeds.data

import com.catbreeds.data.datasource.IRemoteData

class CatRepository(private val remoteData: IRemoteData) {
    suspend fun getCats() = remoteData.getCats()
}