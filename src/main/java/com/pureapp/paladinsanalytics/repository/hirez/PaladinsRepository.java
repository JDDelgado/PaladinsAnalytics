package com.pureapp.paladinsanalytics.repository.hirez;

import com.pureapp.paladinsanalytics.domain.hirez.SessionResponse;

public interface PaladinsRepository {
  
  public static final String HIREZ_BASE_URL = "http://api.paladins.com/paladinsapi.svc/";
  
  public SessionResponse createSession();
  
  public Object getPlayerSummary(SessionResponse session, String playerName);
  
}
