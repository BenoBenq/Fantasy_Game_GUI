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
  
  public Zauberer(String pName, int pLebenspunkte, int pHeilkraft) {
    super(pName, pLebenspunkte);
    heilkraft = pHeilkraft;
  }

  public int getHeilkraft() {
    return heilkraft;
  }
  
  public int berechneAngriffswert(int wuerfel) {
    angriffswert = wuerfel+waffe.getSchadensbonus();
    return angriffswert;
  }

  public void heile() {
    if(heilkraft+lebenspunkte >= maxHealth) {
      lebenspunkte = maxHealth;
      amLeben = true;
    } else {
      lebenspunkte = lebenspunkte+heilkraft;
      amLeben = true;
    }
  }
}
