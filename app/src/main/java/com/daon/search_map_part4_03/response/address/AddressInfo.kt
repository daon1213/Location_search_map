package com.daon.search_map_part4_03.response.address

data class AddressInfo(
    val fullAddress: String?,
    val addressKey: String,
    val roadAddressKey: String,
    val addressType: String,
    val cityDo: String,
    val guGun: String,
    val eupMyun: String,
    val adminDong: String,
    val adminDongCode: String,
    val legalDong: String,
    val legalDongCode: String,
    val ri: String,
    val roadName: String,
    val buildingIndex: String,
    val buildingName: String,
    val mappingDistance: String,
    val roadCode: String
)