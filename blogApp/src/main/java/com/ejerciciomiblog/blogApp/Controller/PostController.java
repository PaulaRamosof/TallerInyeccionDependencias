package com.ejerciciomiblog.blogApp.Controller;

import com.ejerciciomiblog.blogApp.Model.Post;
import com.ejerciciomiblog.blogApp.Service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService servicio;

    public PostController(PostService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Post> listar() {
        return servicio.listarPosts();
    }

    @PostMapping("/create")
    public Post crear(@RequestBody Post post) {
        return servicio.crearPost(post);
    }

    @PutMapping("/edit/{id}")
    public Post editar(@PathVariable Long id, @RequestBody Post post) {
        return servicio.editarPost(id, post);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminarPost(id);
    }
}

