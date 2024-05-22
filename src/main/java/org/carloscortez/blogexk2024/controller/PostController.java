package org.carloscortez.blogexk2024.controller;

import org.carloscortez.blogexk2024.model.Post;
import org.carloscortez.blogexk2024.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
@RestController
@RequestMapping("blog-app")
// @CrossOrigin(value = "http://192.168.42.153:4200/") RED LAN
@CrossOrigin(origins = "http://localhost:4200/" , allowCredentials = "true")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> listarPost() {
        return this.postService.listarPost();
    }

    @MessageMapping("/posts-socket/{roomId}")
    @SendTo("/topic/{roomId}")
    public Post posts(@DestinationVariable String roomId, Post post){
        post.setPostDate(Date.valueOf(LocalDate.now()));
        post.setPostTime(Time.valueOf(LocalTime.now()));
        return this.postService.GuardarPost(post);
    }
}

