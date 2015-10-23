package benobenq.fantasy_game_GUI.spielfeld;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Wuerfel {
  
  // Anfang Attribute
  protected int seitenAnzahl;
  protected int gewuerfelteSeite;
  // Ende Attribute
  
  public Wuerfel(int seitenAnzahl) {
    this.seitenAnzahl = seitenAnzahl;
  }

  // Anfang Methoden
  public int getSeitenAnzahl() {
    return seitenAnzahl;
  }

  public int getGewuerfelteSeite() {
    gewuerfelteSeite = (int) Math.random()*seitenAnzahl;
    return gewuerfelteSeite;
  }

  public void wuerfeln() {
    
  }

  // Ende Methoden
} // end of Wuerfel
