package org.carloscortez.blogexk2024.controller;

import org.carloscortez.blogexk2024.model.Post;
import org.carloscortez.blogexk2024.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blog-app")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> listarPost() {
        return this.postService.listarPost();
    }

    @PostMapping("/posts")
    public Post crearPost(@RequestBody Post post) {
        return this.postService.GuardarPost(post);
    }
}
