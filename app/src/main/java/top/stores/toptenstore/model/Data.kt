package top.stores.toptenstore.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("address")
    val address: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("latitude")
    val latitude: String,
    @SerializedName("longitude")
    val longitude: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("storeID")
    val storeID: String,
    @SerializedName("storeLogoURL")
    val storeLogoURL: String,
    @SerializedName("zipcode")
    val zipcode: String
)