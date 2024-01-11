package com.example.domain.usecase

import com.example.domain.Outcome
import com.example.domain.model.character.CharacterModel
import com.example.domain.repository.LostArkRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

//class GetCharacterUseCase @Inject constructor(private val lostArkRepo: LostArkRepo) {
//    suspend fun invoke(characterName: String) = lostArkRepo.getCharacter(characterName)
//}