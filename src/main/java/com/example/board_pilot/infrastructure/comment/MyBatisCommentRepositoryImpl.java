package com.example.board_pilot.infrastructure.comment;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyBatisCommentRepositoryImpl implements CommentRepository{

    @Override
    public List<CommentInfoDto> getAllComment(Long postId) {
        return null;
    }
}
