package com.jkj.fastcampus_aop_part5_chapter06.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jkj.fastcampus_aop_part5_chapter06.entity.TrackingItem

@Dao
interface TrackingItemDao {

    @Query("SELECT * FROM TrackingItem")
    suspend fun getAll(): List<TrackingItem>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: TrackingItem)
}