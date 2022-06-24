package com.example.board_pilot.domain.user.dto;

import lombok.Data;

public class LoginDto {

    @Data
    public static class REQUEST {

        private String loginId;
        private String password;
        private String nickname;
    }

    @Data
    public static class RESPONSE {

        private String nickname;
    }
}
