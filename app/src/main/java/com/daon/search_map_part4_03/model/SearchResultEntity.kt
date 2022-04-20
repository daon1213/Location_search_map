package com.daon.search_map_part4_03.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val fullAdress: String,
    val buildingName: String,
    val locationLatLng: LocationLatLngEntity
): Parcelable
