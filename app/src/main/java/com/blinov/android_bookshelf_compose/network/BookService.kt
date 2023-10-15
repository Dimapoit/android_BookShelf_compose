package com.blinov.android_bookshelf_compose.network.model

import com.blinov.android_bookshelf_compose.BookShelf
import com.blinov.android_bookshelf_compose.data.Book
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): BookShelf
}