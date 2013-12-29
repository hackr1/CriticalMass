package hackr1.criticalmass.screen;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MainMenu extends JPanel {
	
	public JButton play;
	public JButton options;
	public JButton exitgame;
	
	public MainMenu() {
		this.setLayout(null);
	    ImageIcon texbutton = new ImageIcon("./assets/png/menu/button.png");
	    ImageIcon texbuttonh = new ImageIcon("./assets/png/menu/button_highlighted.png");
		play = new JButton(texbutton);
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setBorderPainted(false);
		play.setFocusPainted(false);
		play.setRolloverEnabled(true); // turn on before rollovers work
		play.setRolloverIcon(texbuttonh);
		play.setBounds(355, 200, 150, 50);
		this.add(play);
	}
	
	public void paintComponent(Graphics g)
	{
	    try{
	    BufferedImage headline = ImageIO.read(new File("./assets/png/menu/headline.png"));
	    g.drawImage(headline, 90, 0, null);
	    
	    BufferedImage play = ImageIO.read(new File("./assets/png/menu/play.png"));
	    g.drawImage(play, 355, 200, null);
	    
	    }catch(IOException e){
	    	System.out.println("java.io.IOException while setting up main menu!");
	    }
		
	}

}
