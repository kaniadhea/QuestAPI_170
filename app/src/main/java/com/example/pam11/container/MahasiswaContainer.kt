package com.example.pam11.container

import com.example.pam11.Repository.MahasiswaRepository
import kotlinx.serialization.json.Json

interface AppContainer{
    val kontakRepository:MahasiswaRepository
}

class MahasiswaContainer: AppContainer {

    private val baseUrl= ""
    private val json = Json { ignoreUnknownKeys = true }

}