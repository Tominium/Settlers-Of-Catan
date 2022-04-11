package Panels.Components;

import Cards.DevelopmentCard;
import Logic.Player;

import javax.swing.*;
import java.awt.*;

public class InventoryPanel extends JPanel{
    private Player player;
    private JButton close;
    private GridBagLayout layout;
    private GridBagConstraints control;
    private DevelopmentCard devCard;
    private JLabel title;

    InventoryPanel(Player player) {
        close = new JButton("Close");
        layout = new GridBagLayout();
        control = new GridBagConstraints();
        this.player = player;
        devCard = new DevelopmentCard();
        title = new JLabel("Inventory");
    }

    public void useDevCard(){
      //  .useDevCard(player);
    }

    public InventoryPanel() {
        close = new JButton("Close");
        layout = new GridBagLayout();
        control = new GridBagConstraints();
        title = new JLabel("Inventory");
        //make the panel
        setLayout(layout);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(300, 300));
        //add the title
        control.gridx = 0;
        control.gridy = 0;
        control.gridwidth = 2;
        control.gridheight = 1;
        control.fill = GridBagConstraints.HORIZONTAL;
        control.weightx = 1;
        control.weighty = 0;
        control.anchor = GridBagConstraints.CENTER;
        control.insets = new Insets(10, 10, 10, 10);
        layout.setConstraints(title, control);
        add(title);

        //display the player's cards
        control.gridx = 0;
        control.gridy = 1;
        control.gridwidth = 1;
        control.gridheight = 1;
        control.fill = GridBagConstraints.HORIZONTAL;
        control.weightx = 1;
        control.weighty = 0;
        control.anchor = GridBagConstraints.CENTER;
        control.insets = new Insets(10, 10, 10, 10);
       // layout.setConstraints(devCard, control);
       // add(devCard);



    }

}



