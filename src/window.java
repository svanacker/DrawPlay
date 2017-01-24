import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class window {
	private static final int Longeurs= 160; 
	private static final int largeurs= 100; 
	public void draw(Graphics g, int windowX, int windowY)
	{
	Graphics2D g2 = (Graphics2D) g;
	g2.setColor(Color.blue);
	g2.fillRect(windowX, windowY,largeurs , Longeurs);
	
	}
}
