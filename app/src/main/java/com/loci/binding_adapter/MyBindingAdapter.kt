package com.loci.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("myAge")
fun myAgeSetting(view: TextView, age: Int) {
    if (age > 20) {
        view.text = age.toString() + "보다 많음"

    } else {
        view.text = age.toString()

    }
}

@BindingAdapter("myImg")
fun myImageSetting(view: ImageView, age: Int){
    if(age>20){
        view.setImageResource(R.drawable.ic_launcher_foreground)
    }
}