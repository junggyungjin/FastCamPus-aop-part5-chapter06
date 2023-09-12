package com.jkj.fastcampus_aop_part5_chapter06.data.repository

import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingInfomation
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingItem

interface TrackingItemRepository {

    suspend fun getTrackingItemInformation(): List<Pair<TrackingItem, TrackingInfomation>>
}