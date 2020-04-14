package com.github.simple.notes.model

import java.util.*

class TextHistory {
    var position = 0
    val history = LinkedList<TextHistoryItem>()

    fun getPrevious(): TextHistoryItem? {
        if (position == 0) {
            return null;
        }

        return history[--position]
    }

    fun getNext(): TextHistoryItem? {
        if (position >= history.size) {
            return null
        }

        return history[position++];
    }

    fun add(item: TextHistoryItem) {
        while (history.size > position) {
            history.removeLast()
        }

        history.add(item);
        position++
    }
}