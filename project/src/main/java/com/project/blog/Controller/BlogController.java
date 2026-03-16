package com.project.blog.Controller;
import com.project.blog.Models.*;
import com.project.blog.Service.BlogService;
import java.util.*;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BlogController {
    private final BlogService blogService;

@PostMapping("/users")
public ResponseEntity<User> createUser(@RequestBody User user) {
    return ResponseEntity.ok(blogService.createUser(user));
}

@GetMapping("/users")
public List<User> getAllUsers() {
    return blogService.getAllUsers();
}
    @PostMapping("/users/{userId}/posts")
    public ResponseEntity<Post> createPost(@PathVariable Long userId,@RequestBody Post post) {

        return ResponseEntity.ok(blogService.createPost(userId, post));
    }
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return blogService.getAllPosts();
    }
    
}
