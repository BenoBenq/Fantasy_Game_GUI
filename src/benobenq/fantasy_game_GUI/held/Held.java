package benobenq.fantasy_game_GUI.held;

import benobenq.fantasy_game_GUI.waffe.Waffe;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Held {

  protected String name;
  protected int lebenspunkte;
  protected int angriffswert;
  protected boolean amLeben;
  protected Waffe waffe;
  protected int maxHealth;
  
  public Held(String pName, int maxHealth) {
    waffe = null;
    name = pName;
    lebenspunkte = maxHealth;
    this.maxHealth = maxHealth;
    amLeben = true;
  }

  public void waffeAufheben(Waffe pWaffe) {
    waffe = pWaffe;
  }

  public int berechneAngriffswert(int wuerfel) {
    angriffswert = wuerfel+waffe.getSchadensbonus();
    return angriffswert;
  }

  /*public void angreifen() {

  }*/

  public void lebenVerlieren(int value) {
    if(lebenspunkte-value > 0) {
      lebenspunkte = lebenspunkte-value;
    } else {
      lebenspunkte = 0;
      amLeben = false;
    }
  }

  public boolean isAlive() {
    return amLeben;
  }
  public int getLebenspunkte() {
    return lebenspunkte;
  }
  public String getName() {
    return name;
  }
  public String toString() {
    return name;
  }
  public Waffe getWaffe() {return waffe;}
}
