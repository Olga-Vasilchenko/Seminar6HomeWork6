package com.example.Seminar11HomeWork11.repositories;

import com.example.Seminar11HomeWork11.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с базой данных
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    /**
     * Метод получения списка заметок по статусу
     * @param id - id заметки
     * @return - возвращает заметку
     */
//    Optional<Note> findById(Long id);

}
