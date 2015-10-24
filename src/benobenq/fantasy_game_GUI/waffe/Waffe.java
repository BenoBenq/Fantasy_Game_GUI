package benobenq.fantasy_game_GUI.waffe;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Waffe {
  
  // Anfang Attribute
  private int schadensbonus;
  private int materialWert;
  private int magie;
  // Ende Attribute
  
  public Waffe(int pSchadensbonus, int pMaterialWert, int pMagie) {
    schadensbonus = pSchadensbonus;
    materialWert = pMaterialWert;
    magie = pMagie;
  }

  // Anfang Methoden
  public int getSchadensbonus() {
    return schadensbonus;
  }

  public int getMaterialWert() {
    return materialWert;
  }

  public int getMagie() {
    return magie;
  }

  public int bonusBerechnen() {
    return schadensbonus*(magie+materialWert);
  }

  // Ende Methoden
} // end of Waffe
