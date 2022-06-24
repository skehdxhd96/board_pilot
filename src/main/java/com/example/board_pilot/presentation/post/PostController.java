package com.example.board_pilot.presentation.post;

import com.example.board_pilot.application.PostService;
import com.example.board_pilot.domain.common.dto.CommonResDto;
import com.example.board_pilot.domain.post.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public CommonResDto<List<PostDto.GET>> getAllPost() {

        return new CommonResDto<List<PostDto.GET>>();
    }

    @GetMapping("/{id}")
    public PostDto.GET getPostDetail(@PathVariable Long id) {

        return new PostDto.GET();
    }

    @PostMapping
    public PostDto.GET savePost(@RequestBody PostDto.CREATE postDto) {

        return new PostDto.GET();
    }

    @PutMapping("/{id}")
    public PostDto.GET editPost(@PathVariable Long id, @RequestBody PostDto.PUT postDto) {

        return new PostDto.GET();
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {

    }
}
