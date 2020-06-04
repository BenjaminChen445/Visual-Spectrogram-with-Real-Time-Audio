import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet {
	
	PImage background;

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;

	public DrawingSurface() {
		super();
	}

	public void setup() {
		background = loadImage("background.png");
	}

	public void draw() {

		image(background, 0, 0);   

		pushMatrix();

		float ratioX = (float)width/DRAWING_WIDTH;
		float ratioY = (float)height/DRAWING_HEIGHT;

		scale(ratioX, ratioY);
		
		ellipse(400,300,400,400);

		popMatrix();
	}


}

