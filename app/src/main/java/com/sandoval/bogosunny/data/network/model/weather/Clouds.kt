package com.sandoval.bogosunny.data.network.model.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Clouds  (
    @SerializedName("all")
    @Expose
    var all: Long? = null
)