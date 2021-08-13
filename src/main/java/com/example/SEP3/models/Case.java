package com.example.SEP3.models;

import java.io.Serializable;
import java.util.Date;

public class Case implements Serializable
{
  private String userid;
  private String date;
  private String casedata;

  public Case()
  {
  }

  public Case(String userid, String date, String casedata)
  {
    this.userid = userid;
    this.date = date;
    this.casedata = casedata;
  }

  public String getUserid()
  {
    return userid;
  }

  public void setUserid(String userid)
  {
    this.userid = userid;
  }

  public String getDate()
  {
    return date;
  }

  public void setDate(String date)
  {
    this.date = date;
  }

  public String getCasedata()
  {
    return casedata;
  }

  public void setCasedata(String casedata)
  {
    this.casedata = casedata;
  }

  @Override public String toString()
  {
    return "Case{" + "userid='" + userid + '\'' + ", date=" + date
        + ", casedata='" + casedata + '\'' + '}';
  }
}

