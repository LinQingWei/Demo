package com.github.simple.commons.widget

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import com.github.simple.commons.extension.applyColorFilter
import com.github.simple.commons.extension.getContrastColor
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyFloatingActionButton : FloatingActionButton {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context, attrs, defStyleAttr)

    fun setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
        backgroundTintList = ColorStateList.valueOf(accentColor)
        applyColorFilter(accentColor.getContrastColor())
    }
}