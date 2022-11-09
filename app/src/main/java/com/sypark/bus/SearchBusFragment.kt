package com.sypark.bus

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.sypark.bus.base.BaseFragment
import com.sypark.bus.databinding.FragmentSearchBusBinding
import com.sypark.bus.viewmodel.SearchViewModel


class SearchBusFragment : BaseFragment<FragmentSearchBusBinding>(R.layout.fragment_search_bus) {
    private val searchViewModel: SearchViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.searchViewModel = searchViewModel

        binding.searchViewModel!!.busNumber.observe(requireActivity()) {
            Log.e("!!!!", it)
        }
    }
}