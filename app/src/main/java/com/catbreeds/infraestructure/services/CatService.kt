package com.catbreeds.infraestructure.services

import com.catbreeds.data.datasource.IRemoteData
import com.catbreeds.domain.Cat
import com.google.gson.Gson
import org.json.JSONObject

class CatService: IRemoteData  {
    private val service = ServiceBuilder.build(ICatService::class.java)

    override suspend fun getCats(): List<Cat>? {

        //JSONObject().get().

        val s  = service.get().body()

        var sss = Gson().fromJson(s.toString(), CatSerializable::class.java)


        //val ss = s?.size


        return null
    }
}