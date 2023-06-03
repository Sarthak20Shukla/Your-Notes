package com.example.cleanarchitecturenotesapp.feature_note.domain.use_case

import androidx.room.Delete
import com.example.cleanarchitecturenotesapp.feature_note.domain.model.Note

data class NoteUSeCase(
    val getNotes : GetNotesUseCase,
    val deleteNote: DeleteoteUseCase,
    val addNote: AddNote,
    val getNote: GetNote
)
