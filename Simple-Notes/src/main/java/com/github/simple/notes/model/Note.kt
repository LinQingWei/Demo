package com.github.simple.notes.model

import java.io.File
import java.io.FileNotFoundException

data class Note(
        var id: Long?,
        var title: String,
        var value: String,
        var type: Int,
        var path: String = "") {

    fun getNoteStoredValue(): String? {
        return if (path.isNotEmpty()) {
            try {
                File(path).readText()
            } catch (e: FileNotFoundException) {
                null
            }
        } else {
            value
        }
    }
}