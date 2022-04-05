package Structures;


import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class HelpMenu extends JPanel implements ActionListener
{
    private MainMenu p = null;
    private JButton previousPageBtn, nextPageBtn, backToMenuBtn;
    private int pageIndex;
    private BufferedImage page1, page2, page3, page4, page5, page6, page7, page8, page9, page10, page11, page12, page13, page14, page15, page16,  currentPage;
    private int x;
    private ArrayList<BufferedImage> menuAL;
    public HelpMenu()
    {
        this.p = p;
        pageIndex = 1;
        GridBagLayout gridbag = new GridBagLayout();
        setLayout(gridbag);
        menuAL = new ArrayList<>();

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20,0,0,0);
        c.anchor=GridBagConstraints.SOUTH;

        c.insets = new Insets(10,0,35,0);
        previousPageBtn = new JButton("  previous  ");
        previousPageBtn.setForeground(Color.WHITE);
        Dimension d = new Dimension(90,50);
        previousPageBtn.setPreferredSize(d);
        previousPageBtn.addActionListener(this);
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 0;
        add(previousPageBtn, c);



        nextPageBtn = new JButton(" next ");
        nextPageBtn.setForeground(Color.WHITE);
        d = new Dimension(75,50);
        nextPageBtn.setPreferredSize(d);
        nextPageBtn.addActionListener(this);
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 0;
        add(nextPageBtn, c);


        backToMenuBtn = new JButton(" back");
        backToMenuBtn.setForeground(Color.WHITE);
        d = new Dimension(75,50);
        backToMenuBtn.setPreferredSize(d);
        backToMenuBtn.addActionListener(this);
        c.anchor=GridBagConstraints.CENTER;
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 0;
        add(backToMenuBtn, c);


        try
        {
            page1 = ImageIO.read(new File("src/Images/0001.jpg"));
            page2 = ImageIO.read(new File("src/Images/0002.jpg"));
            page3 = ImageIO.read(new File("src/Images/0003.jpg"));
            page4 = ImageIO.read(new File("src/Images/0004.jpg"));
            page5 = ImageIO.read(new File("src/Images/0005.jpg"));
            page6 = ImageIO.read(new File("src/Images/0006.jpg"));
            page7 = ImageIO.read(new File("src/Images/0007.jpg"));
            page8 = ImageIO.read(new File("src/Images/0008.jpg"));
            page9 = ImageIO.read(new File("src/Images/0009.jpg"));
            page10 = ImageIO.read(new File("src/Images/0010.jpg"));
            page11 = ImageIO.read(new File("src/Images/0011.jpg"));
            page12 = ImageIO.read(new File("src/Images/0012.jpg"));
            page13 = ImageIO.read(new File("src/Images/0013.jpg"));
            page14 = ImageIO.read(new File("src/Images/0014.jpg"));
            page15 = ImageIO.read(new File("src/Images/0015.jpg"));
            page16 = ImageIO.read(new File("src/Images/0016.jpg"));
            Dimension size = new Dimension(page1.getWidth(null), page1.getHeight(null));
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
        }
        catch(Exception E)
        {
            System.out.println("Exception");
            return;
        }
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int index = getPageIndex();
        setCurrentPage(index);
        g.drawImage(currentPage, 349, 0, 510, 650, null);
    }

    public int getPageIndex()
    {
        return pageIndex;
    }

    public void setCurrentPage(int i)
    {
        currentPage = menuAL.get(i-1);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == previousPageBtn)
        {
            try
            {
                pageIndex--;
                if(pageIndex == 0)
                {
                    pageIndex = 8;
                }
                repaint();
            }
            catch(Exception ex)
            {
                return;
            }
        }
        else if(e.getSource() == nextPageBtn)
        {
            try
            {
                pageIndex++;
                if(pageIndex == 9)
                {
                    pageIndex = 1;
                }
                repaint();
            }
            catch(Exception ex)
            {
                return;
            }
        }
        else if(e.getSource() == backToMenuBtn)
        {
            try
            {
                pageIndex = 1;
            }
            catch(Exception ex)
            {
                return;
            }
        }

    }


}