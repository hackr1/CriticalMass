package hackr1.criticalmass;

import hackr1.criticalmass.screen.*;

public class CriticalMass {
	
	public int launchmode;
	public int graphicsmode;
	
	public static String getVersion() {
		return "alpha 1.0";
	}
	
	public CriticalMass(String[] args) {
		System.out.println("Critical Mass version " + getVersion() + " loading...");
		System.out.println("Initializing mode...");
		if(args.length <= 0){
			System.out.print("Running in play mode.\nRelaunch with argument \"-dev\" to display debug information.\n");
			launchmode = 0;
			System.out.println("Graphics Mode: Windowed.");
			System.out.println("Initializing Game Window...");
			GameWindow gameWindow = new GameWindow(this);
			System.out.println("Game Window Initialized. Starting Game...");
			gameWindow.setVisible(true);
		}else{
			if(args[0] == "-dev"){
				System.out.print("Running in development mode.\nDebug information will be displayed.\nTo disable, restart game.\n");
				launchmode = 1;
			}else{
				System.out.print("Running in play mode.\nRelaunch with argument \"-dev\" to display debug information.\n");
				launchmode = 0;
			}
			if(args[1] == "-windowed" || args[1] == null) {
				System.out.println("Graphics Mode: Windowed.");
				System.out.println("Initializing Game Window...");
				GameWindow gameWindow = new GameWindow(this);
				System.out.println("Game Window Initialized. Starting Game...");
				gameWindow.setVisible(true);
			}
		}
		
		
	}
	
	//self-instantiation
	public static CriticalMass instance;
	public static void main(String[] args) {
		CriticalMass me = new CriticalMass(args);
		CriticalMass.instance = me;
	}
	
}
