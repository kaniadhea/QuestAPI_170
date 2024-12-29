package com.example.pam11.ui.view

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pam11.model.Mahasiswa

@Composable
fun MhsCard(
    mahasiswa:Mahasiswa,
    modifier: Modifier = Modifier,
    onDeleteClick:(Mahasiswa)-> Unit = {}
){
    Card(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {

    }
}