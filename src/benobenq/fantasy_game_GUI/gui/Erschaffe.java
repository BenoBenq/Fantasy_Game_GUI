package benobenq.fantasy_game_GUI.gui;

import benobenq.fantasy_game_GUI.held.Held;
import benobenq.fantasy_game_GUI.held.Krieger;
import benobenq.fantasy_game_GUI.held.Zauberer;
import benobenq.fantasy_game_GUI.monster.Monster;
import benobenq.fantasy_game_GUI.myEnum.Material;
import benobenq.fantasy_game_GUI.waffe.Waffe;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Erschaffe extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nameHTF;
    private JTextField lpHTF;
    private JCheckBox heldCheckBox;
    private JRadioButton kriegerRadioButton;
    private JRadioButton magierRadioButton;
    private JTextField staerkeHTF;
    private JTextField ausdauerHTF;
    private JTextField heilkraftHTF;
    private JLabel output;
    private JLabel jStaerke;
    private JLabel jAusdauer;
    private JLabel jHeilkraft;
    private JPanel buttonBar;
    private JPanel held;
    private JPanel monster;
    private JPanel waffe;
    private JLabel jName;
    private JLabel jLP;
    private JLabel jMonsterLP;
    private JLabel jMonsterAW;
    private JTextField lpMTF;
    private JTextField awMTF;
    private JTabbedPane choosePane;
    private JTextField magieWTF;
    private JTextField nameMTF;
    private JTextField nameWTF;
    private JComboBox materialCmbBx;

    private String name;
    private int lp;
    private int staerke;
    private int ausdauer;
    private int heilkraft;
    private int aw;
    private Material material;
    private int magie;

    private Object object;
    private GUIForm owner;

    public Erschaffe(String pane, Window owner) {

        setContentPane(contentPane);
        setModal(true);
        setTitle("Erschaffen");
        getRootPane().setDefaultButton(buttonOK);

        if(pane.equalsIgnoreCase("held")) {
            choosePane.setSelectedComponent(held);
        } else if (pane.equalsIgnoreCase("monster")) {
            choosePane.setSelectedComponent(monster);
        } else if(pane.equalsIgnoreCase("waffe")) {
            choosePane.setSelectedComponent(waffe);
        }

        materialCmbBx.addItem(Material.HOLZ);
        materialCmbBx.addItem(Material.STEIN);
        materialCmbBx.addItem(Material.EISEN);
        materialCmbBx.addItem(Material.STEIN);
        materialCmbBx.addItem(Material.LASER);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        nameHTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    //String text = nameTF.getText();
                    //name = text;
                    //dispose();
                }
            }
        });
        heldCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(!heldCheckBox.isSelected()) {
                    kriegerRadioButton.setEnabled(true);
                    magierRadioButton.setEnabled(true);
                } else {
                    kriegerRadioButton.setEnabled(false);
                    magierRadioButton.setEnabled(false);
                    ausdauerHTF.setEnabled(false);
                    staerkeHTF.setEnabled(false);
                    heilkraftHTF.setEnabled(false);
                    jAusdauer.setEnabled(false);
                    jStaerke.setEnabled(false);
                    jHeilkraft.setEnabled(false);
                    output.setText("Name und LP");
                }
            }
        });
        kriegerRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(kriegerRadioButton.isSelected()) {
                    ausdauerHTF.setEnabled(true);
                    staerkeHTF.setEnabled(true);
                    jAusdauer.setEnabled(true);
                    jStaerke.setEnabled(true);
                    output.setText("Ausdauer und Stärke zusätzlich!");
                } else {
                    ausdauerHTF.setEnabled(false);
                    staerkeHTF.setEnabled(false);
                    jAusdauer.setEnabled(false);
                    jStaerke.setEnabled(false);
                }
            }
        });
        magierRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(magierRadioButton.isSelected()) {
                    heilkraftHTF.setEnabled(true);
                    jHeilkraft.setEnabled(true);
                    output.setText("Heilkraft zusätzlich!");
                } else {
                    heilkraftHTF.setEnabled(false);
                    jHeilkraft.setEnabled(false);
                }
            }
        });
        pack();
        setVisible(true);
    }


    private void onOK() {
        if(!heldCheckBox.isSelected() && choosePane.getSelectedComponent()==held) {
            if(kriegerRadioButton.isSelected()) {
                name = nameHTF.getText();
                lp = Integer.parseInt(lpHTF.getText());
                staerke = Integer.parseInt(staerkeHTF.getText());
                ausdauer = Integer.parseInt(ausdauerHTF.getText());
                //Krieger k = new Krieger(name, lp, ausdauer, staerke);
                // owner.heldenList.addItem(k);
                object = new Krieger(name, lp, ausdauer, staerke);
                System.out.println("Krieger");
            } else if(magierRadioButton.isSelected()) {
                name = nameHTF.getText();
                lp = Integer.parseInt(lpHTF.getText());
                heilkraft = Integer.parseInt(heilkraftHTF.getText());
                //Zauberer z = new Zauberer(name, lp,heilkraft);
                //owner.heldenList.addItem(z);
                object = new Zauberer(name, lp,heilkraft);
                System.out.println("Zauberer");
            }
        } else if(heldCheckBox.isSelected() && choosePane.getSelectedComponent()==held)  {
            name = nameHTF.getText();
            lp = Integer.parseInt(lpHTF.getText());
            //Held h = new Held(name, lp);
            //owner.heldenList.addItem(h);
            object = new Held(name, lp);
            System.out.println("Held");
        } else if(choosePane.getSelectedComponent()==monster) {
            name = nameMTF.getText();
            lp = Integer.parseInt(lpMTF.getText());
            aw = Integer.parseInt(awMTF.getText());
            object = new Monster(lp, aw, name);
        } else if(choosePane.getSelectedComponent()==waffe) {
            name = nameWTF.getText();
            magie = Integer.parseInt(magieWTF.getText());
            material = (Material) materialCmbBx.getSelectedItem();
            object = new Waffe(material, magie, name);
        }
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        this.dispose();
    }

    public Object getObject() {
        System.out.println("Object added!");
        return object;
    }

    public void setOwner(GUIForm frame) {
        owner = frame;
    }

    public static void main(String args[]) {
        Erschaffe dialog = new Erschaffe(null, null);
        dialog.pack();
        dialog.setVisible(true);
        //System.exit(0);
    }
}
