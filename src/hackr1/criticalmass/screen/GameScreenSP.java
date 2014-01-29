package hackr1.criticalmass.screen;


import org.newdawn.slick.*;

import hackr1.criticalmass.game.*;

public class GameScreenSP{

	public GameScreenSP() {
		try {
			
			/*
 			CanvasGameContainer canvasgc = new CanvasGameContainer(new CriticalMassGame("Critical Mass - Singleplayer"));
			this.add(canvasgc);
			canvasgc.setSize(this.getWidth(), this.getHeight());
			canvasgc.setLocation(0, 0);
			canvasgc.setVisible(true);
			canvasgc.start();
			*/
			
			//*
			AppGameContainer appgc;
			appgc = new AppGameContainer(new CriticalMassGame("Critical Mass - Singleplayer"));
			appgc.setDisplayMode(860, 520, false);
			appgc.start();
			appgc.setShowFPS(false);
			
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}


}
