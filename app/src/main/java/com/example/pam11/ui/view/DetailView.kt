package com.example.pam11.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pam11.model.Mahasiswa
import com.example.pam11.ui.navigasi.DestinasiNavigasi

object DestinasiDetail : DestinasiNavigasi{
    override val route = "detail"
    const val NIM = "nim"
    val routeWithArg = "$route/{$NIM}"
    override val titleRes = "Detail Mhs"
}

@Composable
fun ItemDetail(
    mahasiswa : Mahasiswa
){
    Card
}



@Composable
fun ComponetDetail(
    judul: String,
    isinya: String
){
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ){
        Text(
            text = "$judul :",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Text(
            text = isinya,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
