package com.ejerciciomiblog.blogApp.Service;

import com.ejerciciomiblog.blogApp.Model.Post;
import java.util.List;

public interface PostService {
    List<Post> listarPosts();
    Post crearPost(Post post);
    Post editarPost(Long id, Post post);
    void eliminarPost(Long id);
}
