package hackr1.criticalmass.screen;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class MainMenu extends JPanel implements ActionListener {
	
	public JButton play;
	public JButton options;
	public JButton exitgame;
	
	private GameWindow gameWindow;
	
	public MainMenu(GameWindow gameWindow) {
		
		this.gameWindow = gameWindow;
		
		//set absolute layout
		this.setLayout(null);
		gameWindow.setResizable(false);
		
		
		//preload buttons
	    ImageIcon texplay = new ImageIcon("./assets/png/menu/play.png");
	    ImageIcon texplayh = new ImageIcon("./assets/png/menu/playh.png");
	    ImageIcon texoptions = new ImageIcon("./assets/png/menu/options.png");
	    ImageIcon texoptionsh = new ImageIcon("./assets/png/menu/optionsh.png");
	    ImageIcon texexitgame = new ImageIcon("./assets/png/menu/exitgame.png");
	    ImageIcon texexitgameh = new ImageIcon("./assets/png/menu/exitgameh.png");
	    
	    //display buttons
		play = new JButton(texplay);
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setBorderPainted(false);
		play.setFocusPainted(false);
		play.setRolloverEnabled(true);
		play.setRolloverIcon(texplayh);
		play.setBounds(355, 200, 150, 50);
		this.add(play);
		play.addActionListener(this);
		
		options = new JButton(texoptions);
		options.setOpaque(false);
		options.setContentAreaFilled(false);
		options.setBorderPainted(false);
		options.setFocusPainted(false);
		options.setRolloverEnabled(true); 
		options.setRolloverIcon(texoptionsh);
		options.setBounds(355, 270, 150, 50);
		this.add(options);
		options.addActionListener(this);
		
		exitgame = new JButton(texexitgame);
		exitgame.setOpaque(false);
		exitgame.setContentAreaFilled(false);
		exitgame.setBorderPainted(false);
		exitgame.setFocusPainted(false);
		exitgame.setRolloverEnabled(true); 
		exitgame.setRolloverIcon(texexitgameh);
		exitgame.setBounds(355, 340, 150, 50);
		this.add(exitgame);
		exitgame.addActionListener(this);
		
		
	}
	
	public void paintComponent(Graphics g)
	{
	    try{
	    
	    //paint background
	    BufferedImage tile = ImageIO.read(new File("./assets/png/menu/bg.png"));;
	    int bgx = 0;
	    int bgy = 0;
	    while (bgx <= (this.getWidth()))
	    {
	    	while (bgy <= (this.getHeight()))
	    	{
	    		g.drawImage(tile, bgx, bgy, null);
	    		bgy += tile.getHeight();
	    	}
	    	bgx += tile.getWidth();
	    	bgy = 0;
	    }
		
	    
	    //paint headline
	    BufferedImage headline = ImageIO.read(new File("./assets/png/menu/headline.png"));
	    g.drawImage(headline, 90, 0, null);
	    
	    }catch(IOException e){
	    	System.out.println("java.io.IOException while setting up main menu!");
	    }
		
	}
	
	 public void actionPerformed(ActionEvent e) { 
	        
		 if(e.getSource().equals(exitgame)){ 
	        	System.out.println("exiting game...");
	            gameWindow.setEnabled(false);
	            gameWindow.setVisible(false);
	            System.out.println("game closed.");
	            System.exit(0);
	     } 
	 }
	
}
