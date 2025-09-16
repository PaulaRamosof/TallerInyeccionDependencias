package com.ejerciciomiblog.blogApp.model;

import jakarta.persistence.*;

import java.util.List;


@Entity //le dice a JPA que esta clase se debe guardar como una tabla
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Definen la clase primaria
    private Long id;

    @ManyToOne
    private Author author;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    private String titulo;
    private String contenido;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


}
