package com.dk.jpa.mysql.repository;

import com.dk.jpa.mysql.entity.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note, Long> {

    List<Note> findByTitleContaining(String title);

}
