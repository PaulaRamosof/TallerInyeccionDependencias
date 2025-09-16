package com.ejerciciomiblog.blogApp.service;

import com.ejerciciomiblog.blogApp.model.Comment;
import java.util.List;

public interface CommentService {
    List<Comment> getComments(Long postId);
    Comment addComment(Long postId, Comment comment);
}
