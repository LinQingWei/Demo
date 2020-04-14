package com.github.simple.notes.adapter

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.github.simple.notes.fragment.ChecklistFragment
import com.github.simple.notes.fragment.NoteFragment
import com.github.simple.notes.fragment.TextNoteFragment
import com.github.simple.notes.helper.NOTE_ID
import com.github.simple.notes.helper.NoteType
import com.github.simple.notes.model.Note

class NotesPagerAdapter(fm: FragmentManager, val notes: List<Note>, val activity: Activity)
    : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private var fragments: HashMap<Int, NoteFragment> = LinkedHashMap()

    override fun getCount() = notes.size

    override fun getItem(position: Int): NoteFragment {
        val bundle = Bundle()
        val note = notes[position]
        val id = note.id
        if (id != null) {
            bundle.putLong(NOTE_ID, id)
        }

        if (fragments.containsKey(position)) {
            return fragments[position]!!
        }

        val fragment = if (note.type == NoteType.TYPE_TEXT.value) {
            TextNoteFragment()
        } else {
            ChecklistFragment()
        }
        fragment.arguments = bundle
        fragments[position] = fragment
        return fragment
    }

    override fun getPageTitle(position: Int) = notes[position].title

    fun updateCurrentNoteData(position: Int, path: String, value: String) {
        (fragments[position] as? TextNoteFragment)?.apply {
            
        }
    }
}