package com.trinitydigital.navcontroller

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginData(
    val login: String,
    val password: String
) : Parcelable