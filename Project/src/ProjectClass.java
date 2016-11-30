import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class ProjectClass extends JPanel {

	private int width = 100;
	private int height = 100;
	private int d = 50; //diameter
	private int x = 0;
	private int y = 0;
	private int moveX = 1;
	private int moveY = 1;
	Color ballColor = new Color(0x1825C7);
	
	

	private void moveBall(){
		if(x + moveX <= 0)
			moveX = 1;
		if (x + moveX > getWidth() - d)
			moveX = -1;
		if(y + moveY < 0)
			moveY = 1;
		if(y + moveY > getHeight() - d)
			moveY = -1;
		
		x += moveX;
		y += moveY;
	}

	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(ballColor);
		g2d.fillOval(x, y, d, d);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ProjectClass ProjectClass = new ProjectClass();

		frame.setSize(700, 800); //x, y
		frame.setLocation(300,200);
		frame.setDefaultCloseOperation(3);
		frame.add(ProjectClass);
		frame.setTitle("Project");
		frame.setResizable(false);
		frame.setVisible(true);

		while (true){
			ProjectClass.moveBall();
			ProjectClass.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}