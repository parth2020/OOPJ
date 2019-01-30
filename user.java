import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="user.class" width=250 height=200>
</applet>
*/

public class user extends Applet implements ActionListener
{
	Label l1,l2,l3;
	
	TextField tf1,tf2;

	public  void init()
	{
		l1 = new Label("User Name: ");
		tf1 = new TextField(10);
		l2 = new Label("Password: ");
		tf2 = new TextField(10);
		l3 = new Label();
		Button b = new Button("Andar Java Mate Ahiya Dabavo");
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b);
		add(l3);

		b.addActionListener(this);
		tf2.setEchoChar('!');
	}		 	

	public void actionPerformed(ActionEvent ae)
	{
		l3.setText("Narak Ma Apanu Swagat Che "+tf1.getText());
	}
	
	/* public void paint(Graphics g)
	{
		g.drawString("Your Name Is: "+tf1.getText(),10,100);
		g.drawString("Your Surname Is: "+tf2.getText(),10,150);
	} */
}			