package com.sypark.bus.network

import com.sypark.bus.BuildConfig
import com.sypark.bus.base.APIModel
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    /**
     * strSrch 값을 포함하는 노선 검색
     */
    @GET("getBusRouteList")
    suspend fun requestGetBusRouteList(
        @Query("strSrch") redirect_uri: String,
        @Query("ServiceKey") client_id: String = BuildConfig.SERVICE_KEY,
        @Query("resultType") response_type: String = "json"
    ): APIModel
}