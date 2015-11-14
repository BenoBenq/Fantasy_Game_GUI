package benobenq.fantasy_game_GUI.spielfeld;

import benobenq.fantasy_game_GUI.held.Held;
import benobenq.fantasy_game_GUI.held.Krieger;
import benobenq.fantasy_game_GUI.held.Zauberer;
import benobenq.fantasy_game_GUI.monster.Monster;

import java.util.ArrayList;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2015
  * @author 
  */

public class Kampfleitung {

  public ArrayList<Held> h = new ArrayList<Held>();
  public ArrayList<Held> k = new ArrayList<Held>();
  public ArrayList<Held> z = new ArrayList<Held>();
  public ArrayList<Monster> m = new ArrayList<Monster>();

  public Held kh;
  public Monster km;

  
  public Kampfleitung() {
  }

  // Anfang Methoden
  public void kaempfenLassen(Object pHeld, Object pMonster) {
    kh = (Held) pHeld;
    km = (Monster) pMonster;
    Wuerfel wH = new Wuerfel(6);
    Wuerfel wM = new Wuerfel(10);
    while(kh.isAlive() && km.isAlive()) {
      wH.wuerfeln();
      int hA = kh.berechneAngriffswert(wH.getGewuerfelteSeite());
      wM.wuerfeln();
      int mA = km.getAngriffswert(wM.getGewuerfelteSeite());
      km.lebenVerlieren(hA);
      kh.lebenVerlieren(mA);
      System.out.println("Held: " + kh.getLebenspunkte());
      System.out.println("Monster: " + km.getLebenspunkte());
    }
    if(kh.isAlive()) {
      System.out.println("Der Held hat gewonnen");
    } else {
      System.out.println("Das Monster hat gewonnen");
    }
  }

  public void mkPeople() {
    /*Monster monster = new Monster(100, 11);
    /*Waffe mWaffe = new Waffe(12, 3, 1);
    /*Krieger krieger = new Krieger("Otto", 134, 34, 3);*/
  }

  public void mkHeld(String name, int lp, int ausdauer) {
    Held pH = new Held(name, lp);
    h.add(pH);

  }

  public void mkKrieger(String name, int lp, int ausdauer, int staerke) {
    Krieger pK = new Krieger(name, lp, ausdauer, staerke);
    k.add(pK);
  }

  public void mkMagier(String name, int lp, int heilkraft) {
    Zauberer pZ = new Zauberer(name, lp, heilkraft);
    z.add(pZ);
  }

  public void mkMonster(int pLebenspunkte, int pAngriffswert, String pName) {
    Monster pM = new Monster(pLebenspunkte, pAngriffswert, pName);
    m.add(pM);
  }

  public Held getKh() {
    System.out.println("Held: " + kh.getLebenspunkte());
    return kh;
  }

  public Monster getKm() {
    return km;
  }
}
