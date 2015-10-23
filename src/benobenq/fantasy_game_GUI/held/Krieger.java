package benobenq.fantasy_game_GUI.held;

import benobenq.fantasy_game_GUI.waffe.Waffe;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Krieger extends Held {
  
  // Anfang Attribute
  private int ausdauer;
  // Ende Attribute
  
  public Krieger(Waffe pWaffe, String pName, int pLebenspunkte, int pStaerke, boolean pAmLeben, int pAusdauer) {
    super(pWaffe, pName, pLebenspunkte, pStaerke, pAmLeben);
    ausdauer = pAusdauer;                                                           
  }
  
  
  // Anfang Methoden
  public int getAusdauer() {
    return ausdauer;
  }
  
  public void berechneAngriffswert() {
    
  }
  
  // Ende Methoden
} // end of Krieger
