package com.example.testsharedviewmodel

import android.app.Application
import com.example.testsharedviewmodel.di.AppComponent
import com.example.testsharedviewmodel.di.DaggerAppComponent

class TestApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}