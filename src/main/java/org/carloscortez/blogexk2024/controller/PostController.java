package org.carloscortez.blogexk2024.controller;

import org.carloscortez.blogexk2024.model.Post;
import org.carloscortez.blogexk2024.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("blog-app")
@CrossOrigin(value = "http://localhost:4200/")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> listarPost() {
        return this.postService.listarPost();
    }

    @PostMapping("/posts")
    public Post crearPost(@RequestBody Post post) {
        post.setPostDate(Date.valueOf(LocalDate.now()));
        post.setPostTime(Time.valueOf(LocalTime.now()));
        return this.postService.GuardarPost(post);
    }
}
