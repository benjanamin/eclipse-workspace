package Exercise1;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;


public class HelloWorld extends Applet {
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawString("Hello!, how are you doing?",10,10);
		
	}
	
}
