package benobenq.fantasy_game_GUI.gui;

import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

/**
 * Created by Bent on 24.10.2015.
 */
public class GUIForm extends JFrame {

    private JButton clickMEButton;
    private JPanel RootPanel;
    private JButton erschaffenButton;
    private JButton erschaffenButton1;
    private JFrame f = this;

    public GUIForm() {
        super("Spiel");
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        erschaffenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JDialog d = new JDialog(f,true);
                final JLabel l = new JLabel("Name:");
                final JTextField t = new JTextField("Name");
                t.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            String text = t.getText();
                            System.out.println(text);
                            d.dispose();
                        }
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });
                d.getContentPane().add(l);
                d.getContentPane().add(t);
                d.setTitle("Erschaffe Held");
                d.setSize(200, 200);
                d.setVisible(true);
            }
        });
        erschaffenButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*JDialog d = new JDialog(f,true);
                d.setTitle("Erschaffe Monster");
                d.setSize(200, 200);
                d.setVisible(true);*/
                Erschaffe.main(null);
            }
        });
    }
}
