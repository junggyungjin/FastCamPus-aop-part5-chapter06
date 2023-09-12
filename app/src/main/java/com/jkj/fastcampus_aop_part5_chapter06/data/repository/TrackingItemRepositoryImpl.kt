package com.jkj.fastcampus_aop_part5_chapter06.data.repository

import com.jkj.fastcampus_aop_part5_chapter06.data.api.SweetTrackerApi
import com.jkj.fastcampus_aop_part5_chapter06.data.db.TrackingItemDao
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingInfomation
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class TrackingItemRepositoryImpl(
    private val trackerApi: SweetTrackerApi,
    private val trackingItemDao: TrackingItemDao,
    private val dispatcher: CoroutineDispatcher
): TrackingItemRepository {

    override suspend fun getTrackingItemInformation(): List<Pair<TrackingItem, TrackingInfomation>> = withContext(dispatcher) {
        trackingItemDao.getAll()
            .mapNotNull { trackingItem ->
                val releatedTrackingInfo = trackerApi.getTrackingInformation(
                    trackingItem.company.code,
                    trackingItem.invoice
                ).body()

                if (releatedTrackingInfo?.invoiceNo.isNullOrBlank()) {
                    null
                }else {
                    trackingItem to releatedTrackingInfo!! // 코틀린 문법 A to B -> Pair로 반환해줌
                }
            }
            .sortedWith(
                compareBy(
                    {it.second.level},
                    {-(it.second.lastDetail?.time ?: Long.MAX_VALUE)}
                )
            )

    }
}