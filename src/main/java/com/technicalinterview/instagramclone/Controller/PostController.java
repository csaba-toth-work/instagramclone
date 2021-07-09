package com.technicalinterview.instagramclone.Controller;

import com.technicalinterview.instagramclone.Entity.Post;
import com.technicalinterview.instagramclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post) {
        return postService.submitPostToDataBase(post);
    }

    @GetMapping("")
    private ArrayList<Post> getAllPost() {
        return postService.retrievePostFromDB();
    }
}
