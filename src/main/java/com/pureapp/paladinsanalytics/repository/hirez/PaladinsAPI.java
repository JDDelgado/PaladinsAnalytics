package com.pureapp.paladinsanalytics.repository.hirez;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaladinsAPI {

  private static final Logger log = LoggerFactory.getLogger(PaladinsAPI.class);
  /*
  public static void main(String args[]) throws NoSuchAlgorithmException, UnsupportedEncodingException, InterruptedException {
    
    //Implementation
    Instant instant = Instant.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.of("UTC"));
    String currentDateTimeUTC = formatter.format(instant);
    
    String hexString = generateSignature(currentDateTimeUTC, "createsession");
    System.err.println("Signature: " + hexString);
    
    //Test API
    String endpoint = "http://api.paladins.com/paladinsapi.svc/createsessionJson/2117/" + hexString + "/" + currentDateTimeUTC;
    System.err.println("Session Endpoint: " + endpoint);
    
    RestTemplate restTemplate = new RestTemplate();
    SessionResponse sessionResponse = restTemplate.getForObject(endpoint, SessionResponse.class);
    log.info("SESSION RESPONSE: " + sessionResponse.getRet_msg());
    log.info("SESSION ID: " + sessionResponse.getSession_id().toString());
    
    Thread.sleep(5000);
    
    //GetPlayerSummary
    Instant instant2 = Instant.now();
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.of("UTC"));
    String currentDateTimeUTC2 = formatter2.format(instant2);
    String hexString2 = generateSignature(currentDateTimeUTC2, "getplayer");
    
    String playerEndpoint = "http://api.paladins.com/paladinsapi.svc/getplayerJson/2117/" + hexString2 + "/" + sessionResponse.getSession_id() + "/" + currentDateTimeUTC2 + "/g3neralz";
    System.err.println("Player Endpoint: " + playerEndpoint);
    
    RestTemplate restTemplate2 = new RestTemplate();
    Object object = restTemplate2.getForObject(playerEndpoint, Object.class);
    System.err.println(object);
    
    //GetMatchHistory
    Instant instant3 = Instant.now();
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.of("UTC"));
    String currentDateTimeUTC3 = formatter3.format(instant3);
    String hexString3 = generateSignature(currentDateTimeUTC3, "getmatchhistory");
    
    String matchHistoryEndpoint = "http://api.paladins.com/paladinsapi.svc/getmatchhistoryjson/2117/" + hexString3 + "/" + sessionResponse.getSession_id() + "/" + currentDateTimeUTC3 + "/g3neralz";
    System.err.println("Match History Endpoint: " + matchHistoryEndpoint);
    
    RestTemplate restTemplate3 = new RestTemplate();
    Object object2 = restTemplate3.getForObject(matchHistoryEndpoint, Object.class);
    System.err.println(object2);
    
    //GetMatchInformation
    Instant instant4 = Instant.now();
    DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.of("UTC"));
    String currentDateTimeUTC4 = formatter4.format(instant4);
    String hexString4 = generateSignature(currentDateTimeUTC4, "getmatchdetails");
    
    String matchDetailsEndpoint = "http://api.paladins.com/paladinsapi.svc/getmatchdetailsjson/2117/" + hexString4 + "/" + sessionResponse.getSession_id() + "/" + currentDateTimeUTC4 + "/180312441";
    System.err.println("Match Details: " + matchHistoryEndpoint);
    
    RestTemplate restTemplate4 = new RestTemplate();
    Object object3 = restTemplate4.getForObject(matchDetailsEndpoint, Object.class);
    System.err.println(object3);
    
  }
  
  private static String generateSignature(String currentDateTimeUTC, String method) throws UnsupportedEncodingException, NoSuchAlgorithmException {
    //Generate signature
    String DEV_ID = "2117";
    String AUTH_KEY = "3A75BE906EA748CD807B6841D3184674";
    
    String passphrase = DEV_ID + method + AUTH_KEY + currentDateTimeUTC;
    byte[] bytesOfMessage = passphrase.getBytes("UTF-8");
    
    MessageDigest md = MessageDigest.getInstance("MD5");
    byte[] thedigest = md.digest(bytesOfMessage);
    
    String hexString = HexUtils.toHexString(thedigest);
    
    return hexString;
  }
 */
}