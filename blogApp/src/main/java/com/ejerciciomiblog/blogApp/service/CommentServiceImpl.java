package com.ejerciciomiblog.blogApp.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

import com.ejerciciomiblog.blogApp.model.Comment;
import com.ejerciciomiblog.blogApp.model.Post;
import com.ejerciciomiblog.blogApp.repository.PostRepository;
import com.ejerciciomiblog.blogApp.repository.CommentRepository;
import com.ejerciciomiblog.blogApp.service.CommentService;
import com.ejerciciomiblog.blogApp.repository.AuthorRepository;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final AuthorRepository authorRepository;

    public CommentServiceImpl(CommentRepository commentRepository,
                              PostRepository postRepository,
                              AuthorRepository authorRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Comment> getComments(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    @Override
    public Comment addComment(Long postId, Comment comment) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post no encontrado"));

        comment.setPost(post);
        comment.setCreatedAt(LocalDateTime.now());

        return commentRepository.save(comment);
    }
}

