package com.github.simple.notes.fragment

import android.os.Bundle
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.simple.notes.R
import com.github.simple.notes.helper.MyMovementMethod
import com.github.simple.notes.helper.NOTE_ID
import com.github.simple.notes.model.Note
import com.github.simple.notes.model.TextHistory
import com.github.simple.notes.model.TextHistoryItem
import kotlinx.android.synthetic.main.fragment_text_note.view.*
import kotlinx.android.synthetic.main.note_view_static.view.*

class TextNoteFragment : NoteFragment() {
    private val TEXT = "text";

    private var testHistory = TextHistory();
    private var isUndoOrRedo = false
    private var skipTextUpdating = false
    private var noteId = 0L
    private var note: Note? = null

    lateinit var view: ViewGroup

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        view = inflater.inflate(R.layout.fragment_text_note, container, false) as ViewGroup
        noteId = arguments!!.getLong(NOTE_ID, 0L);
        retainInstance = true

        inflater.inflate(R.layout.note_view_static, view.note_relative_layout, true)
        view.text_note_view.apply {
            linksClickable = true
            autoLinkMask = Linkify.WEB_URLS or Linkify.EMAIL_ADDRESSES
            movementMethod = MyMovementMethod.getInstance()
        }

        return view
    }
}