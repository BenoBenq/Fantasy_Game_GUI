package benobenq.fantasy_game_GUI.gui;

import benobenq.fantasy_game_GUI.held.Held;
import benobenq.fantasy_game_GUI.held.Krieger;
import benobenq.fantasy_game_GUI.held.Zauberer;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class Erschaffe extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nameTF;
    private JTextField lpTF;
    private JCheckBox heldCheckBox;
    private JRadioButton kriegerRadioButton;
    private JRadioButton magierRadioButton;
    private JTextField staerkeTF;
    private JTextField ausdauerTF;
    private JTextField heilkraftTF;

    private String name;
    private int lp;
    private int staerke;
    private int ausdauer;
    private int heilkraft;

    public Erschaffe() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = nameTF.getText();
                lp = Integer.parseInt(lpTF.getText());
                staerke = Integer.parseInt(staerkeTF.getText());
                ausdauer = Integer.parseInt(ausdauerTF.getText());
                heilkraft = Integer.parseInt(heilkraftTF.getText());
                if(!heldCheckBox.isSelected()) {
                    if(kriegerRadioButton.isSelected()) {
                        Krieger k = new Krieger(name, lp, ausdauer, staerke);
                        System.out.println("Krieger");
                    } else {
                        Zauberer z = new Zauberer(name, lp,heilkraft);
                        System.out.println("Zauberer");
                    }
                } else {
                    Held h = new Held(name, lp);
                    System.out.println("Held");
                }

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
        nameTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String text = nameTF.getText();
                    name = text;
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
                    ausdauerTF.setEnabled(false);
                    staerkeTF.setEnabled(false);
                    heilkraftTF.setEnabled(false);
                }
            }
        });
        kriegerRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(kriegerRadioButton.isSelected()) {
                    ausdauerTF.setEnabled(true);
                    staerkeTF.setEnabled(true);
                } else {
                    ausdauerTF.setEnabled(false);
                    staerkeTF.setEnabled(false);
                }
            }
        });
        magierRadioButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(magierRadioButton.isSelected()) {
                    heilkraftTF.setEnabled(true);
                } else {
                    heilkraftTF.setEnabled(false);
                }
            }
        });
    }


    private void onOK() {
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        this.dispose();
    }

    public static void main(String[] args) {
        Erschaffe dialog = new Erschaffe();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
