package com.example.board_pilot.presentation.comment;

import com.example.board_pilot.application.CommentService;
import com.example.board_pilot.domain.comment.dto.CommentDto;
import com.example.board_pilot.domain.common.dto.CommonResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping
    public CommonResDto<List<CommentDto.GET>> getAllComment() {

        return new CommonResDto<List<CommentDto.GET>>();
    }

    @GetMapping("/{id}")
    public CommentDto.GET getComomentDetail(@PathVariable Long id) {

        return new CommentDto.GET();
    }

    @PostMapping
    public CommentDto.GET saveComment(@RequestBody CommentDto.CREATE commentDto) {

        return new CommentDto.GET();
    }

    @PutMapping("/{id}")
    public CommentDto.GET editComment(@PathVariable Long id, @RequestBody CommentDto.PUT commentDto) {

        return new CommentDto.GET();
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {

    }
}
