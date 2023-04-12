package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import game.Snake;

public class Draw extends JLabel {
	
	Point point;
	
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2d= (Graphics2D)graphics;
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		//Draw Background
		graphics.setColor(Color.LIGHT_GRAY);
		graphics.fillRect(0, 0, Gui.width, Gui.height);
		
		//Draw snake tails
		graphics.setColor(new Color(51,204,51));
		for(int i=0; i<Snake.tails.size(); i++) {
			point= Snake.ptc(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
			graphics.fillRect(point.x, point.y, 32, 32);
		}
		
		//Draw Snake Head
		graphics.setColor(new Color(0, 153,0));
		point= Snake.ptc(Snake.head.getX(), Snake.head.getY());
		graphics.fillRect(point.x, point.y, 32, 32);
		
		//Draw PickUp
		graphics.setColor(new Color(204,51,0));
		point= Snake.ptc(Snake.pickUp.getX(),Snake.pickUp.getY());
		graphics.fillRect(point.x, point.y, 32, 32);
		
		
		
		//Draw Grid
		graphics.setColor(Color.GRAY);
		for(int i=0; i<16; i++) {
			for(int j=0; j<16; j++) {
			graphics.drawRect(i*32+Gui.xoff, j*32+Gui.yoff, 32, 32);
			}
		}
		
		
		//Draw Border
		graphics.setColor(Color.BLACK);
		graphics.drawRect(Gui.xoff, Gui.yoff, 512, 512);
		
		repaint();
		
		
		
	}
}
