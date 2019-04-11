import processing.core.PApplet;

public class Pong extends PApplet {
	
	int width = 500;
	int height = 400;
	Paddle paddle;
	PongBall ball;
	
	public static void main( String args []) {
		PApplet.main(new String[] { "Pong" });
	}

	public void settings(){
		size(width, height);
	}

	public void setup() {
		frameRate(45);
		paddle = new Paddle(this);
		ball = new PongBall(this, paddle);
	}

	public void draw() {
		background(0);
		paddle.draw();		
		ball.draw();
	}
	
	public void keyPressed(){
		if (keyCode == LEFT)
			paddle.moveLeft();
		else if (keyCode == RIGHT)
			paddle.moveRight();
	}
}
