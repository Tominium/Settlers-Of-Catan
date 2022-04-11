package Panels.Components;

import Logic.Player;
import javax.swing.*;
import java.awt.*;

public class discardCardPanel extends JPanel {

    private Player player;
    private JButton close;
    private int numToDiscard;
    private GridBagLayout layout;
    private GridBagConstraints control;

    public discardCardPanel(Player player) {
        this.player = player;
        this.numToDiscard = 0;
        this.layout = new GridBagLayout();
        this.control = new GridBagConstraints();
        this.setLayout(this.layout);
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }



    }



