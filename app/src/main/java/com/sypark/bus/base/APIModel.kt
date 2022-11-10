package com.sypark.bus.base

import com.google.gson.annotations.SerializedName
import com.sypark.bus.dto.MsgBody
import com.sypark.bus.dto.MsgHeader

data class APIModel(
    @SerializedName("msgHeader")
    var msgHeader: MsgHeader? = MsgHeader(),

    @SerializedName("msgBody")
    var msgBody: MsgBody? = MsgBody()
)