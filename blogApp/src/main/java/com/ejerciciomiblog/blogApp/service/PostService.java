package com.ejerciciomiblog.blogApp.service;

import com.ejerciciomiblog.blogApp.model.Post;
import java.util.List;

public interface PostService {
    List<Post> listarPosts();
    Post crearPost(Post post);
    Post editarPost(Long id, Post post);
    void eliminarPost(Long id);
}
