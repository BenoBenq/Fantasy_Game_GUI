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

  private int heilkraft;
  
  public Zauberer(Waffe pWaffe, String pName, int pLebenspunkte, boolean pAmLeben, int pHeilkraft) {
    super(pWaffe, pName, pLebenspunkte);
    heilkraft = pHeilkraft;
  }

  public int getHeilkraft() {
    return heilkraft;
  }
  
  public void berechneAngriffswert(int wuerfel) {
    angriffswert = wuerfel+waffe.getSchadensbonus();
  }
}
