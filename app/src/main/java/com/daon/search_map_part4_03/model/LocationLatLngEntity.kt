package com.daon.search_map_part4_03.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationLatLngEntity(
    private val latitude: Float,
    private val longitude: Float
): Parcelable