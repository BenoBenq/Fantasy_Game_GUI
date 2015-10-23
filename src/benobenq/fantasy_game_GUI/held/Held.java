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
  protected int staerke;
  protected int angriffswert;
  protected boolean amLeben;
  protected Waffe waffe;
  // Ende Attribute
  
  public Held(Waffe pWaffe, String pName, int pLebenspunkte, int pStaerke, boolean pAmLeben) {
    waffe = pWaffe;
    name = pName;
    lebenspunkte = pLebenspunkte;
    staerke = pStaerke;
    amLeben = pAmLeben;
  }

  // Anfang Methoden
  public String getName() {
    return name;
  }

  public int getLebenspunkte() {
    return lebenspunkte;
  }

  public int getStaerke() {
    return staerke;
  }

  public int getAngriffswert() {
    return angriffswert;
  }

  public void waffeAufheben(Waffe pWaffe) {
    
  }

  public void berechneAW() {
  }

  public void angreifen() {
  }

  public void lebenVerlieren() {
  }

  public boolean istAmLeben() {
    return false;
  }

  // Ende Methoden
} // end of Held
