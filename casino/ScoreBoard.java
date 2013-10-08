import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Displays the score in the main scenario (Casino).
 * writes string to an image using greenfoot functions
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */
public class ScoreBoard  extends Actor
{
/**
     * Constructor for the ScoreBoard Class
     * takes in string text as the parameter 
     * updates the scoreboard with the current credits
     */  
 public ScoreBoard(String text){
       GreenfootImage img=new GreenfootImage(text.length()*20,30);
        img.setColor(Color.BLACK);
img.setFont( new Font("Trebuchet MS", Font.PLAIN, 18)); 
       img.drawString(text,2,20);
       setImage(img);
    }
    /**
     * method setText writes the string to an image
     */
    public void setText(String text){
        GreenfootImage img=getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.drawString(text,2,20);
    }
}
