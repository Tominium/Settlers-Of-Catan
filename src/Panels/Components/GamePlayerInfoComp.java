package Panels.Components;

import Logic.Player;

import javax.swing.*;
import java.awt.*;

public class GamePlayerInfoComp extends JPanel {

    private Player currentPlayer;
    private int rolledNum;
    private JButton rollButton;
    private GridBagLayout layout;
    private GridBagConstraints control;

    public GamePlayerInfoComp(Player cp) {
        currentPlayer = cp;
        JPanel win = this;
        win.setLayout(null);


        rollButton = new JButton("Roll Dice");
        rollButton.setBounds(300, 300, 60, 60);
        win.add(rollButton);

        setVisible(true);
    }

    public void nextPlayer(Player cp, int num) {

    }

    public void updateAll() {

    }
}
