package com.example.board_pilot.domain.common.dto;

import lombok.Data;

@Data
public class CommonResDto<T> {

    private int count;
    private T data;
}
