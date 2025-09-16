package com.ejerciciomiblog.blogApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ejerciciomiblog.blogApp.model.Author;


 public interface AuthorRepository extends JpaRepository<Author, Long> {}



