package com.mathsena.codeblog.repository;

import com.mathsena.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {


}
