package com.example.Seminar11HomeWork11.services;

import com.example.Seminar11HomeWork11.models.Note;

import java.util.List;


/**
 * Интерфейс сервиса заметок
 */

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Long id, Note note);
    Note createNote(Note note);
    void deleteNote(Long id);
}
