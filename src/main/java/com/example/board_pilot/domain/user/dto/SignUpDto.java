package com.example.board_pilot.domain.user.dto;

import lombok.Data;

public class SignUpDto {

    @Data
    public static class REQUEST {

        private String loginId;
        private String password;
    }

    @Data
    public static class RESPONSE {

        private String nickname;
    }
}
