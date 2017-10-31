package com.pureapp.paladinsanalytics.service;

import javax.inject.Inject;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

import com.pureapp.paladinsanalytics.GlobalProperties;
import com.pureapp.paladinsanalytics.domain.hirez.HiRezMethod;

@Component
public class HiRezSignatureServiceImpl implements HiRezSignatureService {
  
  @Inject
  private GlobalProperties properties;
  
  @Override
  public String generateSignature(String dateTimeUTC, HiRezMethod method) {
    
    String passphrase = properties.getDevId() + method + properties.getAuthKey() + dateTimeUTC;
    
    return DigestUtils.md5Hex(passphrase);
  }
}
