package com.technicalinterview.instagramclone.Controller;

import com.technicalinterview.instagramclone.Entity.Users;
import com.technicalinterview.instagramclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    private Users submitUser(@RequestBody Users users) {
        return userService.submitMetaDataOfUser(users);

    }
    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId) {
       return userService.displayUserMetaData(userId);
    }
}
