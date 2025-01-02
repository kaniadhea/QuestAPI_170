package com.example.pam11.service

import com.example.pam11.model.AllMahasiswaRespons
import com.example.pam11.model.Mahasiswa
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query
import retrofit2.Response
import retrofit2.http.Path

interface MahasiswaService {

    @Headers(
        "Accept: application/json",
        "Content-Type: apllication/json",
    )

    //@GET("bacamahasiswa.php")
    @GET (".")
    suspend fun getAllMahasiswa(): AllMahasiswaRespons

    //@GET("baca1mahasiswa.php/{nim}")
    @GET("{nim}")
    suspend fun getMahasiswabyNim(@Query("nim") nim:String): Mahasiswa

    @POST(".store")
    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)

    //@PUT("editmahasiswa.php/{nim}")
    @PUT("{nim}")
    suspend fun updateMahasiswa(@Path("nim")nim: String, @Body mahasiswa: Mahasiswa)

    //@DELETE("deletemahasiswa.php/{nim}")
    @DELETE("{nim}")
    suspend fun deleteMahasiswa(@Query("nim")nim: String): Response<Void>

}