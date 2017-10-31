package com.pureapp.paladinsanalytics.domain.hirez;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SessionResponse {
  
  private String ret_msg;
  private String session_id;
  private String timestamp;
  
}
