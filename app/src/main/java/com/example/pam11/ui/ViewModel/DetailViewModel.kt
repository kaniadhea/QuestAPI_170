package com.example.pam11.ui.ViewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.pam11.Repository.MahasiswaRepository
import com.example.pam11.model.Mahasiswa

sealed class DetailUiState{
    data class Success(val mahasiswa: Mahasiswa): DetailUiState()
    object Error : DetailUiState()
    object Loading : DetailUiState()
}

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val mhs : MahasiswaRepository
) : ViewModel(){

}

fun Mahasiswa.toDetailUiEvent(): InsertUiEvent{
    return InsertUiEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}