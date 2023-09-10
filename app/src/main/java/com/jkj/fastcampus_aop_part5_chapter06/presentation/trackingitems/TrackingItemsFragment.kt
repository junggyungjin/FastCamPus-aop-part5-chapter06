package com.jkj.fastcampus_aop_part5_chapter06.presentation.trackingitems

import org.koin.android.scope.ScopeFragment

class TrackingItemsFragment : ScopeFragment(), TrackingItemsContract.View{
    override val presenter: TrackingItemsContract.Presenter
        get() = TODO("Not yet implemented")
}