package com.jkj.fastcampus_aop_part5_chapter06.presentation.trackingitems

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingInfomation
import com.jkj.fastcampus_aop_part5_chapter06.data.entity.TrackingItem
import com.jkj.fastcampus_aop_part5_chapter06.databinding.FragmentTrackingItemsBinding
import org.koin.android.scope.ScopeFragment

class TrackingItemsFragment : ScopeFragment(), TrackingItemsContract.View{

    override val presenter: TrackingItemsContract.Presenter by inject()

    private var binding: FragmentTrackingItemsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentTrackingItemsBinding.inflate(inflater)
        .also { binding = it }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        bindView()
        presenter.onViewCreated()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.onDestroyView()
    }

    override fun showLoadingIndicator() {

    }

    override fun hideLoadingIndicator() {
        TODO("Not yet implemented")
    }

    override fun showNoDataDescription() {
        TODO("Not yet implemented")
    }

    override fun showTrackingItemInfomation(trackingInfomation: List<Pair<TrackingItem, TrackingInfomation>>) {
        TODO("Not yet implemented")
    }

    private fun initViews() {

    }

    private fun bindView() {

    }


}