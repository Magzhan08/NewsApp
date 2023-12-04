package com.loc.newsapp.presentation.search

sealed class SearchEvent {

    data class UpdataSearchQuery(val searchQuery: String): SearchEvent()


    object SearchNews : SearchEvent()

}