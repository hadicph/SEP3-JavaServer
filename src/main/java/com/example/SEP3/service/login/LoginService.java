package com.example.SEP3.service.login;

import com.example.SEP3.models.User;
import com.example.SEP3.network.login.LoginNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService
{
  @Autowired LoginNetwork loginNetwork;

  @Override public User login(User user)
  {
    return loginNetwork.login(user);
  }
}
