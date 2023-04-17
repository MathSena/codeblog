package com.mathsena.codeblog.repository;

import com.mathsena.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {


}
