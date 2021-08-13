package com.example.SEP3.models;

import java.io.Serializable;

public class User implements Serializable
{
  private String userid,password,role,firstname,lastname,phonenb;

  public User()
  {
  }

  public User(String userid, String password, String role)
  {
    this.userid = userid;
    this.password = password;
    this.role = role;
  }

  public User(String userid, String password, String role, String firstname,
      String lastname, String phonenb)
  {
    this.userid = userid;
    this.password = password;
    this.role = role;
    this.firstname = firstname;
    this.lastname = lastname;
    this.phonenb = phonenb;
  }

  public String getUserid()
  {
    return userid;
  }

  public void setUserid(String userid)
  {
    this.userid = userid;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }


  public void setRole(String role)
  {
    this.role = role;
  }

  public String getRole()
  {
    return role;
  }

  public String getFirstname()
  {
    return firstname;
  }

  public void setFirstname(String firstname)
  {
    this.firstname = firstname;
  }

  public String getLastname()
  {
    return lastname;
  }

  public void setLastname(String lastname)
  {
    this.lastname = lastname;
  }

  public String getPhonenb()
  {
    return phonenb;
  }

  public void setPhonenb(String phonenb)
  {
    this.phonenb = phonenb;
  }

  @Override public String toString()
  {
    return "User{" + "userid='" + userid + '\'' + ", password='" + password
        + '\'' + ", role='" + role + '\'' + ", firstname='" + firstname + '\''
        + ", lastname='" + lastname + '\'' + ", phonenb='" + phonenb + '\''
        + '}';
  }
}