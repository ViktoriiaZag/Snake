package gui;

import javax.swing.JFrame;
import javax.swing.border.TitledBorder;

import actions.KeyHandler;

public class Gui {
	JFrame jF;
	Draw draw;
	
	public static int width=800, height=600;
	public static int xoff=130, yoff=20;
	
	
	 public void create() 
	 {
		 jF= new JFrame("Snake");
		 jF.setSize(width, height);
		 jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jF.setLocationRelativeTo(null);
		 jF.setLayout(null);
		 jF.setResizable(false);
		 jF.addKeyListener(new KeyHandler());
		
		 draw= new Draw();
		 draw.setBounds(0, 0, width, height);
		 draw.setVisible(true);
		 
		 jF.add(draw);
		 jF.requestFocus();
		 jF.setVisible(true);
	 }
}
