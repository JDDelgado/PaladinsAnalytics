package com.pureapp.paladinsanalytics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties
@Getter
@Setter
public class GlobalProperties {
  
  @Value("${welcome.message}")
  private String message = "Hello World";
  
  @Value("${hirez.development.id}")
  private String devId;
  
  @Value("${hirez.development.authKey}")
  private String authKey;
  
}
