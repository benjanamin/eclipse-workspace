import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class Mickey extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mickey Mouse");
        Canvas canvas = new Mickey();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Rectangle bb = new Rectangle(100, 100, 200, 200);
        mickey(g, bb,5);
        
    }

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void mickey(Graphics g, Rectangle bb,int i) {
        boxOval(g, bb);
        if(i>0) {
        int dx = bb.width / 2;
        int dy = bb.height / 2;
        Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

        half.translate(-dx / 2, -dy / 2);
        mickey(g, half,i-1);
        
        half.translate(dx * 2, 0);
        boxOval(g, half);
        mickey(g,half,i-1);
        
        }
        else {
        	
        }
    }

}
