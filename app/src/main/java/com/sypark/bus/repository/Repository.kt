package com.sypark.bus.repository

import com.sypark.bus.dto.ItemList
import com.sypark.bus.network.RetrofitClient

interface Repository {

    suspend fun getBusList(busNumber: String): List<ItemList>? {
        val response = RetrofitClient.instanceDynamic().requestGetBusRouteList(busNumber)
        return response.msgBody?.itemList as ArrayList<ItemList>
    }
    suspend fun getBusList()
}