package com.example.SEP3.controllers;

import com.example.SEP3.models.User;
import com.example.SEP3.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
  @Autowired IUserService userService;

  @GetMapping("/users")
  public List<User> getAllUsers()
  {
    List<User> userList = userService.getAllUsers();
    if (userList == null)
    {
      System.out.println("There are no users");
    }
    return userList;
  }
  @DeleteMapping("/user/{userid}")
  public boolean deleteUser(@PathVariable String userid)
  {
    Boolean response = userService.deleteUser(userid);
    return response;
  }
}
