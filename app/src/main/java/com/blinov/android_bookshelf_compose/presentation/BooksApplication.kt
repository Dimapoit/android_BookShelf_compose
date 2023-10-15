package com.blinov.android_bookshelf_compose.presentation

import android.app.Application
import com.blinov.android_bookshelf_compose.data.AppContainer
import com.blinov.android_bookshelf_compose.data.DefaultAppContainer

class BooksApplication: Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}