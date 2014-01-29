package hackr1.criticalmass.game;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class CriticalMassGame extends BasicGame {

	public CriticalMassGame(String title) {
		super(title);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {

	}

	
	@Override
	public void update(GameContainer gc, int i) throws SlickException {

	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawString("Howdy!", 40, 40);
	}
	
}
