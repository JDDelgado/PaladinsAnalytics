package com.pureapp.paladinsanalytics.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateTimeServiceImpl implements DateTimeService {
  
  private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN).withZone(ZoneId.of("UTC"));
  
  public String generateHiRezDateTime() { 
    Instant now = Instant.now();
    return dateTimeFormatter.format(now);
  }
}
