package com.jkj.fastcampus_aop_part5_chapter06.data.entity

import com.google.gson.annotations.SerializedName

data class ShippingCompanes(

    @SerializedName("Company", alternate = ["Recommend"])
    val shippingCompanies: List<ShippingCompany>? = null
)