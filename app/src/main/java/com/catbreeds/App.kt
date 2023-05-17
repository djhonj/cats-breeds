package com.catbreeds

import android.app.Application
import com.catbreeds.data.CatRepository
import com.catbreeds.data.datasource.IRemoteData
import com.catbreeds.infraestructure.services.CatService
import com.catbreeds.usecases.GetCats
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        dependencyInjection()
    }
}

fun dependencyInjection() {
    val appModule = module {
        single<IRemoteData> { CatService() }
    }

    val dataModule = module {
        single { CatRepository(get()) }
    }

    val useCasesModule = module {
       single { GetCats(get()) }
    }

    startKoin {
        modules(listOf(dataModule, useCasesModule, appModule))
    }
}