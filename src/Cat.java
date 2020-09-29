import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 150;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 30;
	private static final int EYE_WIDTH = 30;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/3;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/6 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/6 * 4;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.gray);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes with pupils
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		g2.setColor(Color.black);
		g2.fillOval(x+EYE_WIDTH/3, y, EYE_WIDTH/4, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.setColor(Color.green);
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		g2.setColor(Color.black);
		g2.fillOval(x+EYE_WIDTH/3, y, EYE_WIDTH/4, EYE_HEIGHT);

		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +20 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow", catX+HEAD_DIMENSION/3, catY+HEAD_DIMENSION+20);	
	}
}
