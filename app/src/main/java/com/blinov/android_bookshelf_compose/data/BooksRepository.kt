package com.blinov.android_bookshelf_compose.data

interface BooksRepository {

    suspend fun getBooks(query: String, maxResult: Int): List<Book>
}