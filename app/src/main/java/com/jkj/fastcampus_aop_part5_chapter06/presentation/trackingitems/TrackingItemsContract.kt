package com.jkj.fastcampus_aop_part5_chapter06.presentation.trackingitems

import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingInfomation
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingItem
import com.jkj.fastcampus_aop_part5_chapter06.presentation.BasePresenter
import com.jkj.fastcampus_aop_part5_chapter06.presentation.BaseView

class TrackingItemsContract {

    interface View: BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showNoDataDescription()

        fun showTrackingItemInfomation(trackingInfomation: List<Pair<TrackingItem, TrackingInfomation>>)

    }

    interface Presenter : BasePresenter {

        var trackingItemInfomation: List<Pair<TrackingItem, TrackingInfomation>>

        fun refresh()

    }
}