import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button for the help menu. Displays the help image.
 * 
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */
public class help  extends Actor
{
casino myCasino; 
int helpcount=1;

/**
     * Act() method displays the help panel
     * displays the help image
     * onClick inverts the help image (shown or hidden)
     */
  
    public void act() 
    {
        myCasino = (casino)getWorld();
       
        if((Greenfoot.mouseClicked(this))&& helpcount==1){
                myCasino.addObject(casino.helpImage,200,260);
                    helpcount=0;
    myCasino.removeObject(casino.spin);
      
    }
    else if ((Greenfoot.mouseClicked(this))&& helpcount==0){
        myCasino.removeObject(casino.helpImage);
       helpcount=1;
myCasino.addObject(casino.spin,317,450);
    }    

}
}

