package com.catbreeds.infraestructure.services

import com.catbreeds.domain.Cat
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface ICatService {
    @Headers("x-api-key:bda53789-d59e-46cd-9bc4-2936630fde39")
    @GET("breeds")
    suspend fun get(): List<CatSerializable>?
}