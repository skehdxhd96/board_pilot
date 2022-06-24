package com.example.board_pilot.infrastructure.comment;

import java.util.List;

public interface CommentRepository {

    public List<CommentInfoDto> getAllComment(Long postId);
}
