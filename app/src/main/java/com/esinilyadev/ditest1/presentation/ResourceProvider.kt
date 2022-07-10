package com.esinilyadev.ditest1.presentation

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

interface ResourceProvider {

    fun answerPicture(@DrawableRes drawableRes: Int): Drawable?

    class Base(private val context: Context): ResourceProvider{
        override fun answerPicture(drawableRes: Int): Drawable? {
            return context.getDrawable(drawableRes)
        }
    }

}