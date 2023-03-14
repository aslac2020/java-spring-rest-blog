package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@Component
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitleContaining(String title);

}