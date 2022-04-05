import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class HelpMenu extends JFrame {

    private Object p = null;
    private JButton previousPageBtn;
    private JButton nextPageBtn;
    private JButton backBtn;

    private BufferedImage page1, page2, page3, page4, page5, page6, page7, page8, page9, page10, page11, page12, page13, page14, page15, page16, currentPage;

    {
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HelpMenu() {
        super("Help Menu");
        setSize(1800, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);


        JLabel page = new JLabel(new ImageIcon(page1));
page.setBounds( 0, 0, 1800, 900);

        add(page);


//create button to go to back to the main menu
        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Arial", Font.PLAIN, 10));
        backBtn.setBounds(10, 90, 150, 30);
        backBtn.setForeground(Color.black);
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    new MainMenu();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
                                  });
        add(backBtn);


        previousPageBtn = new JButton("Previous Page");
        previousPageBtn.setFont(new Font("Arial", Font.PLAIN, 10));
        previousPageBtn.setBounds(10, 10, 150, 30);
        previousPageBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentPage == page1) {
                    currentPage = page1;
                } else if (currentPage == page2) {
                    currentPage = page1;
                } else if (currentPage == page3) {
                    currentPage = page2;
                } else if (currentPage == page4) {
                    currentPage = page3;
                } else if (currentPage == page5) {
                    currentPage = page4;
                } else if (currentPage == page6) {
                    currentPage = page5;
                } else if (currentPage == page7) {
                    currentPage = page6;
                } else if (currentPage == page8) {
                    currentPage = page7;
                } else if (currentPage == page9) {
                    currentPage = page8;
                } else if (currentPage == page10) {
                    currentPage = page9;
                } else if (currentPage == page11) {
                    currentPage = page10;
                } else if (currentPage == page12) {
                    currentPage = page11;
                } else if (currentPage == page13) {
                    currentPage = page12;
                } else if (currentPage == page14) {
                    currentPage = page13;
                } else if (currentPage == page15) {
                    currentPage = page14;
                } else if (currentPage == page16) {
                    currentPage = page15;
                }
               // page.setIcon(new ImageIcon(currentPage));
            }
        }
        );
        add(previousPageBtn);


        nextPageBtn = new JButton("Next Page");
        nextPageBtn.setBounds(10, 50, 150, 30);
        nextPageBtn.setForeground(Color.black);
        nextPageBtn.setFont(new Font("Arial", Font.PLAIN, 10));
        nextPageBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                                              if (currentPage == page1) {
                                                  currentPage = page2;
                                              } else if (currentPage == page2) {
                                                  currentPage = page3;
                                              } else if (currentPage == page3) {
                                                  currentPage = page4;
                                              } else if (currentPage == page4) {
                                                  currentPage = page5;
                                              } else if (currentPage == page5) {
                                                  currentPage = page6;
                                              } else if (currentPage == page6) {
                                                  currentPage = page7;
                                              } else if (currentPage == page7) {
                                                  currentPage = page8;
                                              } else if (currentPage == page8) {
                                                  currentPage = page9;
                                              } else if (currentPage == page9) {
                                                  currentPage = page10;
                                              } else if (currentPage == page10) {
                                                  currentPage = page11;
                                              } else if (currentPage == page11) {
                                                  currentPage = page12;
                                              } else if (currentPage == page12) {
                                                  currentPage = page13;
                                              } else if (currentPage == page13) {
                                                  currentPage = page14;
                                              } else if (currentPage == page14) {
                                                  currentPage = page15;
                                              } else if (currentPage == page15) {
                                                  currentPage = page16;
                                              }
                                            //  page.setIcon(new ImageIcon(currentPage));

            }
        }
        );
        add(nextPageBtn);

        setTitle("Help");
        setSize(1800, 900);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.BLACK);
        add(page);
        //add(pageNumber);
        add(nextPageBtn);
        add(previousPageBtn);
        add(backBtn);
        setVisible(true);
    }





    public static void main(String[] args) {
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.setVisible(true);
    }
}