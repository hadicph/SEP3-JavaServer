package com.example.SEP3.network.user;

import com.example.SEP3.models.User;

import java.util.List;

public interface IUserNetwork
{
  List<User> getAllUsers();
  Boolean deleteUser(String userid);
}
