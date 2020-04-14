package com.github.simple.notes.model

data class TextHistoryItem(
        var start: Int,
        var before: CharSequence?,
        var aftr: CharSequence?) {
}