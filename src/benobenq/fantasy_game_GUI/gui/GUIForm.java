package benobenq.fantasy_game_GUI.gui;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bent on 24.10.2015.
 */
public class GUIForm extends JFrame {

    private JButton clickMEButton;
    private JPanel RootPanel;
    private JTable Gamefield;

    public GUIForm() {
        super("Ich");
        setContentPane(RootPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        clickMEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked me");

            }
        });
    }
}
