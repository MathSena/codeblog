package com.mathsena.codeblog.service.impl;

import com.mathsena.codeblog.model.Post;
import com.mathsena.codeblog.repository.CodeblogRepository;
import com.mathsena.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {


    @Autowired
    private CodeblogRepository codeblogRepository;


    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
