package com.sypark.bus

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sypark.bus.base.BaseFragment
import com.sypark.bus.databinding.FragmentSearchBusBinding
import com.sypark.bus.dto.ItemList
import com.sypark.bus.network.RetrofitClient
import com.sypark.bus.viewmodel.SearchViewModel
import kotlinx.coroutines.launch


class SearchBusFragment : BaseFragment<FragmentSearchBusBinding>(R.layout.fragment_search_bus) {
    private val searchViewModel: SearchViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.searchViewModel = searchViewModel
        var busList: ArrayList<ItemList>?
        binding.searchViewModel!!.busNumber.observe(requireActivity()) {
            if (it.isNotEmpty()) {
                lifecycleScope.launch {
                    runCatching {
                        RetrofitClient.instanceDynamic().requestGetBusRouteList(
                            it
                        )
                    }.onSuccess {
                        busList = Gson().fromJson(
                            it.msgBody?.itemList,
                            object : TypeToken<ArrayList<ItemList>>() {}.type
                        )
                        Log.e("!!", busList?.size.toString())
                    }.onFailure {
                        Log.e("!!!!", it.toString())
                    }
                }
            }
        }
    }
}