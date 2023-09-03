package com.jkj.fastcampus_aop_part5_chapter06.presentation.trackingitems

import com.jkj.fastcampus_aop_part5_chapter06.presentation.BasePresenter
import com.jkj.fastcampus_aop_part5_chapter06.presentation.BaseView

class TrackingItemsContract {

    interface View: BaseView<Presenter> {

    }

    interface Presenter : BasePresenter {

    }
}