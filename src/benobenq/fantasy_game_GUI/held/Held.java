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
  
  // Anfang Attribute
  protected String name;
  protected int lebenspunkte;
  protected int angriffswert;
  protected boolean amLeben;
  protected Waffe waffe;
  // Ende Attribute
  
  public Held(Waffe pWaffe, String pName, int pLebenspunkte) {
    waffe = pWaffe;
    name = pName;
    lebenspunkte = pLebenspunkte;
    amLeben = true;
  }

  // Anfang Methoden
  public String getName() {
    return name;
  }

  public int getLebenspunkte() {
    return lebenspunkte;
  }

  public int getAngriffswert() {
    return angriffswert;
  }

  public void waffeAufheben(Waffe pWaffe) {
    waffe = pWaffe;
  }

  public void berechneAngriffswert(int wuerfel) {
    angriffswert = wuerfel+waffe.getSchadensbonus();
  }

  public void angreifen() {

  }

  public void lebenVerlieren(int value) {
    if(lebenspunkte-value > 0) {
      lebenspunkte = lebenspunkte-value;
    } else {
      amLeben = false;
    }
  }

  public boolean istAmLeben() {
    return amLeben;
  }

  // Ende Methoden
} // end of Held
