package com.example.usecasemodule.usecaseModule

import com.example.data.network.LostArkService
import com.example.domain.repository.LostArkRepo
import com.example.domain.usecase.GetCharacterUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LostArkModule {
    @Provides
    @Singleton
    fun provideGetCharacterUseCase(
        lostArkRepo: LostArkRepo
    ): GetCharacterUseCase {
        return GetCharacterUseCase(lostArkRepo)
    }
}