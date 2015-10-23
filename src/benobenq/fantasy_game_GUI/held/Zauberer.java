package benobenq.fantasy_game_GUI.held;

import benobenq.fantasy_game_GUI.waffe.Waffe;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Zauberer extends Held {
  
  // Anfang Attribute
  private int heilkraft;
  // Ende Attribute
  
  public Zauberer(Waffe pWaffe, String pName, int pLebenspunkte, int pStaerke, boolean pAmLeben, int pHeilkraft) {
    super(pWaffe, pName, pLebenspunkte, pStaerke, pAmLeben);
    heilkraft = pHeilkraft;
  }
  
  // Anfang Methoden
  public int getHeilkraft() {
    return heilkraft;
  }
  
  public void berechneAngriffswert() {
    
  }
  
  // Ende Methoden
} // end of Zauberer
