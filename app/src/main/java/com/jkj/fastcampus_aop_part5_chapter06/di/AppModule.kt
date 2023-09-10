package com.jkj.fastcampus_aop_part5_chapter06.di

import com.jkj.fastcampus_aop_part5_chapter06.db.AppDatabase
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {

    single { Dispatchers.IO }

    single { AppDatabase.build(androidApplication()) }
    single { get<AppDatabase>().trackingItemDao() }

}