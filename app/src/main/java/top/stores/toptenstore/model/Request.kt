package top.stores.toptenstore.model


import com.google.gson.annotations.SerializedName

data class Request(
    @SerializedName("stores")
    val stores: List<Data>
)