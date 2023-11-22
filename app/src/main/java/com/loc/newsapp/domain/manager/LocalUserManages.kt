package com.loc.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManages {

    suspend fun saveAppEntry()

    fun readAppEntry(): Flow<Boolean>

}