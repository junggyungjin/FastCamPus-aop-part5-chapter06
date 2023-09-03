package com.jkj.fastcampus_aop_part5_chapter06.presentation.addtrackingitem

import com.jkj.fastcampus_aop_part5_chapter06.presentation.BasePresenter
import com.jkj.fastcampus_aop_part5_chapter06.presentation.BaseView

class AddTrackingItemsContract {

    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter {

    }
}