package com.catbreeds.infraestructure.services

import com.catbreeds.data.datasource.IRemoteData
import com.catbreeds.domain.Cat
import com.catbreeds.infraestructure.toCat
import com.google.gson.Gson
import org.json.JSONObject

class CatService: IRemoteData  {
    private val service = ServiceBuilder.build(ICatService::class.java)

    override suspend fun getCats(): List<Cat>? {
        val catsSerializable  = service.get()

        return catsSerializable?.map {
            it.toCat()
        }
    }
}