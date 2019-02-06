import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
<applet code = "mouse.class" width="400" height="200">
</applet>
*/

public class mouse extends Applet implements MouseMotionListener
{
	int x,y;
    	String s=" ";

    	public void init()
	{
		setSize(500,500);
		addMouseMotionListener(this);
	}

    	public void mouseDragged(MouseEvent e)
	{
    		x=e.getX();
    		y=e.getY();
    		s="X at=" +x +"y at=" +y;
    		repaint(); 
	}

	public void mouseMoved(MouseEvent e)
	{
  		x=e.getX();
    		y=e.getY();
    		s="X at=" +x +"y at=" +y;
    		repaint(); 
	}

   	public void paint(Graphics g)
    	{
       	 	g.fillRect(x,y,10,10);
        		g.drawString(s,10,15);       
    	}
}