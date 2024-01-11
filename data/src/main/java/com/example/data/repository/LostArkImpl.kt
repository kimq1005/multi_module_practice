package com.example.data.repository

import com.example.data.network.LostArkService
import com.example.domain.Outcome
import com.example.domain.model.character.CharacterModel
import com.example.domain.repository.LostArkRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class LostArkImpl(
    private val lostArkService: LostArkService
) : LostArkRepo {
    override fun getCharacter(characters: String): Flow<Outcome<CharacterModel>> = flow {
        val response = lostArkService.getCharacter(characters)
        emit(Outcome.success(response))
    }
        .catch { emit(Outcome.failure(it)) }
        .flowOn(Dispatchers.IO)

}