/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Monster {
  
  // Anfang Attribute
  private int lebenspunkte;
  private int angriffswert;
  private boolean amLeben;
  // Ende Attribute
  
  public Monster(int pLebenspunkte, int pAngriffswert) {
    lebenspunkte = pLebenspunkte;
    angriffswert = pAngriffswert;
    amLeben = false;
  }

  // Anfang Methoden
  public int getLebenspunkte() {
    return lebenspunkte;
  }

  public int getAngriffswert() {
    return angriffswert;
  }

  public void lebenVerlieren() {
    
  }

  // Ende Methoden
} // end of Monster
