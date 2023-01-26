import java.applet.*;
import java.awt.*;
/*
<applet code="line" width=200 height=200>
</applet>
*/
public class line extends Applet
{
	public void paint(Graphics g)
	{
		int a = 100;
		
		int b = 100;
		int c = 100;
		int d = 100;
		g.drawString("Dipak", 100, 100);
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{				
			}
		g.drawLine(a,b,c,d);
		c+=30;
		d-=30;
		}
	}
}