package com.blinov.android_bookshelf_compose.data

import com.blinov.android_bookshelf_compose.network.model.BookService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {


}

class DefaultAppContainer(): AppContainer {

    private val BASE_URL = "https://www.googleapis.com/books/v1/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val bookService: BookService by lazy { retrofit.create(BookService::class.java) }
}