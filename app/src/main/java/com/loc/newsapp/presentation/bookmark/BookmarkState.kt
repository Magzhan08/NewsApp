package com.loc.newsapp.presentation.bookmark

import com.loc.newsapp.domain.model.Article

data class BookmarkState (
    val article: List<Article> = emptyList()
)