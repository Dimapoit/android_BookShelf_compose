package com.blinov.android_bookshelf_compose.presentation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.blinov.android_bookshelf_compose.presentation.BooksUiState

@Composable
fun HomeScreen(
    booksUiState: BooksUiState,
    retryAction: () -> Unit,
    modifier: Modifier
) {
    when (booksUiState) {
        is BooksUiState.Loading -> LoadingScreen(modifier)
        is BooksUiState.Success -> BooksGridScreen(
            books = booksUiState.bookSearch,
            modifier = modifier
        )
        is BooksUiState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
}