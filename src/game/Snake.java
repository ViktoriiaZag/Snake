package game;

import java.awt.Point;
import java.util.ArrayList;

import gui.Gui;

public class Snake {
	public static boolean waitToMove = false;
	public static Head head = new Head(7,7);
	public static ArrayList<Tail> tails = new ArrayList<>();
	public static PickUp pickUp= new PickUp();
	
	public void addTail() {
		if(tails.size()<1) {
			tails.add(new Tail(head.getX(), head.getY()));
		}
		else {
			tails.add(new Tail(tails.get(tails.size()-1).x, tails.get(tails.size()-1).y));
		}
	}
	
	public static void move()
	{
		if(tails.size()>=2) {
			for(int i= tails.size()-1; i>=1; i--) {
				if(tails.get(i).isWait()) {
					tails.get(i).setWait(false);
				}
				else {
					tails.get(i).setX(tails.get(i-1).getX());
					tails.get(i).setY(tails.get(i-1).getY());
				}
			}
		}
		
		//Move first Tail to Head
		if(tails.size()>=1) {
			for(int i= tails.size()-1; i>=1; i--) {
				if(tails.get(0).isWait()) {
					tails.get(0).setWait(false);
				}
				else {
					tails.get(0).setX(head.getX());
					tails.get(0).setY(head.getY());
				}
			}
		}
		
		//move Head
		switch (head.getDir()) {
			case RIGHT: 
				head.setX(head.getX()+1);
				break;
				
			case UP: 
				head.setX(head.getY()-1);
				break;
				
			case LEFT: 
				head.setX(head.getX()-1);
				break;
				
			case DOWN: 
				head.setX(head.getY()+1);
				break;
		}
	}
	
	//Position von Koordinaten
	public static Point ptc(int x, int y) {
		Point point= new Point(0,0);
		point.x= x*32 +Gui.xoff;
		point.y= y*32 +Gui.yoff;
		
		return point;
	}
	
}
