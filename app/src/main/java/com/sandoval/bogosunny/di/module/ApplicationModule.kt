package com.sandoval.bogosunny.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.sandoval.bogosunny.BogoSunnyApplication
import com.sandoval.bogosunny.data.AppApiHelper
import com.sandoval.bogosunny.data.AppDataManager
import com.sandoval.bogosunny.data.Config
import com.sandoval.bogosunny.data.DataManager
import com.sandoval.bogosunny.data.db.AppDbHelper
import com.sandoval.bogosunny.data.db.DbHelper
import com.sandoval.bogosunny.data.db.room.AppDataBase
import com.sandoval.bogosunny.data.network.ApiHelper
import com.sandoval.bogosunny.di.ApplicationContext
import com.sandoval.bogosunny.di.BaseUrl
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(bogoSunnyApplication: BogoSunnyApplication): Context {
        return bogoSunnyApplication.applicationContext
    }

    @Provides
    internal fun provideApplication(bogoSunnyApplication: BogoSunnyApplication): Application {
        return bogoSunnyApplication
    }

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): AppDataBase {
        return Room.databaseBuilder(context, AppDataBase::class.java, Config.DB_NAME).build()
    }

    @Provides
    @BaseUrl
    internal fun provideBaseUrl(): String {
        return Config.BASE_URL
    }

    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }
}