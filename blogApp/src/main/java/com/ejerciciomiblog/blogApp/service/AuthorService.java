package com.ejerciciomiblog.blogApp.service;
import java.util.List;
import com.ejerciciomiblog.blogApp.model.Author;


public interface AuthorService {
    List<Author> getAllAuthors();
    Author saveAuthor(Author author);
}
