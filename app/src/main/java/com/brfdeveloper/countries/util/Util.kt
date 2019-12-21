package com.brfdeveloper.countries.util

import android.content.Context
import android.support.v4.widget.CircularProgressDrawable
import android.widget.ImageView
import com.brfdeveloper.countries.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 3f
        centerRadius = 10f
        start()
    }
}

fun ImageView.loadImage(uri: String?, progressDrawable: CircularProgressDrawable){
    val option = RequestOptions()
        .placeholder(progressDrawable)
        .error(R.mipmap.ic_launcher_round)

    Glide.with(this.context)
        .applyDefaultRequestOptions(option)
        .load(uri)
        .into(this)
}