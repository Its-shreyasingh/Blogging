package com.project.blog.Repository;
import com.project.blog.Models.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long>{
    List<Post> findByAuthorId(Long userId);
}
