import processing.core.PApplet;

public class PongBall {
	int size = 20;
	int xPos = 2 + size;
	int yPos = 2 + size;
	int speedX = 2;
	int speedY = 2;
	int xDirection = 1;
	int yDirection = 1;
	
	//Pong game;
	PApplet canvas;
	Paddle paddle;
	
	//constructor
	public PongBall(PApplet a, Paddle p) {
		//game = (Pong)a;
		canvas = a;
		paddle = p;
	}
	
	public void draw() {
		canvas.ellipse(xPos, yPos, size, size);//why do we need to put game. before ellipse?
		xPos = xPos + xDirection * speedX;
		yPos = yPos + yDirection * speedY;
		bounce();
	}
	
	public void bounce() {
		if (xPos - size/2 <= 0 || xPos + size/2 >= canvas.width) //If the ball hits
			//the left or right side of the screen
			xDirection *= -1;
		if (yPos - size/2 <= 0 || //If the ball hits the top of the screen 
				(yPos + size/2 >= (canvas.height - paddle.paddleHeight) && (xPos >= paddle.xPos && xPos <= paddle.xPos + paddle.paddleWidth)))
			yDirection *= -1;
		
	}
	
}
