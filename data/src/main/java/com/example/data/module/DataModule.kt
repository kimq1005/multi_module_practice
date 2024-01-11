package com.example.data.module

import com.example.common.GlobalUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Qualifier
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object DataModule {
    private const val BASE_URL = "https://developer-lostark.game.onstove.com/"
    private const val BEARER_TOKEN =
        "bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyIsImtpZCI6IktYMk40TkRDSTJ5NTA5NWpjTWk5TllqY2lyZyJ9.eyJpc3MiOiJodHRwczovL2x1ZHkuZ2FtZS5vbnN0b3ZlLmNvbSIsImF1ZCI6Imh0dHBzOi8vbHVkeS5nYW1lLm9uc3RvdmUuY29tL3Jlc291cmNlcyIsImNsaWVudF9pZCI6IjEwMDAwMDAwMDAwODE0MzUifQ.UBB8NkORylP4AQ4v0fB0Lvwa5e9VbzNEBxC4uihWWv_RmqnB4f_CSyrjP4agjjt65nsUQsBTiVeoIWMcDy4giYQLT8E29gfXhNh6C4eohFADEL07UlCx2BZQng_rbfdBiME6lNepGl3dceZr_3gPOm2izTGUqvAyN126Lf4ZW_q1Oe1j0IYWu6YdKL6FT-mG2uWiJwju70KaU7OoR_6AC0PRlge9VWaRlAfrTtjwf4nmp6QHHi9x6EjsLt6JYYtG9rCZn0jiUVNGDjpE8QJ7zq1N_dMEgHF-tW1q-NnrBcmLeDgHpUaKSiIMxXZxaYai_WMFpkbif5PYClsjExUEfQ"
    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class MyOkhttpClient

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class INTERCEPTOR

    @Provides
    @Singleton
    @INTERCEPTOR
    fun provideInterceptor() = Interceptor {  chain ->
        with(chain){
            val newRequest = request().newBuilder()
                .addHeader("Authorization", BEARER_TOKEN)
                .build()
            proceed(newRequest)
        }
    }


    @Provides
    @Singleton
    @MyOkhttpClient
    fun okHttpClient(
        @INTERCEPTOR interceptor: Interceptor
    ) = OkHttpClient.Builder()
        .readTimeout(10, TimeUnit.SECONDS)
        .connectTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(15, TimeUnit.SECONDS)
        .addInterceptor(interceptor)
        .build()

    @Provides
    fun provideRetrofit(
        @MyOkhttpClient client: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
}