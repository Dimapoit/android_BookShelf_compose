package com.blinov.android_bookshelf_compose

import com.google.gson.annotations.SerializedName


data class BookShelf (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)