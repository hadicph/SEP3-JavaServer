package com.example.SEP3.network.user;

import com.example.SEP3.models.Case;
import com.example.SEP3.models.User;
import com.example.SEP3.network.connection.DatabaseClient;
import com.example.SEP3.network.connection.IDatabaseClient;
import com.example.SEP3.network.util.NetworkRequest;
import com.example.SEP3.network.util.NetworkType;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component public class UserNetwork implements IUserNetwork
{
  @Autowired IDatabaseClient databaseClient = new DatabaseClient();

  @Override public List<User> getAllUsers()
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.USERS);
    String received = databaseClient.connect(networkRequest);
    return gson.fromJson(received, new TypeToken<List<User>>()
    {
    }.getType());
  }

  @Override public Boolean deleteUser(String userid)
  {
    Gson gson = new Gson();
    String serializedUser = gson.toJson(userid);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.DELETE_USER, serializedUser);
    String received = databaseClient.connect(networkRequest);
    return gson.fromJson(received, boolean.class);
  }

  @Override public List<Case> getCasesForSpecificUser(String userid)
  {
    Gson gson = new Gson();
    String serializedUser = gson.toJson(userid);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.CASE,serializedUser);
    String received = databaseClient.connect(networkRequest);
    return gson.fromJson(received, new TypeToken<List<Case>>()
    {
    }.getType());
  }

  @Override public Boolean addUser(User user)
  {
    Gson gson = new Gson();
    String serializedUser = gson.toJson(user);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.ADD_USER, serializedUser);
    String received = databaseClient.connect(networkRequest);
    return gson.fromJson(received, boolean.class);
  }

  @Override public User loadData(String userid)
  {
    Gson gson = new Gson();
    String serializedUser = gson.toJson(userid);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOAD_DATA,serializedUser);
    String received = databaseClient.connect(networkRequest);
    return gson.fromJson(received, User.class);
  }
}
