package com.example.board_pilot.application;

import com.example.board_pilot.infrastructure.comment.CommentRepository;
import com.example.board_pilot.infrastructure.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
}
