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
  private int staerke;
  
  public Krieger(Waffe pWaffe, String pName, int pLebenspunkte, int pAusdauer, int staerke) {
    super(pWaffe, pName, pLebenspunkte);
    ausdauer = pAusdauer;
    this.staerke = staerke;
  }

  public int getAusdauer() {
    return ausdauer;
  }
  
  public void berechneAngriffswert(int wuerfel) {
    angriffswert = wuerfel+waffe.getSchadensbonus()+staerke+ausdauer;
  }

  public int getStaerke() {
    return staerke;
  }

}
