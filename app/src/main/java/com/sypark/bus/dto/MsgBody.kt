package com.sypark.bus.dto

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class MsgBody(
    @SerializedName("itemList")
    var itemList: JsonElement? = null
)

