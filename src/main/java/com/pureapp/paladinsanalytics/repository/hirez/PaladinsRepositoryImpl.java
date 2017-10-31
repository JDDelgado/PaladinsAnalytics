package com.pureapp.paladinsanalytics.repository.hirez;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.pureapp.paladinsanalytics.GlobalProperties;
import com.pureapp.paladinsanalytics.domain.hirez.HiRezMethod;
import com.pureapp.paladinsanalytics.domain.hirez.PlayerSummary;
import com.pureapp.paladinsanalytics.domain.hirez.SessionResponse;
import com.pureapp.paladinsanalytics.service.DateTimeService;
import com.pureapp.paladinsanalytics.service.HiRezSignatureServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class PaladinsRepositoryImpl implements PaladinsRepository {
  
  @Inject
  private GlobalProperties properties;
  
  @Inject
  private HiRezSignatureServiceImpl signatureService;
  
  @Inject
  private DateTimeService dateTimeService;
  
  @Inject
  private RestTemplate restTemplate;
  
  private static final String URL_DELIMITER = "/";
  
  @Override
  public SessionResponse createSession() {
    String dateTimeUTC = dateTimeService.generateHiRezDateTime();
    
    String signatureHex = signatureService.generateSignature(dateTimeUTC, HiRezMethod.createsession);
    
    String endpoint = HIREZ_BASE_URL + "/" + HiRezMethod.createsession.json() + "/" + properties.getDevId() + "/" + signatureHex + "/" + dateTimeUTC;
    
    RestTemplate restTemplate = new RestTemplate();
    SessionResponse sessionResponse = restTemplate.getForObject(endpoint, SessionResponse.class);
    
    return sessionResponse;
  }
  
  @Override
  public PlayerSummary getPlayerSummary(SessionResponse session, String playerName) {
    
    String endpoint = buildURL(session.getSession_id(), HiRezMethod.getplayer, playerName);
    PlayerSummary[] playerSummary = restTemplate.getForObject(endpoint, PlayerSummary[].class);
    
    return playerSummary.length == 0 ? null : playerSummary[0];
  }
  
  private String buildURL(String sessionId, HiRezMethod method, String playerName) {
    
    String dateTimeUTC = dateTimeService.generateHiRezDateTime();
    String signatureHex = signatureService.generateSignature(dateTimeUTC, HiRezMethod.getplayer);
    
    String endpoint = new StringBuilder(HIREZ_BASE_URL).append(URL_DELIMITER)
                                .append(method.json()).append(URL_DELIMITER)
                                .append(properties.getDevId()).append(URL_DELIMITER)
                                .append(signatureHex).append(URL_DELIMITER)
                                .append(sessionId).append(URL_DELIMITER)
                                .append(dateTimeUTC).append(URL_DELIMITER)
                                .append(playerName).toString();
    return endpoint;
  }
}
