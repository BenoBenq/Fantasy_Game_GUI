package benobenq.fantasy_game_GUI.spielfeld;

import benobenq.fantasy_game_GUI.held.Krieger;
import benobenq.fantasy_game_GUI.monster.Monster;
import benobenq.fantasy_game_GUI.waffe.Waffe;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Kampfleitung {

  
  public Kampfleitung() {
    mkPeople();
  }

  // Anfang Methoden
  public void kaempfenLassen() {
    
  }

  public void mkPeople() {
    Monster monster = new Monster(100, 11);
    Waffe mWaffe = new Waffe(12, 3, 1);
    Krieger krieger = new Krieger("Otto", 134, 34, 3);
  }
}
