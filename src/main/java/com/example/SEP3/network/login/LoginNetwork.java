package com.example.SEP3.network.login;

import com.example.SEP3.models.User;
import com.example.SEP3.network.connection.DatabaseClient;
import com.example.SEP3.network.connection.IDatabaseClient;
import com.example.SEP3.network.util.NetworkRequest;
import com.example.SEP3.network.util.NetworkType;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginNetwork implements ILoginNetwork
{

  @Autowired IDatabaseClient databaseClient = new DatabaseClient();

  @Override public User login(User user)
  {
    Gson gson = new Gson();
    String serializedUser = gson.toJson(user);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOGIN, serializedUser);
    String received = databaseClient.connect(networkRequest);
    return gson.fromJson(received, User.class);
  }
}
