package com.pureapp.paladinsanalytics.domain.hirez;

import lombok.Data;

@Data
public class RankedConquest {
  
  private int Leaves;
  private int Losses;
  private String Name;
  private int Points;
  private int PrevRank;
  private int Rank;
  private String Rank_Stat_Conquest;
  private String Rank_Stat_Duel;
  private String Rank_Stat_Joust;
  private int Season;
  private int Tier;
  private int Trend;
  private int Wins;
  private String player_id;
  private String ret_msg;
  
}
