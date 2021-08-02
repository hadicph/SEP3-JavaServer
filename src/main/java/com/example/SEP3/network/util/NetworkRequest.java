package com.example.SEP3.network.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkRequest
{
  @JsonProperty private String data;
  @JsonProperty private NetworkType type;

  public NetworkRequest(NetworkType networkType, String data)
  {
    this.data = data;
    this.type = networkType;
  }
  public NetworkRequest(NetworkType type)
  {
    this.type = type;
  }

  @Override public String toString()
  {
    return "NetworkRequest{" + "data='" + data + '\'' + ", type=" + type + '}';
  }
}
