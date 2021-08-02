package com.example.SEP3.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;

public class ServerRequest implements Serializable
{
  @JsonProperty("eventType")
  private ServerType serverType;
  @JsonProperty("object")
  private Object object;
  @JsonCreator
  public ServerRequest(@JsonProperty("evenType") ServerType serverType,@JsonProperty("object") Object object)
  {
    this.serverType = serverType;
    this.object = object;
  }
@JsonGetter
  public ServerType getEventType()
  {
    return serverType;
  }
@JsonSetter
  public void setEventType(ServerType serverType)
  {
    this.serverType = serverType;
  }
@JsonGetter
  public Object getObject()
  {
    return object;
  }
@JsonSetter
  public void setObject(Object object)
  {
    this.object = object;
  }
}
