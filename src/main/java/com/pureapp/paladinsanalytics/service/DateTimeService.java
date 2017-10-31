package com.pureapp.paladinsanalytics.service;

public interface DateTimeService {
  
  public static final String DATE_TIME_PATTERN = "yyyyMMddHHmmss";
  
  public String generateHiRezDateTime();
}
