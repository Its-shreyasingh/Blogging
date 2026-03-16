package com.project.blog.Repository;
import com.project.blog.Models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
