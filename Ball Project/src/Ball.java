import java.awt.*;

public class Ball {
	
	private static final int D = 50; //diameter
	private int x = 0;
	private int y = 0;
	private int moveX = 2;
	private int moveY = 2;
	private int score = 0;
	Color ballColor = new Color(0x1825C7);
	private BallClass ballclass;
	
	public Ball(BallClass ballclass){
		this.ballclass = ballclass;
		
	}
	
	private void moveBall(){
		if(x + moveX <= 0)
			moveX = 2;
		if (x + moveX > ballclass.getWidth() - D)
			moveX = -2;
		if(y + moveY < 0)
			moveY = 2;
		if(y + moveY > ballclass.getHeight() - D)
			ballclass.gameover();
		if(collision()){
			moveY = - 2;
			y = ballclass.racket.getY() - D;
			setScore(1);
			
		}
		
		x += moveX;
		y += moveY;
	}
	
	public void move(){
		moveBall();
	}
	
	
	public void paint(Graphics2D g){
		g.setColor(ballColor);
		g.fillOval(x, y, D, D);
		
	}
	
	private Rectangle getBounds(){
		return new Rectangle(x, y, D, D);
		
	}
	
	private boolean collision(){
		return ballclass.racket.getBounds().intersects(getBounds());
		
	}
	
	public void setScore(int score){
		this.score += score;
		
	}
	
	public int getScore(){
		return score;
	}

}
