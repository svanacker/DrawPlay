import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Photo {
		private static final int BODY_LENGTH = 50;
		private static final int BODY_HEIGHT = 50;
		public void draw(Graphics g, int photoX, int photoY)
		{
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(Color.black);
				int x = photoX + BODY_LENGTH/2;
				int y = photoY + BODY_HEIGHT;
				g2.drawLine(x, y, photoY, photoX);
				// text appears below mouse body, +10 places below
				// so it doesn't overlap the drawing
				g2.drawString("Cadre", photoX, photoY+BODY_HEIGHT+10);
		}
}