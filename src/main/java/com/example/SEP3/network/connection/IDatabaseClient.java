package com.example.SEP3.network.connection;

import com.example.SEP3.network.util.NetworkRequest;

public interface IDatabaseClient
{
  void launch();
  String connect(NetworkRequest networkRequest);
}
