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
  private int staerke;
  // Ende Attribute
  
  public Krieger(Waffe pWaffe, String pName, int pLebenspunkte, boolean pAmLeben, int pAusdauer, int staerke) {
    super(pWaffe, pName, pLebenspunkte, pAmLeben);
    ausdauer = pAusdauer;
    this.staerke = staerke;
  }
  
  
  // Anfang Methoden
  public int getAusdauer() {
    return ausdauer;
  }
  
  public void berechneAngriffswert(int wuerfel) {
    angriffswert = wuerfel+waffe.getSchadensbonus()+staerke+ausdauer;
  }

  public int getStaerke() {
    return staerke;
  }
  
  // Ende Methoden
} // end of Krieger
