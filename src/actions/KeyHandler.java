package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.Dir;
import game.Snake;

public class KeyHandler  implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			// nach oben
			case KeyEvent.VK_W: {
				if(!(Snake.head.getDir()== Dir.DOWN) && !Snake.waitToMove) {
					Snake.head.setDir(Dir.UP);
					Snake.waitToMove= true;
				}
				break;
			}
			
			// nach links
			case KeyEvent.VK_A: {
				if(!(Snake.head.getDir()== Dir.RIGHT) && !Snake.waitToMove) {
					Snake.head.setDir(Dir.LEFT);
					Snake.waitToMove= true;
				}
				break;
			}
			
			// nach unten
			case KeyEvent.VK_S: {
				if(!(Snake.head.getDir()== Dir.UP) && !Snake.waitToMove) {
					Snake.head.setDir(Dir.DOWN);
					Snake.waitToMove= true;
				}
				break;
			}
			
			// nach rechts
			case KeyEvent.VK_D: {
				if(!(Snake.head.getDir()== Dir.LEFT) && !Snake.waitToMove) {
					Snake.head.setDir(Dir.RIGHT);
					Snake.waitToMove= true;
				}
				break;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
