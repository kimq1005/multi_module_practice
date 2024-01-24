package com.example.domain.usecase

import com.example.domain.Outcome
import com.example.domain.model.character.CharacterModel
import com.example.domain.repository.LostArkRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

class GetCharacterUseCase(private val repository: LostArkRepo) {
    suspend operator fun invoke(characters: String): Flow<Outcome<CharacterModel>> =
        repository.getCharacter(characters)

}