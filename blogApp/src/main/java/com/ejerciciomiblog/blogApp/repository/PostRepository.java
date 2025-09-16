package com.ejerciciomiblog.blogApp.repository;

import com.ejerciciomiblog.blogApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

