package com.jkj.fastcampus_aop_part5_chapter06.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ShippingCompany(
    @PrimaryKey
    val code: String,
    val international: String,
    val name: String
)

