package com.example.jobbin.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelStatus(
    var imageStatus : Int = 0,
    var judulStatus : String? = null,
    var keteranganStatus : String? = null,
    var statusStatus : String? = null,
    var alamatStatus : String? = null,
    var waktuStatus : String? = null
) : Parcelable
