package benobenq.fantasy_game_GUI.spielfeld;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Wuerfel {

  protected int seitenAnzahl;
  protected int gewuerfelteSeite;
  
  public Wuerfel(int seitenAnzahl) {
    this.seitenAnzahl = seitenAnzahl;
  }

  public int getSeitenAnzahl() {
    return seitenAnzahl;
  }

  public int getGewuerfelteSeite() {
    return gewuerfelteSeite;
  }

  public void wuerfeln() {
    double random = Math.random()*seitenAnzahl;
    random++;
    gewuerfelteSeite = (int) random;
  }
}
