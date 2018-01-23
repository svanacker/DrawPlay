import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	private Photo photo;
	private Sun sun;
	private window w;
	private window w2;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		photo = new Photo();
		sun = new Sun();
		w= new window();
		w2= new window();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
		photo.draw(g, 200, 50);
		sun.draw(g, 150, 150);
		w.draw(g, 200,100);
		w2.draw(g, 300,200);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(400, 400);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
