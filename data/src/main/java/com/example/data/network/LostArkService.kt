package com.example.data.network

import com.example.domain.model.character.CharacterModel
import retrofit2.http.GET
import retrofit2.http.Path

interface LostArkService {
    @GET("/characters/{characters}/siblings")
    fun getCharacter(
        @Path("characters") characters: String
    ): CharacterModel

}