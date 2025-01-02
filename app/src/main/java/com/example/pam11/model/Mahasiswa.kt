package com.example.pam11.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class AllMahasiswaRespons (
    val status: Boolean,
    val message: String,
    val data: List<Mahasiswa>
)

@Serializable
data class Mahasiswa (
    val nim: String,
    val nama: String,
    val alamat: String,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String,

    val kelas: String,
    val angkatan: String
)

