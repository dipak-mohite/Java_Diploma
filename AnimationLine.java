import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.*;
public class AnimationLine extends JApplet
{ 
 public void init() 
 {
 getContentPane().add(new AnimationLinePanel()); 
 setSize(800,500);
 }
 public class AnimationLinePanel extends JPanel
 {
 int linex,linem = 1; 
 public AnimationLinePanel()
 {
 setBackground(Color.black); 
 }
 public void paintComponent(Graphics page)
 {
 super.paintComponent(page);
 page.setColor(Color.red); 
 page.drawLine(linem,200,310,400); 
 if(linex > 500)
 {
 linem = -500;
 page.setColor(Color.green); 
 page.drawLine(linem,200,310,400); 
 }
 if(linex < 0)
 {
 linem = 600;
 page.setColor(Color.yellow); 
 page.drawLine(linem,200,310,400); 
 }
 linex += linem; 
 repaint(); 
 }
 }
} 