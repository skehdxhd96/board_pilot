package com.example.board_pilot.infrastructure.post;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyBatisPostRepositoryImpl implements PostRepository {

    @Override
    public List<PostInfoDto> findAllPost() {
        return null;
    }

    @Override
    public PostInfoDto findPostById() {
        return null;
    }

    @Override
    public void savePost() {

    }

    @Override
    public void removePostById() {

    }

    @Override
    public void editPostById() {

    }
}
