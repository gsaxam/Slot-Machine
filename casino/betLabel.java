import greenfoot.*;
import java.awt.Color;
import java.awt.Font;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Image label for the betAmount display
 * Writes a string to an image using Greenfott functions
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */
public class betLabel  extends Actor
{
    public static String betlabel;
    /**
     * Act() method updates and resets the display for betAmount volume
     */
    public void act() 
    {
       
       GreenfootImage lbl=new GreenfootImage(betlabel.length()*20,30);
        lbl.setColor(Color.BLACK);
lbl.setFont( new Font("Myriad Pro", Font.PLAIN, 18)); 
     lbl.drawString(betlabel,2,20);
       setImage(lbl);
      
    
   
    }    
}
