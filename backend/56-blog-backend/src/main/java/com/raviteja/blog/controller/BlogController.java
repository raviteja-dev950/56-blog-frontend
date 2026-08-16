package com.raviteja.blog.controller;
import com.raviteja.blog.model.Post;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "http://localhost:3000")
public class BlogController {
    private List<Post> posts = new ArrayList<>(List.of(
        new Post(1L,"React 19 Features","Ravi Teja","Tech","React 19 is amazing with new hooks.","https://picsum.photos/seed/1/600/300","2026-08-15"),
        new Post(2L,"Spring Boot 3.3 Guide","Ravi Teja","Java","Spring Boot 3.3 makes API faster.","https://picsum.photos/seed/2/600/300","2026-08-14"),
        new Post(3L,"Tailwind CSS Tips","Ravi Teja","CSS","Tailwind makes UI 10x faster.","https://picsum.photos/seed/3/600/300","2026-08-13")
    ));

    @GetMapping public List<Post> getAll(){ return posts; }
    @GetMapping("/{id}") public Post getOne(@PathVariable Long id){ return posts.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null); }
    @PostMapping public Post create(@RequestBody Post p){ p.setId((long)(posts.size()+1)); posts.add(p); return p; }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){ posts.removeIf(p->p.getId().equals(id)); }
}