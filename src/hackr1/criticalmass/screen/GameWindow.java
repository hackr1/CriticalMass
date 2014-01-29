package hackr1.criticalmass.screen;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import hackr1.criticalmass.CriticalMass;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {

	public JPanel mainMenu;
	
	public GameWindow(CriticalMass game) {
		this.setUndecorated(true);
		this.setTitle("Critical Mass Launcher");
		try {
			this.setIconImage(ImageIO.read(new File("./assets/png/icon.png")));
		} catch (IOException e) {
		}
		
		//set window dimensions and center window
		this.setSize(864, 510);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);
		
		//display main menu
		this.mainMenu = new MainMenu(this);
		this.add(mainMenu);
		
		
	}
	
	
	public void quickstartSP()
	{
		GameScreenSP gameScreenSP = new GameScreenSP();
		this.setVisible(false);
	}
	

}
