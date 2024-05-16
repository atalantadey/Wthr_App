package com.ardent.wthr.models
import com.google.gson.annotations.SerializedName
data class Location(
    @SerializedName("Version")
    val version:Int,
    @SerializedName("Key")
    val key:Int,
    @SerializedName("Type")
    val type:String,
    @SerializedName("Rank")
    val rank:Int,
    @SerializedName("LocalizedName")
    val localizedName:String,
    @SerializedName("EnglishName")
    val englishName:String,
    @SerializedName("PrimaryPostalCode")
    val primarypostalcode:String,
    @SerializedName("Region")
    val region:Name,
    @SerializedName("Country")
    val country:Name,
    @SerializedName("TimeZone")
    val timeZone: TimeZone,
    @SerializedName("GeoPosition")
    val getPosition: Position,
    @SerializedName("isAlias")
    val isAlias:Boolean
)
data class Position(
    @SerializedName("Latitude")
    val latitude:Double,
    @SerializedName("longitude")
    val longitude:Double,
    @SerializedName("Elevation")
    val elevation: Elevation
)
data class Elevation(
    @SerializedName("Metric")
    val metric:Value,
    @SerializedName("Imperial")
    val imperial:Value
)
data class Value(
    @SerializedName("Value")
    val value:Double,
    @SerializedName("Unit")
    val unit:String,
    @SerializedName("UnitType")
    val unitType:Int,
)
data class Name(
    @SerializedName("ID")
    val id:String,
    @SerializedName("LocalizedName")
    val localizedName: String,
    @SerializedName("EnglishName")
    val englishname: String,
)
data class TimeZone(
    @SerializedName("Code")
    val code:String,
    @SerializedName("name")
    val name:String,
    @SerializedName("GmtOffset")
    val gmtOffset:Double,
    @SerializedName("IsDayLightSaving")
    val isdaylightsaving:Boolean,
    @SerializedName("NextOffsetChange")
    val nextoffsetChange:String?
)