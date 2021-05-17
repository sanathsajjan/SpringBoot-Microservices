package com.sanath.userservice.userservice.controller;

import com.sanath.userservice.userservice.entity.Users;
import com.sanath.userservice.userservice.service.UserService;
import com.sanath.userservice.userservice.vo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUsers(@RequestBody Users users){
        return userService.save(users);
    }

    @GetMapping("/{id}")
    public UserDepartmentVO getUserDepatment(@PathVariable("id") Long userId){
        return userService.getUserDepartment(userId);
    }
}
