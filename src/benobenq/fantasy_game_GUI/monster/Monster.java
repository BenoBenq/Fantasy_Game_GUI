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
  
  public Monster(int pLebenspunkte, int pAngriffswert) {
    lebenspunkte = pLebenspunkte;
    angriffswert = pAngriffswert;
    amLeben = true;
  }

  public int getLebenspunkte() {
    return lebenspunkte;
  }

  public int getAngriffswert() {
    return angriffswert;
  }

  public void lebenVerlieren(int value) {
    if(lebenspunkte-value > 0) {
      lebenspunkte = lebenspunkte-value;
    } else {
      amLeben = false;
    }
  }
}
