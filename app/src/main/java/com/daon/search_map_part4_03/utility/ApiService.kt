package com.daon.search_map_part4_03.utility

import com.daon.search_map_part4_03.Key
import com.daon.search_map_part4_03.Url
import com.daon.search_map_part4_03.response.address.AddressInfoResponse
import com.daon.search_map_part4_03.response.search.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface ApiService {

    @GET(Url.GET_TMAP_LOCATION)
    suspend fun getSearchLocation(
        @Header("appKey") appKey: String = Key.TMAP_API,
        @Query("version") version: Int = 1,
        @Query("count") count: Int = 30,
        @Query("searchKeyword") keyword: String? = null
    ): Response<SearchResponse>

    @GET(Url.GET_TMAP_REVERSE_GEO_CODE)
    suspend fun getReverseGeoCode(
        @Header("appKey") appKey: String = Key.TMAP_API,
        @Query("version") version: Int = 1,
        @Query("callback") callback: String? = null,
        @Query("lat") lat: Double,
        @Query("lon") lon: Double
    ): Response<AddressInfoResponse>
}