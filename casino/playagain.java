import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * provides a Button interface for the user to play again. 
 * Also stores the playagain image. 
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */
public class playagain  extends Actor
{
casino myCasino;    
/**
     * Act() method removes the gameover and playagain banners from the screen
     */
    public void act() 
    {
        myCasino = (casino)getWorld();
        if((Greenfoot.mouseClicked(this))){ // mouse interaction .. onClick event
                spinButton.count=20;
             // remove items from the screen
                myCasino.removeObject(casino.go); // gameover banner
                myCasino.removeObject(casino.pa); // playagain banner
                betLabel.betlabel="2 points"; // reset the scoreboard display
                spinButton.betAmount=2;// reset the bet Amount
                myCasino.addObject(casino.spin,317,450); // add new spin button

   
      
    }
    }    
}
