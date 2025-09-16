package com.ejerciciomiblog.blogApp.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ejerciciomiblog.blogApp.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

import com.ejerciciomiblog.blogApp.model.Author;


@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepo;

    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    public Author saveAuthor(Author author) {
        return authorRepo.save(author);
    }
}
