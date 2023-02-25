package com.reza.tugasdicoding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Currency(
    val img: Int,
    val nama: String,
    val desc: String,
    val price: Double,
    val totalSupply: Double,
    val marketCap: Double
) : Parcelable
