package com.github.simple.commons.extension

import android.graphics.PorterDuff
import android.widget.ImageView

fun ImageView.applyColorFilter(color: Int) = setColorFilter(color, PorterDuff.Mode.SRC_IN)