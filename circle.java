import java.applet.*;
import java.awt.*;
import java.awt.Graphics;

/*
<applet code = "circle.class" width="400" height="200">
</applet>
*/

public class circle extends Applet 
{
	public void init()
	{
		//setsize(400,200);
		setBackground(Color.black);
	}
		
	public void paint(Graphics g)
	{
		
		for(int x=0 ; x<10; x++)
		{
			g.setColor(Color.green);
			g.fillOval(200,x*70,50,50);

		}
	}
}	
	
	