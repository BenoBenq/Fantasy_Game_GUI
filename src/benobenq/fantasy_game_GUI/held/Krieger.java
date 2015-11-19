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

  private int ausdauer;
  private int maxAusdauer;
  private int staerke;
  
  public Krieger(String pName, int pLebenspunkte, int pAusdauer, int staerke) {
    super(pName, pLebenspunkte);
    ausdauer = pAusdauer;
    this.staerke = staerke;
    maxAusdauer = pAusdauer;
  }

  public int getAusdauer() {
    return ausdauer;
  }

  public int getStaerke() {
    return staerke;
  }

  public int getMaxAusdauer() { return maxAusdauer; }

  public void setAusdauer(int value) {
     ausdauer = value;
   }

}
