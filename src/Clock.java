import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Clock {

	private static final int HEAD_DIMENSION = 200;

	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.white);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		g2.drawString("Clock", catX, catY+HEAD_DIMENSION+10);	
	}
}
