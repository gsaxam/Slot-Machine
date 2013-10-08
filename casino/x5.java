import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button for handling betAmount multiples
 * 
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */
public class x5  extends Actor
{
    /**
     * Act() method updates the betAmount by times and resets the display
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
       if(spinButton.count>=10){
            spinButton.betAmount=10;
      betLabel.betlabel="10 points";
    }
    }
    }    

}
