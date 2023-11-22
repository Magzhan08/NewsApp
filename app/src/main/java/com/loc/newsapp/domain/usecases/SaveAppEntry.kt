package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manager.LocalUserManages

class SaveAppEntry(
    private val localUserManages: LocalUserManages
) {

    suspend operator fun invoke(){
        localUserManages.saveAppEntry()
    }

}