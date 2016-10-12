import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class ProjectClass extends JPanel {

	private int width = 100;
	private int height = 100;
	private int d = 50;
	
		
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ProjectClass ProjectClass = new ProjectClass();
		
		
		
	 
		
	}
	


    public void paint(Graphics g){
    	g.setColor(Color.black);
    	g.fillRect(0, 0, 700, 800);
    	g.setColor(Color.red);
    	g.drawRect(70, 100, width, height);
    	g.setColor(Color.GREEN);
    	g.fillRect(160, 200, width, height);
    	g.setColor(Color.blue);
    	g.drawOval(30, 250, d, d);
    	g.setColor(Color.ORANGE);
    	g.fillOval(400, 520, d, d);
    	
    }

}
