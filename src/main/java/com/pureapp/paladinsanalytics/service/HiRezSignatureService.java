package com.pureapp.paladinsanalytics.service;

import com.pureapp.paladinsanalytics.domain.hirez.HiRezMethod;

public interface HiRezSignatureService {
  
  public String generateSignature(String dateTimeUTC, HiRezMethod method);
  
}
