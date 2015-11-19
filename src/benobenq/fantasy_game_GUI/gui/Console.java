package benobenq.fantasy_game_GUI.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Bent on 18.11.2015.
 */
public class Console extends JFrame{
    private JPanel RootPanel;
    private JTextArea consoleOutputTextArea;
    private JButton konsoleLöschenButton;
    private JTextArea consoleInputTextArea;

    public Console() {
        setContentPane(RootPanel);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        pack();
        consoleOutputTextArea.setEditable(false);
        konsoleLöschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consoleOutputTextArea.setText("");
            }
        });
        consoleInputTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER) {
                    String input = consoleInputTextArea.getText();
                        String[] inputBuffer = input.split(">");
                        speak(inputBuffer[1]);
                    consoleInputTextArea.setText(">");

                }
            }
        });
    }

    public void speak(String input) {
         System.out.println(consoleOutputTextArea.getLineCount());

        //consoleOutputTextArea.setRows(consoleInputTextArea.getLineCount()+1);
        consoleOutputTextArea.append(""+ input);
    }
}
