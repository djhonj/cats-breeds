package com.catbreeds.infraestructure

import com.catbreeds.domain.Cat
import com.catbreeds.infraestructure.services.CatSerializable

fun CatSerializable.toCat(): Cat {
    return Cat(breedName =  name, origin = origin, affectionLevel = affection_level,
        intelligence = intelligence, imageUrl = "https://cdn2.thecatapi.com/images/$reference_image_id.jpg")
}