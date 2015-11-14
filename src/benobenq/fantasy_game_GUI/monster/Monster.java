package benobenq.fantasy_game_GUI.monster;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Monster {

  private int lebenspunkte;
  private int angriffswert;
  private boolean amLeben;
  private String name;
  
  public Monster(int pLebenspunkte, int pAngriffswert, String name) {
    lebenspunkte = pLebenspunkte;
    angriffswert = pAngriffswert;
    this.name = name;
    amLeben = true;
  }

  public int getLebenspunkte() {
    return lebenspunkte;
  }

  public int getAngriffswert(int wuerfelhoehe) {
    return angriffswert+wuerfelhoehe;
  }

  public void lebenVerlieren(int value) {
    if(lebenspunkte-value > 0) {
      lebenspunkte = lebenspunkte-value;
    } else {
      lebenspunkte = 0;
      amLeben = false;
    }
  }
  public boolean isAlive() {return amLeben;}
  public String toString() {
    return name;
  }
}
