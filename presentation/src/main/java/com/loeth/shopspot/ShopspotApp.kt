package com.loeth.shopspot

import android.app.Application
import com.loeth.data.di.dataModule
import com.loeth.domain.di.domainModule
import com.loeth.shopspot.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShopspotApp: Application() {
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@ShopspotApp)
            modules(listOf(
                presentationModule,
                dataModule,
                domainModule
            )
            )
        }
    }
}