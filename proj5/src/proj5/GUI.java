package proj5;

/**
 * <p>Title: The GUI class</p>
 *
 * <p>Description: This class provides a graphical user interface for a dice
 * game played with 5 dice</p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * @author CMP 210 Instructor
 * @version 1.0
 */

import java.awt.*;
import javax.swing.*;
import java.net.*;

public class GUI
{
      final int MAX_DICE = 5; // max number of dice
      private int numDice; // number of dice
      private int num; // number of dice currently displayed

      private JPanel mainPanel; // main window
      private JPanel playerPanel; // player panel

      private ImageIcon images[]; // stores the .gif files
      private JLabel imageIconLabels[]; // displays the images and appropriate text

      private ImageIcon defaultImage;

      /**
       * GUI constructor -- gets called when an object of the GUI class is
       * instantiated -- provides space for 5 dice
       */
      public GUI()
      {
            numDice = 5;
            num = 0;
            createPlayerPanel();
            createMainPanel();
            finishSetup();
      }

      /**
       * private method -- creates the player panel that can have a
       * maximum of 5 dice - sets the dice to the ones die and
       * labels each die
       */
      private void createPlayerPanel()
      {
            images = new ImageIcon[numDice];
            imageIconLabels = new JLabel[numDice];
            playerPanel = new JPanel();
            playerPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Yahtzee"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

            for(int i = 0; i < numDice; i++)
            {

              images[i] = new ImageIcon("diceImages/d1.gif");
              imageIconLabels[i] = new JLabel();
              imageIconLabels[i].setVerticalTextPosition(3);
              imageIconLabels[i].setHorizontalTextPosition(0);
              imageIconLabels[i].setIcon(images[i]);
              imageIconLabels[i].setText(String.valueOf(String.valueOf((new StringBuffer("Die ")).append(i + 1))));
              playerPanel.add(imageIconLabels[i]);
            }

      }

      /**
       * private method -- loads and stores the default image
       */
      private void getDefaultImage()
      {
            URL url;
            Image image;

            url = this.getClass().getClassLoader().getResource("diceImages/d1.gif");

            image = Toolkit.getDefaultToolkit().getImage(url);
            defaultImage = new ImageIcon(image);
      }

      /**
       * private method -- creates the main window and adds the player panel to it
       */
      private void createMainPanel()
      {
            mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, 0));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            mainPanel.add(playerPanel);
      }

      /**
       * private method -- completes the setup by packing the cardFrame and
       * making the window visible
       */
      private void finishSetup()
      {
            JFrame cardFrame = new JFrame("Dice Game");
            cardFrame.setDefaultCloseOperation(3);
            cardFrame.setContentPane(mainPanel);
            cardFrame.pack();
            cardFrame.setVisible(true);
      }

      /**
       * showDice method -- this method displays the appropriate dice images
       * @param theDice a reference to a DiceArray object
       */
      public void showDice(DiceArray theDice)
      {
        int[] dice = theDice.getDice();

        URL url;
        Image image;
        String allDice = "";
        
        for (int i=0; i<dice.length; i++)
        {
          String imageName = ("diceImages/d" + dice[i] + ".gif");
          images[i] = new ImageIcon(imageName);
          imageIconLabels[i].setIcon(images[i]);
          allDice += dice[i] + " ";
        }
        System.out.println(allDice);
      }
}
