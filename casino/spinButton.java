import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the animation, picks up random numbers and displays them on screen
 * Sends the score to the scoring system
 * checkWinner() method to determine the winning condition
 * sounds and graphic medias to display several situations
 * @author Saksham Ghimire and Densai Moua 
 * @version 12/15/2010
 */
public class spinButton  extends Actor
{
private ScoreBoard myScoreBoard; // new scoreboard

private int cardIndex=0; // stors the card index 
public static int count=20; // initial value of total credits
public static int betAmount=2; // initial bet amount

int card1;// stores the random number for the first symbol
int card2;// stores the random number for the second symbol
int card3;// stores the random number for the third symbol
casino myCasino; // get the instance of the world
GreenfootSound sound=new GreenfootSound("spinsound.wav"); // sound for spinning the symbols
GreenfootSound sound1=new GreenfootSound("spinstop.wav");   // stop sound
GreenfootSound sound2=new GreenfootSound("win1.wav"); // for pair wins
GreenfootSound win2=new GreenfootSound("win2.wav");// for triplet wins
GreenfootSound jackpot=new GreenfootSound("jackpot.wav");// for jackpot wins
GreenfootSound gameover=new GreenfootSound("gameover.wav");// gameover sound
/**
     * Constructor for objects of class spinButton
     * Takes in the object of ScoreBoard as parameter
     */
public spinButton(ScoreBoard scoreBoard){

myScoreBoard=scoreBoard;
}
/**
     * Act() method invokes the hasEnough(), spin(), checkWinner() methods
     * Uses mouse interactions
     */
    public void act() 
    {
        myCasino = (casino)getWorld(); // get the current world
        // detect mouse click
         if((Greenfoot.mouseClicked(this))||(Greenfoot.isKeyDown("space"))){
       hasEnough();
             myCasino.removeObject(casino.spin);
       
             spin();
        checkWinner();
       hasEnough();
    }
    } 
    /**
     * Spin() method animates the symbols and picks up three random numbers card1, card2 and card3
     * 
     */
    public  void spin(){
   count-=betAmount; // takes off the bet amount
   myScoreBoard.setText("Credits: "+count); // send credits to the scoreboard
      stopAllSounds(); // stop all playing sounds
        sound.play(); // play sound
         card1 = Greenfoot.getRandomNumber(4); // random number1
         card2 = Greenfoot.getRandomNumber(4); // random number2
         card3 = Greenfoot.getRandomNumber(4); // random number3
         int fluke=Greenfoot.getRandomNumber(4);// 4th random number to avoid repeatation
         if(fluke<=1){
         int temp=card1;
         card1=card2;
         card2=temp;
        }
        else{
            int temp=card3;
            card3=card2;
            card2=temp;
        }
   // positions for the first symbol         
   int x=118;
   int y=248;
   // position for the second symbol
   int a=201;
   int b=250;
   // position for the third symbol
   int c=284;
   int d=249;
   // delay amount
   int delay=5;
   // creates an animation using the instances of symbols and delays.
        for(int i=1;i<=5;i++){
           
             myCasino.addObject(casino.diamondIcon,x,y);
              myCasino.addObject(casino.spadeIcon,a,b);
               myCasino.addObject(casino.heartIcon,c,d);
                           Greenfoot.delay(delay);
            myCasino.removeObject(casino.diamondIcon);
            myCasino.removeObject(casino.spadeIcon);
            myCasino.removeObject(casino.heartIcon);
            
            myCasino.addObject(casino.heartIcon,x,y); 
              myCasino.addObject(casino.diamondIcon,a,b);
               myCasino.addObject(casino.clubIcon,c,d);
             
               Greenfoot.delay(delay);
            myCasino.removeObject(casino.heartIcon);
            myCasino.removeObject(casino.diamondIcon);
            myCasino.removeObject(casino.clubIcon);
             myCasino.addObject(casino.clubIcon,x,y);
              myCasino.addObject(casino.heartIcon,a,b);
               myCasino.addObject(casino.spadeIcon,c,d);
              Greenfoot.delay(delay);
            myCasino.removeObject(casino.clubIcon);
            myCasino.removeObject(casino.heartIcon);
            myCasino.removeObject(casino.spadeIcon);
             myCasino.addObject(casino.spadeIcon,x,y);
              myCasino.addObject(casino.clubIcon,a,b);
               myCasino.addObject(casino.diamondIcon,c,d);
              Greenfoot.delay(delay);
               myCasino.removeObject(casino.spadeIcon);
               myCasino.removeObject(casino.clubIcon);
               myCasino.removeObject(casino.diamondIcon);
            }
            clearScreen(); // clear all sybols from the screen 
           // check the random number and position appropriate symbol on the screen
                 switch (card1){
                     case 0: myCasino.addObject(casino.diamondIcon,x,y);
                     break;
                     case 1: myCasino.addObject(casino.heartIcon,x,y);
                     break;
                     case 2: myCasino.addObject(casino.clubIcon,x,y);
                     break;
                     case 3: myCasino.addObject(casino.spadeIcon,x,y);
                     break;
                    }
                 switch (card2){
                     case 0: myCasino.addObject(casino.diamondIcon1,a,b);
                     break;
                     case 1: myCasino.addObject(casino.heartIcon1,a,b);
                     break;
                     case 2: myCasino.addObject(casino.clubIcon1,a,b);
                     break;
                     case 3: myCasino.addObject(casino.spadeIcon1,a,b);
                     break;
                    }
                 switch (card3){
                     case 0: myCasino.addObject(casino.diamondIcon2,c,d);
                     break;
                     case 1: myCasino.addObject(casino.heartIcon2,c,d);
                     break;
                     case 2: myCasino.addObject(casino.clubIcon2,c,d);
                     break;
                     case 3: myCasino.addObject(casino.spadeIcon2,c,d);
                     break;
                    }
                    sound.stop();
                    sound1.play();
}
/**
     * checkWinner() method implements all kinds of winning conditions
     * checks the position of the symbols and determines the winning amount based on betAmount
     */
public void checkWinner(){
cardIndex=0;
// check triplets except for SPADES
if(((card1==card2)&&(card1==card3)&&(card2==card3))&&(card1!=3)){
count+=(betAmount*20);
sound1.stop();
win2.play(); // plays the winning sound for pairs
myScoreBoard.setText("Credits: "+count); // update the scoreboard
cardIndex=1;
myCasino.addObject(casino.winx3Image,200,152);
for(int i=0;i<10;i++){
 casino.winx3Image.setImage("4.gif");
        Greenfoot.delay(3);
        casino.winx3Image.setImage("5.gif");
       Greenfoot.delay(3);
       casino.winx3Image.setImage("6.gif");
        Greenfoot.delay(3);
    }

myCasino.removeObject(casino.winx3Image);
}
//check JACKPOT.. Triplets of SPADES
if(((card1==card2)&&(card1==card3)&&(card2==card3))&&(card1==3)){
count+=(betAmount*500);
sound1.stop();
jackpot.play();
myScoreBoard.setText("Credits: "+count);
cardIndex=1;
myCasino.addObject(casino.winJPImage,200,152);
for(int i=0;i<15;i++){
 casino.winJPImage.setImage("jp1.gif");
        Greenfoot.delay(3);
        casino.winJPImage.setImage("jp2.gif");
       Greenfoot.delay(3);
       casino.winJPImage.setImage("jp3.gif");
        Greenfoot.delay(3);
    }

myCasino.removeObject(casino.winJPImage);
}
// check the pair winning condition i.e. any two repeated symbols
if(((card1==card2)||(card1==card3)||(card2==card3))&& cardIndex==0){
count+=(betAmount*2); // Winning amount is twice the betAmount 

sound1.stop();
sound2.play();
myScoreBoard.setText("Credits: "+count); // update the score
myCasino.addObject(casino.winx2Image,200,152);
for(int i=0;i<7;i++){
 casino.winx2Image.setImage("1.gif");
        Greenfoot.delay(3);
        casino.winx2Image.setImage("2.gif");
       Greenfoot.delay(3);
       casino.winx2Image.setImage("3.gif");
        Greenfoot.delay(3);
    }

myCasino.removeObject(casino.winx2Image);
}
myCasino.addObject(casino.spin,317,450);
}
/**
     * Checks if the user has enough credits to bet more. If not ends the game
     * Also updates the betAmount displays
     */
public void hasEnough(){
if(count<=1){
gameover.play();
myCasino.addObject(casino.go,200,152);
myCasino.addObject(casino.pa,200,445);
myScoreBoard.setText("Credits: "+20);
myCasino.removeObject(casino.spin);
}
else if((count<10 && count>=4)&& betAmount==10){
betAmount=4;
betLabel.betlabel="4 points";
}
else if((count<4 && count>=2)&& betAmount==4){
betAmount=2;
 betLabel.betlabel="2 points";
}
else if ((count==2 && betAmount==2)){
betAmount=2;
}
}
/**
     * Removes all icons and symbols from the screen
     */ 
public void clearScreen(){
               myCasino.removeObject(casino.spadeIcon);
               myCasino.removeObject(casino.diamondIcon);
               myCasino.removeObject(casino.clubIcon);
               myCasino.removeObject(casino.heartIcon);
               myCasino.removeObject(casino.spadeIcon1);
               myCasino.removeObject(casino.diamondIcon1);
               myCasino.removeObject(casino.clubIcon1);
               myCasino.removeObject(casino.heartIcon1);
               myCasino.removeObject(casino.spadeIcon2);
               myCasino.removeObject(casino.diamondIcon2);
               myCasino.removeObject(casino.clubIcon2);
               myCasino.removeObject(casino.heartIcon2);
}
/**
     * Stops all currently playing sounds
     */
public void stopAllSounds(){
sound.stop();
sound1.stop();
sound2.stop();
win2.stop();
jackpot.stop();
}
}

