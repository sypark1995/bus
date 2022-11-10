package com.sypark.bus.dto

import com.google.gson.annotations.SerializedName

data class ItemList(
    // 노선ID
    @SerializedName("busRouteId")
    var busRouteId: String? = null,

    // 노선명
    @SerializedName("busRouteNm")
    var busRouteNm: String? = null,

    // 노선유형 (1:공항, 2:마을, 3:간선, 4:지선, 5:순환, 6:광역, 7:인천, 8:경기, 9:폐지, 0:공용)
    @SerializedName("routeType")
    var routeType: String? = null,
//
//    @SerializedName("busRouteAbrv")
//    var busRouteAbrv: String? = null,
//
//    @SerializedName("length")
//    var length: String? = null,
//
//    @SerializedName("stStationNm")
//    var stStationNm: String? = null,
//
//    @SerializedName("edStationNm")
//    var edStationNm: String? = null,
//
//    @SerializedName("term")
//    var term: String? = null,
//
//    @SerializedName("lastBusYn")
//    var lastBusYn: String? = null,
//
//    @SerializedName("lastBusTm")
//    var lastBusTm: String? = null,
//
//    @SerializedName("firstBusTm")
//    var firstBusTm: String? = null,
//
//    @SerializedName("lastLowTm")
//    var lastLowTm: String? = null,
//
//    @SerializedName("firstLowTm")
//    var firstLowTm: String? = null,
//
//    @SerializedName("corpNm")
//    var corpNm: String? = null
)