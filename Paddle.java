import processing.core.PApplet;

public class Paddle {
	int screenWidth;
	int screenHeight;
	int paddleWidth;
	int paddleHeight;
	int xPos;
	int yPos;
	int speed = 7;
	
	PApplet canvas;
	
	Paddle(PApplet a) {
		canvas = a;
		screenWidth = a.width;
		screenHeight = a.height;
		paddleWidth = 50;
		paddleHeight = 5;
		yPos = screenHeight - paddleHeight;
		xPos = screenWidth / 2;
	}
	
	void draw() {
		canvas.rect(xPos, yPos, paddleWidth, paddleHeight);
	}
	
	void moveLeft() {
		if (xPos > 0)
			xPos -= speed;
	}
	
	void moveRight() {
		if (xPos + paddleWidth < screenWidth)
			xPos += speed;
	}
	
}
