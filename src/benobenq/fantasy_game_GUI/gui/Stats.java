package benobenq.fantasy_game_GUI.gui;

import benobenq.fantasy_game_GUI.held.Held;
import benobenq.fantasy_game_GUI.held.Krieger;
import benobenq.fantasy_game_GUI.held.Zauberer;
import benobenq.fantasy_game_GUI.monster.Monster;
import benobenq.fantasy_game_GUI.myEnum.Material;
import benobenq.fantasy_game_GUI.waffe.Waffe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bent on 11.11.2015.
 */
public class Stats extends JFrame{
    private JPanel heldenStats;
    private JPanel monsterStats;
    private JComboBox heldenList;
    private JComboBox monsterList;
    private JLabel nameM;
    private JLabel lpM;
    private JLabel awM;
    private JLabel nameH;
    private JLabel lpH;
    private JLabel staerkeH;
    private JLabel ausdauerH;
    private JLabel heilkraftH;
    private JPanel RootPanel;
    private JLabel typeH;
    private JComboBox waffenList;
    private JPanel waffenStats;
    private JLabel nameW;
    private JLabel materialW;
    private JLabel magieW;
    private JLabel waffeH;

    public Stats() {
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        heldenList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object obj = (Held) heldenList.getSelectedItem();
                if(obj instanceof Held) {
                    Held held = (Held) obj;
                    nameH.setText(held.getName());
                    Integer i = new Integer(held.getLebenspunkte());
                    lpH.setText(i.toString());
                    if(!(obj instanceof Krieger) && !(obj instanceof Zauberer)) {
                        ausdauerH.setText("");
                        staerkeH.setText("");
                        heilkraftH.setText("");
                    }
                    if(!(held.getWaffe()==null)) {
                        waffeH.setText(held.getWaffe().toString());
                    } else {
                        waffeH.setText("NULL");
                    }
                }
                if(obj instanceof Krieger) {
                    typeH.setText("Krieger");
                } else if(obj instanceof Zauberer) {
                    typeH.setText("Zauberer");
                } else if ((obj instanceof Held) && !(obj instanceof Krieger) && !(obj instanceof Zauberer)) {
                    typeH.setText("Held");
                }
                if(obj instanceof Krieger) {
                    Krieger k = (Krieger) obj;
                    Integer s = new Integer(k.getStaerke());
                    staerkeH.setText(s.toString());
                    Integer a = new Integer(k.getAusdauer());
                    ausdauerH.setText(a.toString());
                    heilkraftH.setText("");
                }
                if(obj instanceof Zauberer) {
                    Zauberer z = (Zauberer) obj;
                    Integer h = new Integer(z.getHeilkraft());
                    heilkraftH.setText(h.toString());
                    ausdauerH.setText("");
                    staerkeH.setText("");
                }
            }
        });
        monsterList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Monster monster = (Monster) monsterList.getSelectedItem();
                nameM.setText(monster.toString());
                Integer i = new Integer(monster.getLebenspunkte());
                lpM.setText(i.toString());
                Integer g = new Integer(monster.getAngriffswert(10));
                awM.setText(g.toString());
            }
        });
        waffenList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Waffe waffe = (Waffe) waffenList.getSelectedItem();
                nameW.setText(waffe.toString());
                Material m = waffe.getMaterialWert();
                materialW.setText(m.toString());
                Integer i = new Integer(waffe.getMagie());
                magieW.setText(i.toString());
            }
        });

    }

    public void updateObject() {
        System.out.println("OK");
        heldenList.setSelectedItem(heldenList.getSelectedItem());
        monsterList.setSelectedItem(monsterList.getSelectedItem());
        waffenList.setSelectedItem(waffenList.getSelectedItem());
    }

    public JComboBox getHeldenList() {
        return heldenList;
    }

    public JComboBox getMonsterList() { return monsterList;}

    public JComboBox getWaffenList() { return waffenList;}
}
