package Panels.Components;

import Cards.DevelopmentCard;

import javax.swing.*;
import java.awt.*;

public class InventoryPanel {
    private Player player;
    private JButton close;
    private GridBagLayout layout;
    private GridBagConstraints control;
    private DevelopmentCard devCard;

    InventoryPanel(Player player) {
        this.player = player;
        this.layout = new GridBagLayout();
        this.control = new GridBagConstraints();
        this.devCard = new DevelopmentCard();
    }

    public use

}
