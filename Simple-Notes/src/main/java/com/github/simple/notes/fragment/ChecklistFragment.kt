package com.github.simple.notes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.simple.commons.extension.hideKeyboard
import com.github.simple.notes.R
import com.github.simple.notes.helper.NOTE_ID
import com.github.simple.notes.interfaces.ChecklistItemsListener
import com.github.simple.notes.model.ChecklistItem
import com.github.simple.notes.model.Note

class ChecklistFragment : NoteFragment(), ChecklistItemsListener {
    private var noteId = 0L
    private var items = ArrayList<ChecklistItem>()
    private var note: Note? = null;

    lateinit var view: ViewGroup

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        view = inflater.inflate(R.layout.fragment_checklist, container, false) as ViewGroup
        noteId = arguments!!.getLong(NOTE_ID, 0L)

        return view
    }

    override fun onResume() {
        super.onResume()
        loadNoteById(noteId)
    }

    override fun setMenuVisibility(menuVisible: Boolean) {
        super.setMenuVisibility(menuVisible)
        activity?.hideKeyboard()
    }

    override fun refreshItems() {

    }

    override fun saveChecklist() {
    }

    private fun loadNoteById(noteId: Long) {

    }
}