package com.blinov.android_bookshelf_compose.presentation

import com.blinov.android_bookshelf_compose.data.Book

sealed interface BooksUiState {
    data class Success(val bookSearch: List<Book>) : BooksUiState
    object Error : BooksUiState
    object Loading : BooksUiState
}