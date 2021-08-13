package com.example.SEP3.network.connection;

import com.example.SEP3.models.User;
import com.example.SEP3.network.util.NetworkRequest;
import com.example.SEP3.network.util.NetworkType;
import com.example.SEP3.util.ServerRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import static com.example.SEP3.util.ServerType.*;

@Component
public class DatabaseClient implements IDatabaseClient
{

  @Override public void launch()
  {
//    try
//    {
//      new Thread(()-> connect(new NetworkRequest(NetworkType.CONNECT,"JavaServer"))).start();
//    }
//    catch (Exception e)
//    {
//      e.printStackTrace();
//    }
  }

  @Override public String connect(NetworkRequest networkRequest)
  {
    try
    {
      Gson gson = new Gson();
      Socket socket = new Socket("localhost", 1235);
      InputStream inputStream = socket.getInputStream();
      OutputStream outputStream = socket.getOutputStream();
      String request = gson.toJson(networkRequest);
      byte[] requestBytes = request.getBytes();
      outputStream.write(requestBytes);
      byte[] data = new byte[256];
      int count = inputStream.read(data);
      String received = new String(data,0,count);
      return received;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return "Connection Failed";
  }
}
