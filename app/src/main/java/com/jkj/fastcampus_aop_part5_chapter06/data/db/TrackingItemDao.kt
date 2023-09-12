package com.jkj.fastcampus_aop_part5_chapter06.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingItem

@Dao
interface TrackingItemDao {

    @Query("SELECT * FROM TrackingItem")
    suspend fun getAll(): List<TrackingItem>

    @Insert(onConflict = OnConflictStrategy.IGNORE) // 이미 저장되어있으면 저장하지 않는다.
    suspend fun insert(item: TrackingItem)
}