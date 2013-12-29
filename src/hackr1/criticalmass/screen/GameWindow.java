package hackr1.criticalmass.screen;

import java.awt.*;

import javax.swing.*;

import hackr1.criticalmass.CriticalMass;

@SuppressWarnings("serial")
public class GameWindow extends JFrame {

	public JPanel mainMenu;
	
	public GameWindow(CriticalMass game) {
		
		this.setTitle("Critical Mass");
		
		//set window dimensions and center window
		this.setSize(860, 520);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);
		
		//display main menu
		this.mainMenu = new MainMenu();
		this.add(mainMenu);
		
	}
	


	

}
