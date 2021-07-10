package com.viniciusp.listapets

import android.graphics.drawable.Drawable

data class Pet(
    var foto: Drawable?=null,
    var nome: String,
    var raca: String
)
