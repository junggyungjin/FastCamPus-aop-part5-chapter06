package com.jkj.fastcampus_aop_part5_chapter06.di

import com.jkj.fastcampus_aop_part5_chapter06.data.api.SweetTrackerApi
import com.jkj.fastcampus_aop_part5_chapter06.data.db.AppDatabase
import com.jkj.fastcampus_aop_part5_chapter06.data.repository.TrackingItemRepository
import com.jkj.fastcampus_aop_part5_chapter06.data.repository.TrackingItemRepositoryImpl
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val appModule = module {

    single { Dispatchers.IO }

    // Database
    single { AppDatabase.build(androidApplication()) }
    single { get<AppDatabase>().trackingItemDao() }

    // Api
    single {
        OkHttpClient()
            .newBuilder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = if (BuildConfig.DEBUG) {
                        // debug 모드일때는 전부 다 찍고
                        HttpLoggingInterceptor.Level.BODY
                    }else {
                        // release 모드일때는 아무것도 찍지 않는다.
                        HttpLoggingInterceptor.Level.NONE
                    }
                }
            )
            .build()
    }
    single<SweetTrackerApi> {
        Retrofit.Builder().baseUrl(com.jkj.fastcampus_aop_part5_chapter06.data.api.Url.SWEET_TRACKER_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
            .create()
    }

    // Repository
    single<TrackingItemRepository> { TrackingItemRepositoryImpl(get(), get(), get()) }


}