package benobenq.fantasy_game_GUI.main;

import benobenq.fantasy_game_GUI.gui.GUIForm;
import benobenq.fantasy_game_GUI.spielfeld.Kampfleitung;

/**
 * Created by Bent on 23.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Kampfleitung kL = new Kampfleitung();
        GUIForm guif = new GUIForm(kL);
    }


}
