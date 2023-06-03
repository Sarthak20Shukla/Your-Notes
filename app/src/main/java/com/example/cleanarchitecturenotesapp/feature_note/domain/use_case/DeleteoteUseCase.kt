package com.example.cleanarchitecturenotesapp.feature_note.domain.use_case

import com.example.cleanarchitecturenotesapp.feature_note.domain.model.Note
import com.example.cleanarchitecturenotesapp.feature_note.domain.repository.NoteRepository

class DeleteoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}