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

    public static class playerComp extends JPanel{
        private GridBagConstraints gbc;
        private Player info;

        public playerComp(Player p){
            setLayout(new GridBagLayout());
            info = p;
            gbc = new GridBagConstraints();
            JTextArea te = new JTextArea("Player " + info.getTurnNum());
            te.setBackground(Color.WHITE);
        }
    }
}

