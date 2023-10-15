package com.blinov.android_bookshelf_compose.data

import com.blinov.android_bookshelf_compose.network.model.BookService

class BooksRepositoryImpl(
    private val bookService: BookService
) : BooksRepository {

    override suspend fun getBooks(query: String, maxResult: Int): List<Book> {
        return bookService.bookSearch(query, maxResult).items.map { items ->
            Book(
                title = items.volumeInfo?.title,
                previewLink = items.volumeInfo?.previewLink,
                imageLink = items.volumeInfo?.imageLinks?.thumbnail
            )
        }
    }
}