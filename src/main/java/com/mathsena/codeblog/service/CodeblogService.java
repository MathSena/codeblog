package com.mathsena.codeblog.service;

import com.mathsena.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}
