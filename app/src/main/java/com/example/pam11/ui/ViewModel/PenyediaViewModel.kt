package com.example.pam11.ui.ViewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pam11.MahasiswaApplications

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiKontak().container.mahasiswaRepository) }
        initializer { InsertViewModel(aplikasiKontak().container.mahasiswaRepository) }
        initializer { DetailViewModel(createSavedStateHandle(),aplikasiKontak().container.mahasiswaRepository) }
        initializer { UpdateViewModel(createSavedStateHandle(),aplikasiKontak().container.mahasiswaRepository) }

    }
}




fun CreationExtras.aplikasiKontak(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)

