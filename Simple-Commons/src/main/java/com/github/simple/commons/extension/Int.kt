package com.github.simple.commons.extension

import android.graphics.Color
import kotlin.math.roundToInt

fun Int.getContrastColor(): Int {
    val DARK_GREY = 0xFF333333.toInt()
    val y = (299 * Color.red(this) + 587 * Color.green(this) + 114 * Color.blue(this)) / 1000
    return if (y >= 149 && this != Color.BLACK) DARK_GREY else Color.WHITE
}

fun Int.adjustAlpha(factor: Float): Int {
    val alpha = (Color.alpha(this) * factor).roundToInt();
    val red = Color.red(this);
    val green = Color.green(this);
    val blue = Color.blue(this);

    return Color.argb(alpha, red, green, blue);
}