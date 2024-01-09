package com.example.domain.model.character

data class CharacterModel(
    val characterList : List<CharaterModelItem>
)

data class CharaterModelItem(
    val CharacterClassName: String,
    val CharacterLevel: Int,
    val CharacterName: String,
    val ItemAvgLevel: String,
    val ItemMaxLevel: String,
    val ServerName: String
)