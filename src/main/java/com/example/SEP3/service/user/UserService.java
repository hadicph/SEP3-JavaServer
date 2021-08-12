package com.example.SEP3.service.user;

import com.example.SEP3.network.connection.DatabaseClient;
import com.example.SEP3.models.User;
import com.example.SEP3.network.user.UserNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class UserService implements IUserService
{
  @Autowired UserNetwork userNetwork;

  @Override public List<User> getAllUsers()
  {
      return userNetwork.getAllUsers();
  }

  @Override public Boolean deleteUser(String userid)
  {
    return userNetwork.deleteUser(userid);
  }
}
