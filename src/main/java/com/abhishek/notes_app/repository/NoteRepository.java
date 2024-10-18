package com.abhishek.notes_app.repository;


import com.abhishek.notes_app.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}