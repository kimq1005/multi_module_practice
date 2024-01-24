package com.example.data.module

import com.example.data.network.LostArkService
import com.example.data.repository.LostArkImpl
import com.example.domain.repository.LostArkRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object LostArkRepositoryModule{

    @Provides
    @Singleton
    fun provideLostArkRepositoryModule(lostArkService: LostArkService) : LostArkRepo {
        return LostArkImpl(lostArkService)
    }

}