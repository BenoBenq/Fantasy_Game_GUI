package benobenq.fantasy_game_GUI.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        super("Ich");
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        erschaffenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog d = new JDialog(f);
                d.setTitle("Erschaffe Held");
                d.setSize(200, 200);
                d.setVisible(true);
            }
        });
        erschaffenButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog d = new JDialog(f);
                d.setTitle("Erschaffe Monster");
                d.setSize(200, 200);
                d.setVisible(true);
            }
        });
    }
}
