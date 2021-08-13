package com.example.SEP3.controllers;

import com.example.SEP3.models.Case;
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
  @GetMapping("/cases/{userid}")
  public List<Case> getCasesForSpecificUser(@PathVariable String userid)
  {
    List<Case> caseList = userService.getCasesForSpecificUser(userid);
    if (caseList == null)
    {
      System.out.println("There are no cases for this user");
    }
    return caseList;
  }
  @PostMapping("/adduser")
  public boolean addUser(@RequestBody User user)
  {
    Boolean response = userService.addUser(user);
    return response;
  }
  @GetMapping("/loaddata/{userid}")
  public User loadData(@PathVariable String userid)
  {
    User user = userService.loadData(userid);
    if (user == null)
    {
      System.out.println("There is no data for this user");
    }
    return user;
  }
}
