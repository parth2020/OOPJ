import java.applet.*;
import java.awt.*;
import java.awt.Graphics;

/*
<applet code = "battery.class" width="400" height="200">
</applet>
*/

public class battery extends Applet 
{
	public void init()
	{
		//setsize(400,200);
		setBackground(Color.black);
	}
		
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.drawRect(200,100,100,50);	
			
		for(int x=0 ; x<=100; x=x+1)
		{
			try
			{
				Thread.sleep(100);
				g.fillRect(200,100,x,50);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}
	}
	public void xyz()
	{ 
		repaint();
	}	
}	
	
	