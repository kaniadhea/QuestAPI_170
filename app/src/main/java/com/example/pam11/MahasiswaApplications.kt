package com.example.pam11

import android.app.Application
import com.example.pam11.container.AppContainer
import com.example.pam11.container.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}