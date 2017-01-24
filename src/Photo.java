import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Photo {
		private static final int PHOTO_LENGTH = 35;
		private static final int PHOTO_HEIGHT = 50;
		public void draw(Graphics g, int photoX, int photoY)
		{
				Graphics2D g2 = (Graphics2D) g;
				g2.setColor(Color.black);
				int xCoin1 = photoX + PHOTO_LENGTH;
				int yCoin1 = photoY;
				int xCoin2 = photoX + PHOTO_LENGTH;
				int yCoin2 = photoY + PHOTO_HEIGHT;
				int xCoin3 = photoX;
				int yCoin3 = photoY + PHOTO_HEIGHT;
				g2.drawLine(photoX, photoY, xCoin1, yCoin1);
				g2.drawLine(xCoin1, yCoin1, xCoin2, yCoin2);
				g2.drawLine(xCoin2, yCoin2, xCoin3, yCoin3);
				g2.drawLine(xCoin3, yCoin3, photoX, photoY);
				// text appears below mouse body, +10 places below
				// so it doesn't overlap the drawing
				g2.drawString("Cadre", photoX+4, photoY+PHOTO_HEIGHT+20);
		}
}