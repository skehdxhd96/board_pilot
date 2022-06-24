package com.example.board_pilot.presentation.user;

import com.example.board_pilot.application.UserService;
import com.example.board_pilot.domain.user.dto.LoginDto;
import com.example.board_pilot.domain.user.dto.SignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public LoginDto.RESPONSE login(@RequestBody LoginDto.REQUEST loginDto) {

        return new LoginDto.RESPONSE();
    }

    @PostMapping("/signUp")
    public SignUpDto.RESPONSE signUp(@RequestBody SignUpDto.REQUEST signUpDto) {

        return new SignUpDto.RESPONSE();
    }
}
