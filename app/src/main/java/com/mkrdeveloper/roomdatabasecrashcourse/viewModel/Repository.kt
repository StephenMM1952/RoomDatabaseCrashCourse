package com.mkrdeveloper.roomdatabasecrashcourse.viewModel

import com.mkrdeveloper.roomdatabasecrashcourse.roomDb.Note
import com.mkrdeveloper.roomdatabasecrashcourse.roomDb.NoteDatabase

class Repository(private val db : NoteDatabase) {

    suspend fun upsertNote(note: Note){
        db.dao.upsertNote(note)
    }

    suspend fun deleteNote(note: Note){
        db.dao.deleteNote(note)
    }

    fun getAllNotes() = db.dao.getAllNotes()
}