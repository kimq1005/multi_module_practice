package com.example.domain.model.character

import java.io.Serializable

data class CharacterModel(
    val characterList: List<CharaterModelItem>
) : Serializable

data class CharaterModelItem(
    val CharacterClassName: String,
    val CharacterLevel: Int,
    val CharacterName: String,
    val ItemAvgLevel: String,
    val ItemMaxLevel: String,
    val ServerName: String
) : Serializable