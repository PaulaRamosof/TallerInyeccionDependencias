package com.ejerciciomiblog.blogApp.service;

import com.ejerciciomiblog.blogApp.model.Post;
import com.ejerciciomiblog.blogApp.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository repo;

    public PostServiceImpl(PostRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Post> listarPosts() {
        return repo.findAll();
    }

    @Override
    public Post crearPost(Post post) {
        return repo.save(post);
    }

    @Override
    public Post editarPost(Long id, Post post) {
        Post existente = repo.findById(id).orElseThrow();
        existente.setTitulo(post.getTitulo());
        existente.setContenido(post.getContenido());
        return repo.save(existente);
    }

    @Override
    public void eliminarPost(Long id) {
        repo.deleteById(id);
    }
}
