package com.github.simple.commons.extension

import android.graphics.Color
import kotlin.math.roundToInt

fun Int.adjustAlpha(factor: Float): Int {
    val alpha = (Color.alpha(this) * factor).roundToInt();
    val red = Color.red(this);
    val green = Color.green(this);
    val blue = Color.blue(this);

    return Color.argb(alpha, red, green, blue);
}