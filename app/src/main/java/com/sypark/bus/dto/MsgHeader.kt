package com.sypark.bus.dto

import com.google.gson.annotations.SerializedName

data class MsgHeader(
    @SerializedName("headerMsg")
    var headerMsg: String? = null,

    @SerializedName("headerCd")
    var headerCd: String? = null,

    @SerializedName("itemCount")
    var itemCount: Int? = null
)
