package com.example.board_pilot.domain.comment.dto;

import lombok.Data;

import java.time.LocalDateTime;

public class CommentDto {

    @Data
    public static class GET {

        private String content;
        private String authorName;
        private LocalDateTime createdTime;
        private LocalDateTime modifiedTime;
    }

    @Data
    public static class CREATE {

        private String content;
        private Long authorId;
    }

    @Data
    public static class PUT {

        private String content;
        private Long authorId;
    }
}
