package com.jkj.fastcampus_aop_part5_chapter06

import android.app.Application
import com.jkj.fastcampus_aop_part5_chapter06.di.appModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class TrackerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(
                // 개발용일때 로그를 찍고 아닐때 로그를 찍지 않는다.
                if (BuildConfig.DEBUG) {
                    Level.DEBUG
                } else {
                    Level.NONE
                }
            )
            androidContext(this@TrackerApplication)
            modules(appModule)
        }
    }
}