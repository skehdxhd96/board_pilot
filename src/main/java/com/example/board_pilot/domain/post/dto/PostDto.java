package com.example.board_pilot.domain.post.dto;

import lombok.Data;

import java.time.LocalDateTime;

public class PostDto {

    @Data
    public static class GET {

        private String title;
        private String content;
        private String authorName;
        private long viewCnt;
        private LocalDateTime createdTime;
        private LocalDateTime modifiedTime;
    }

    @Data
    public static class CREATE {

        private String title;
        private String content;
        private Long authorId;
    }

    @Data
    public static class PUT {

        private String title;
        private String content;
        private Long authorId;
    }
}
