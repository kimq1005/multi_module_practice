package com.example.domain.repository

import com.example.domain.model.character.CharacterModel
import kotlinx.coroutines.flow.Flow

interface LostArkRepo  {
    suspend fun getCharacter() : Flow<CharacterModel>
}