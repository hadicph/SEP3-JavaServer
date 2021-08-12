package com.example.SEP3.service.user;

import com.example.SEP3.models.User;

import java.util.List;

public interface IUserService
{

  List<User> getAllUsers();
  Boolean deleteUser(String userid);
}
