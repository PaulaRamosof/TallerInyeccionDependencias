package com.ejerciciomiblog.blogApp.Repository;

import com.ejerciciomiblog.blogApp.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
