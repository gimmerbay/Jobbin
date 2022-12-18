package com.example.jobbin.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelJobs(
    var imageJobs : Int = 0,
    var judulJobs : String? = null,
    var keteranganJobs : String? = null,
    var jamJobs : String? = null,
    var alamatJobs : String? = null,
    var waktuJobs : String? = null
) : Parcelable
