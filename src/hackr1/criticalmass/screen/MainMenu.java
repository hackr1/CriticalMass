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
	public JButton close;
	
	private GameWindow gameWindow;
	
	public MainMenu(GameWindow gameWindow) {
		
		this.gameWindow = gameWindow;
		
		//set absolute layout
		this.setLayout(null);
		gameWindow.setResizable(false);
		
		
		//preload buttons
	    ImageIcon texplay = new ImageIcon("./texture/png/menu/play.png");
	    ImageIcon texplayh = new ImageIcon("./texture/png/menu/playh.png");
	    ImageIcon texoptions = new ImageIcon("./texture/png/menu/options.png");
	    ImageIcon texoptionsh = new ImageIcon("./texture/png/menu/optionsh.png");
	    ImageIcon texexitgame = new ImageIcon("./texture/png/menu/exitgame.png");
	    ImageIcon texexitgameh = new ImageIcon("./texture/png/menu/exitgameh.png");
	    ImageIcon texclose = new ImageIcon("./texture/png/menu/close.png");
	    
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
		
		close = new JButton(texclose);
		close.setOpaque(false);
		close.setContentAreaFilled(false);
		close.setBorderPainted(false);
		close.setFocusPainted(false);
		close.setSize(16, 16);
		close.setLocation(836, 10);
		this.add(close);
		close.addActionListener(this);
		
	}
	
	public void paintComponent(Graphics g)
	{
	    try{
	    
	    //paint background
	    BufferedImage tile = ImageIO.read(new File("./texture/png/menu/bg.png"));
	    int bgx = 6;
	    int bgy = 6;
	    while (bgx <= (this.getWidth()))
	    {
	    	while (bgy <= (this.getHeight()))
	    	{
	    		g.drawImage(tile, bgx, bgy, null);
	    		bgy += tile.getHeight();
	    	}
	    	bgx += tile.getWidth();
	    	bgy = 6;
	    }
	    
	    //paint border
	    BufferedImage bordervertical = hackr1.criticalmass.util.Util.resizeImage(ImageIO.read(new File("./texture/png/menu/border.png")), 6, 510);
		g.drawImage(bordervertical, 0, 0, null);
		g.drawImage(bordervertical, this.getWidth() - 6, 0, null);
	    
		BufferedImage borderhorizontal = hackr1.criticalmass.util.Util.resizeImage(ImageIO.read(new File("./texture/png/menu/border.png")), 864, 6);
		g.drawImage(borderhorizontal, 0, 0, null);
		g.drawImage(borderhorizontal, 0, this.getHeight() - 6, null);
		
	    //paint headline
	    BufferedImage headline = ImageIO.read(new File("./texture/png/menu/headline.png"));
	    g.drawImage(headline, 90, 0, null);
	    
	    }catch(IOException e){
	    	System.out.println("java.io.IOException while setting up main menu!");
	    }
		
	}
	
	 public void actionPerformed(ActionEvent e) { 
	        
		 if(e.getSource().equals(exitgame) || e.getSource().equals(close)){ 
	        	System.out.println("exiting game...");
	            gameWindow.setEnabled(false);
	            gameWindow.setVisible(false);
	            System.out.println("game closed.");
	            System.exit(0);
	     } 
		 if(e.getSource().equals(play)){ 
	        	System.out.println("starting singleplayer game...");
	        	this.setVisible(false);
	            gameWindow.quickstartSP();
	     } 
	 }
	
}
