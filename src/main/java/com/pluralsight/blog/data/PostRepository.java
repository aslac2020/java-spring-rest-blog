package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.rest.core.annotation.RestResource;


@Component
public interface PostRepository extends JpaRepository<Post, Long> {

}