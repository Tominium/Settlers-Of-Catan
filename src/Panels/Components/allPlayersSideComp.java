package Panels.Components;

import Logic.GameState;
import Logic.Player;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class allPlayersSideComp extends JPanel{

    private ArrayList<Player> players;
    private GridBagConstraints control;
    private ArrayList<playerComp> comps;

    public allPlayersSideComp() {
        players = new ArrayList<Player>();
        players.add(new Player("red", 0));
        players.add(new Player("blue", 1));
        setLayout(new GridBagLayout());
        control = new GridBagConstraints();
        comps = new ArrayList<>();
        int i = 0;
        for(Player pp: players){
            comps.add(new playerComp(pp));
            control.gridy=i;
            control.weighty = 5;
            control.gridx=0;
            add(comps.get(comps.size()-1), control);
            i++;
        }

        setPreferredSize(new Dimension(500, 1000));
    }


    public void updateAll() {
        for(playerComp cmp: comps){
            cmp.updateAll();
        }
        repaint();
        revalidate();
    }

    public static class playerComp extends JTextPane {
        private Player info;
        private String text;
        private int radius;

        public playerComp(Player p){
            info = p;
            updateText();
            setBackground(Color.GRAY);
            setText(text);
            setEditable(false);
            setOpaque(false);
            setBorder(null);
            setRadius(20);

            setDragEnabled(false);
            StyledDocument doc = this.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
            addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent me)
                {
                   System.out.println(info.getColor());
                }
            });
        }

        public void updateText(){
            text = "Player " + info.getTurnNum() + "\n" + "Points: " + info.getPoints() + "\n" + "Resource Cards: " + info.getRC().size() + "\n" + "Development Cards: " + info.getDC().size();
        }

        public void updateAll(){
            updateText();
            setText(text);
            revalidate();
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getRadius(), getRadius());
            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(102, 102, 102));
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getRadius(), getRadius());
        }

        public void setRadius(int radius) {
            this.radius = radius;
            repaint();
        }

        public int getRadius() {
            return radius;
        }

        @Override
        public Insets getInsets() {
            int value = getRadius() / 2;
            return new Insets(value, value, value, value);
        }
    }

}

