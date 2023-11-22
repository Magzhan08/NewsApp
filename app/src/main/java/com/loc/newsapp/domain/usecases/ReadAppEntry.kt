package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manager.LocalUserManages
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManages: LocalUserManages
) {

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManages.readAppEntry()
    }

}