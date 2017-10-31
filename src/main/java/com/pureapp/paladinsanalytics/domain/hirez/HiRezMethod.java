package com.pureapp.paladinsanalytics.domain.hirez;

public enum HiRezMethod {
  
  createsession,
  getplayer,
  getmatchhistory,
  getmatchdetails;
  
  public String json() {
    return name().toLowerCase() + "Json";
  }
  
  public String xml() {
    return name().toLowerCase() + "xml";
  }
  
}
