package com.project.blog.Models;
import com.project.blog.Models.*;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String username;

    @Column(unique=true,nullable=false)
    private String email;
    
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Post> posts=new ArrayList<>();
}
