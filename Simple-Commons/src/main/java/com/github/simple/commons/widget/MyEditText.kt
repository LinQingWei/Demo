package com.github.simple.commons.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import com.github.simple.commons.extension.adjustAlpha
import com.github.simple.commons.extension.applyColorFilter

class MyEditText : AppCompatEditText {

    constructor(context: Context?) : super(context!!)

    constructor(context: Context?, attrs: AttributeSet?) : super(context!!, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int)
            : super(context!!, attrs, defStyleAttr)

    fun setColors(textColor: Int, accentColor: Int, backgroundColor: Int) {
        background?.mutate()?.applyColorFilter(accentColor)

        // requires android:textCursorDrawable="@null" in xml to color the cursor too
        setTextColor(textColor)
        setHintTextColor(textColor.adjustAlpha(0.5f))
        setLinkTextColor(accentColor)
    }
}
