package com.jkj.fastcampus_aop_part5_chapter06.presentation.trackinghistory

import com.jkj.fastcampus_aop_part5_chapter06.presentation.BasePresenter
import com.jkj.fastcampus_aop_part5_chapter06.presentation.BaseView

class TrackingHistoryContract {

    interface View: BaseView<Presenter> {

    }

    interface Presenter : BasePresenter {

    }
}