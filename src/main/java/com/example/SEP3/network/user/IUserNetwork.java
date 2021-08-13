package com.example.SEP3.network.user;

import com.example.SEP3.models.Case;
import com.example.SEP3.models.User;

import java.util.List;

public interface IUserNetwork
{
  List<User> getAllUsers();
  Boolean deleteUser(String userid);
  List<Case> getCasesForSpecificUser(String userid);
  Boolean addUser(User user);
  User loadData(String userid);
}
