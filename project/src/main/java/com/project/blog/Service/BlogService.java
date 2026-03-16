package com.project.blog.Service;
import com.project.blog.Models.*;
import java.util.*;
import org.springframework.stereotype.Service;

import com.project.blog.Repository.PostRepository;
import com.project.blog.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    
    public User createUser(User user) {
    return userRepository.save(user);
    }

    public List<User> getAllUsers() {
    return userRepository.findAll();
    }

    public Post createPost(Long userId, Post post)
    {
        User user=userRepository.findById(userId)
        .orElseThrow(()->new RuntimeException("User not found"));
        post.setAuthor(user);
        return postRepository.save(post);
    }

    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }
}
