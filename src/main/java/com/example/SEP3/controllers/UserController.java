package com.example.SEP3.controllers;

import com.example.SEP3.models.User;
import com.example.SEP3.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController
{

  @Autowired IUserService userService;

  @PostMapping("/login")
  public User login(@RequestBody User user)
  {
    User user1 = userService.login(user);
    if (user1 == null)
    {
      System.out.println("No user provided");
    }
    return user1;
  }
}
