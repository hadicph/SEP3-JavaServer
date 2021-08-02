package com.example.SEP3.network.user;

import com.example.SEP3.models.User;
import com.example.SEP3.network.connection.IDatabaseClient;
import com.example.SEP3.network.util.NetworkRequest;
import com.example.SEP3.network.util.NetworkType;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserNetwork implements IUserNetwork
{
  @Autowired IDatabaseClient databaseClient;

  @Override public User login(User user)
  {
    Gson gson = new Gson();
    String serializedUser = gson.toJson(user);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOGIN, serializedUser);
    String received = databaseClient.connect(networkRequest);
    System.out.println("Login Method in UserNetwork "+ received);
    return gson.fromJson(received, User.class);
  }
}
