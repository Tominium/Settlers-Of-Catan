package Panels.Components;

import Logic.GameState;
import Logic.Player;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class allPlayersSideComp extends JPanel{

    private ArrayList<Player> players;
    private GridBagConstraints control;
    private ArrayList<playerComp> comps;

    public allPlayersSideComp() {
        players = new ArrayList<Player>();
        players.add(new Player("red", 1));
        players.add(new Player("blue", 2));
        players.add(new Player("green", 3));
        players.add(new Player("orange", 4));
        setLayout(new GridBagLayout());
        control = new GridBagConstraints();
        comps = new ArrayList<>();
        int i = 0;
        for(Player pp: players){
            comps.add(new playerComp(pp));
            control.gridy=i;
            control.weighty = 40;
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
            setBackground();
            updateText();
            setFont(loadFont("/Assets/ArchitectsDaughter.ttf", 15f));
            setText(text);
            setEditable(false);
            setOpaque(false);
            setBorder(null);
            setRadius(75);


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

        public Font loadFont(String path, float size){
            try {
                InputStream fileStream = this.getClass().getResourceAsStream(path);
                Font myFont = Font.createFont(Font.TRUETYPE_FONT, fileStream);
                return myFont.deriveFont(Font.PLAIN, size);
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
            return null;
        }

        public void setBackground(){
            if(info.getColor().toLowerCase().equals("red")){setBackground(new Color(172, 44, 7));}
            else if(info.getColor().toLowerCase().equals("green")){setBackground(new Color(87,172,57));}
            else if(info.getColor().toLowerCase().equals("orange")){setBackground(new Color(225,99,40, 255));}
            else{setBackground(new Color(79,166,235));}
        }
    }

}

