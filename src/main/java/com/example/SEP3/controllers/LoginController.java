package com.example.SEP3.controllers;

import com.example.SEP3.models.User;
import com.example.SEP3.service.login.ILoginService;
import com.example.SEP3.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController
{
  @Autowired ILoginService loginService;

  @PostMapping("/login")
  public User login(@RequestBody User user)
  {
    User user1 = loginService.login(user);
    if (user1 == null)
    {
      System.out.println("No user provided");
    }
    return user1;
  }
}
