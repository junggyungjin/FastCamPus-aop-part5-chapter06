package com.jkj.fastcampus_aop_part5_chapter06.data.api

import com.jkj.fastcampus_aop_part5_chapter06.BuildConfig
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingInfomation
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SweetTrackerApi {

    @GET("api/v1/trackingInfo?t_key=${BuildConfig.SWEET_TRACKER_API_KEY}")
    suspend fun getTrackingInformation(
        @Query("t_code") companyCode: String,
        @Query("t_invoice") invoice: String
    ): Response<TrackingInfomation>

    @GET("api/v1/companylist?t_key=${BuildConfig.SWEET_TRACKER_API_KEY}")
    suspend fun getShippingCompanies(): Response<ShippingCompanies>

    @GET("api/v1/recommend?t_key=${BuildConfig.SWEET_TRACKER_API_KEY}")
    suspend fun getRecommendShippingCompanies(
        @Query("t_invoice") invoice: String
    ): Response<ShippingCompanies>
}