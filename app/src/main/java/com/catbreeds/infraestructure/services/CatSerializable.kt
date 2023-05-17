package com.catbreeds.infraestructure.services

data class CatSerializable(val name: String, val origin: String, val intelligence: Int,
                           val affection_level: Int, val reference_image_id: String): java.io.Serializable