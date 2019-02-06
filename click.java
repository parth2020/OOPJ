import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
<applet code = "click.class" width="400" height="200">
</applet>
*/

public class click extends Applet implements MouseListener
{
    	String m=" ";
   
    	public void init()
    	{
        		addMouseListener(this);
       
   	}

   	public void paint(Graphics g)
   	{
     		g.drawString(m,50,50);
    
   	}

	public void mousePressed(MouseEvent e) 
	{
    		m="Mouse Pressed";
    		repaint();
    	}

  	public void mouseReleased(MouseEvent e)
	{
    		m="Mouse Released ";
    		repaint();
    	}

    	public void mouseClicked(MouseEvent e) 
	{
        		throw new UnsupportedOperationException("Not supported yet."); 
   	}

    	public void mouseEntered(MouseEvent e) 
	{
        		throw new UnsupportedOperationException("Not supported yet."); 
    	}

    	public void mouseExited(MouseEvent e) 
	{
        		throw new UnsupportedOperationException("Not supported yet.");
   	}
}