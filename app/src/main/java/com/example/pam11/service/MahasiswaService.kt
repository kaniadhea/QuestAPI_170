package com.example.pam11.service

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface MahasiswaService {

    @Headers(
        "Accept: application/json",
        "Content-Type: apllication/json",
    )

    @GET("bacamahasiswa.php")
    suspend fun getAllMahasiswa(): List<MahasiswaService>

    @GET("baca1mahasiswa.php/{nim}")
    suspend fun getMahasiswabyNim(@Query("nim") nim:String): MahasiswaService

    @POST("insertmahasiswa.php")
    suspend fun insertMahasiswa(@Body mahasiswaService: MahasiswaService)

    @PUT("editmahasiswa.php/{nim}")
    suspend fun updateMahasiswa(@Query("nim")nim: String, @Body)

}