package com.example.domain.repository

import com.example.domain.Outcome
import com.example.domain.model.character.CharacterModel
import kotlinx.coroutines.flow.Flow

interface LostArkRepo {
    fun getCharacter(
        characters: String
    ): Flow<Outcome<CharacterModel>>
}