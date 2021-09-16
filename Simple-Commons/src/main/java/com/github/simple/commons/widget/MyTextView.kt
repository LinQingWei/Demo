package com.github.simple.commons.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MyTextView : AppCompatTextView {

    constructor(context: Context?) : super(context!!)

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context!!, attrs, defStyleAttr)

    fun setColors(textColor: Int, accentColor: Int) {
        setTextColor(textColor)
        setLinkTextColor(accentColor)
    }
}