package com.example.pertemuan6navigation.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.pertemuan6navigation.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.alamat),"Yogyakarta"),
    )

}