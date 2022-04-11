package Panels.Components;

import Logic.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class allPlayersSideComp extends JPanel{

    private ArrayList<Player> players;
    private GridBagConstraints control;
    private ArrayList<JButton> viewInventoryButtons;

    public allPlayersSideComp(ArrayList<Player> p) {
        players = p;
        setLayout(new GridBagLayout());
        control = new GridBagConstraints();

    }

    public void instantiateButtons() {

    }

    public void updateAll() {

    }
}
