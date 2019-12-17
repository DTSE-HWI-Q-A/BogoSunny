package com.sandoval.bogosunny.data.network.model.forecast

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Forecast (
    @SerializedName("cod")
    @Expose
    var cod: String? = null,
    @SerializedName("message")
    @Expose
    var message: Double? = null,
    @SerializedName("cnt")
    @Expose
    var cnt: Long? = null,
    @SerializedName("list")
    @Expose
    var list: List<ListL>? = null,
    @SerializedName("city")
    @Expose
    var city: City? = null
)