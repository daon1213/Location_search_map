package com.daon.search_map_part4_03.response.search

data class SearchPoiInfo(
    val totalCount: String,
    val count: String,
    val page: String,
    val pois: Pois
)