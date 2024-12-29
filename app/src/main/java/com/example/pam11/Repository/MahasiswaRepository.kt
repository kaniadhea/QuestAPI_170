package com.example.pam11.Repository

import com.example.pam11.model.Mahasiswa
import com.example.pam11.service.MahasiswaService

interface MahasiswaRepository {

    suspend fun getMahasiswa(): List<Mahasiswa>

    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    suspend fun updateMahasiswa (nim: String, mahasiswa: Mahasiswa)

    suspend fun deleteMahasiswa(nim: String)

    suspend fun getMahasiswabyNim(nim: String) : Mahasiswa
}

class NetworkKontakRepository(
    private val kontakApiService: MahasiswaService
): MahasiswaRepository{
    
}