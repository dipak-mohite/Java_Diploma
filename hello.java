import java.awt.applet.*;
import java.awt.*;

public class hello extends applet
{
	public void init()
	{
		setBackground(Color.black);
		setBackground(Color.yello);
		
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet", 100, 100); 
	}
}