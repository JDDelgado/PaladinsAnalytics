package com.pureapp.paladinsanalytics.domain.hirez;

import lombok.Data;

@Data
public class PlayerSummary {
  
  private String Created_Datetime;
  private int Id;
  private String Last_Login_Datetime;
  private int Leaves;
  private int Level;
  private int Losses;
  private int MasteryLevel;
  private String Name;
  private String Personal_Status_Message;
  private RankedConquest RankedConquest;
  private String Region;
  private int TeamId;
  private String Team_Name;
  private int Tier_Conquest;
  private int Total_Achievements;
  private int Total_Worshippers;
  private int Wins;
  private String ret_msg;
  
}
