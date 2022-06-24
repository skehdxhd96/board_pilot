package com.example.board_pilot.infrastructure.post;

import java.util.List;

public interface PostRepository {

    public List<PostInfoDto> findAllPost();
    public PostInfoDto findPostById();
    public void savePost();
    public void removePostById();
    public void editPostById();
}
