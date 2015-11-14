package benobenq.fantasy_game_GUI.waffe;

import benobenq.fantasy_game_GUI.myEnum.Material;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Waffe {

  private int schadensbonus;
  private Material materialWert;
  private int magie;
  private String name;
  
  public Waffe(/*int pSchadensbonus*/ Material pMaterialWert, int pMagie, String name) {
    //schadensbonus = pSchadensbonus;
    materialWert = pMaterialWert;
    magie = pMagie;
    this.name = name;
  }

  // Anfang Methoden
  public int getSchadensbonus() {
    return schadensbonus;
  }

  public Material getMaterialWert() {
    return materialWert;
  }

  public int getMagie() {
    return magie;
  }

  public int bonusBerechnen() {
    return schadensbonus*(magie+materialWert.getInt());
  }

  public String toString() {
    return name;
  }
}
