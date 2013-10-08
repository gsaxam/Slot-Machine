import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button that handles betAmount multiples
 * 
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */
public class x1  extends Actor
{
    /**
     * Act() method updates the betAmount by times and resets the display
     */
    public void act() 
    {
        
         if(Greenfoot.mouseClicked(this)){
     if(spinButton.count>=2){
             spinButton.betAmount=2;
      betLabel.betlabel="2 points";
    }
    }
    }    
}
