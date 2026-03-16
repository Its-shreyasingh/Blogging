package com.project.blog.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private List<Post> posts=new ArrayList<>();
}
