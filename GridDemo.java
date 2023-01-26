import java.awt.*;
import java.applet.*;
public class GridDemo extends Applet
{
CardLayout card;  
JButton b1,b2,b3;  
Container c;  
 public void init()
 {
   setLayout(new GridLayout(4,4));
   int n=0;
   for(int i=0;i<4;i++)
   {
     for(int j=0;j<4;j++)
	 {
	   add(new Button(" Dipak Balaji Panchal"));
	   n++;
	 }
    }
 }
}