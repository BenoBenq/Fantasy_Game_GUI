package benobenq.fantasy_game_GUI.gui;

import benobenq.fantasy_game_GUI.held.Held;
import benobenq.fantasy_game_GUI.held.Krieger;
import benobenq.fantasy_game_GUI.monster.Monster;
import benobenq.fantasy_game_GUI.myEnum.Material;
import benobenq.fantasy_game_GUI.spielfeld.Kampfleitung;
import benobenq.fantasy_game_GUI.waffe.Waffe;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bent on 24.10.2015.
 */
public class GUIForm extends JFrame {

    private JPanel RootPanel;
    private JButton heldErschaffenButton;
    private JButton monterErschaffenButton;
    public JComboBox heldenList;
    public JComboBox monsterList;
    private JProgressBar progressBar;
    private JComboBox waffenList;
    private JButton waffeErschaffenButton;
    private JButton kämpfenButton;
    private JButton aufhebenButton;
    private JFrame f = this;

    public Kampfleitung kL;
    public GUIForm gui = this;
    Stats stats = new Stats();

    public GUIForm(Kampfleitung pKL) {
        super("Spiel");
        kL = pKL;
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        test();
        heldErschaffenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Erschaffe dialog = new Erschaffe("held", gui);
                addItemsToCmbBx(dialog.getObject());
                //dialog.setOwner(gui);
                //heldenList.addItem(dialog.getObject());

            }
        });
        monterErschaffenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Erschaffe.main();
                Erschaffe dialog = new Erschaffe("monster", gui);
                addItemsToCmbBx(dialog.getObject());
                //dialog.setOwner(gui);
            }
        });
        waffeErschaffenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Erschaffe dialog = new Erschaffe("waffe", gui);
                addItemsToCmbBx(dialog.getObject());
            }
        });
        kämpfenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kL.kaempfenLassen(heldenList.getSelectedItem(), monsterList.getSelectedItem());
                sync();
            }
        });
        aufhebenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Held held = (Held) heldenList.getSelectedItem();
                Waffe waffe = (Waffe) waffenList.getSelectedItem();
                held.waffeAufheben(waffe);
            }
        });
    }

    public void addItemsToCmbBx(Object obj) {
        if(obj instanceof Held) {
            heldenList.addItem(obj);
            stats.getHeldenList().addItem(obj);
        } else if(obj instanceof Monster) {
            monsterList.addItem(obj);
            stats.getMonsterList().addItem(obj);

        } else if(obj instanceof Waffe) {
            waffenList.addItem(obj);
            stats.getWaffenList().addItem(obj);
        }
        pack();
    }

    public void sync() {
        //heldenList.insertItemAt(kL.getKh(), heldenList.getSelectedIndex());
        /*for(int i = 0; i <heldenList.getItemCount(); i++) {
            stats.getHeldenList().insertItemAt(heldenList.getItemAt(i), i);
        }
        //monsterList.insertItemAt(kL.getKm(), monsterList.getSelectedIndex());
        for(int i = 0; i <monsterList.getItemCount(); i++) {
            stats.getMonsterList().insertItemAt(monsterList.getItemAt(i), i);
        }*/

        //waffenList.insertItemAt();
        stats.pack();
        stats.updateObject();
    }

    public void test() {
        //stats.getHeldenList().addItem(new Krieger("Ich", 13, 30, 40));
        Krieger h = new Krieger("Du", 100, 10, 23);
        addItemsToCmbBx(h);
        Monster m = new Monster(100, 50, "Ich");
        addItemsToCmbBx(m);
        Waffe w = new Waffe(Material.HOLZ, 12, "Honig");
        addItemsToCmbBx(w);
        stats.pack();
    }
}
