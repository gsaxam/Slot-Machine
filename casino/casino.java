import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Casino style Slot Machine Game.
 * Casino : This is the main class. It works as the main scenario for all Actors
 * All the processes in the game are visible here.
 * @author Saksham Ghimire and Densai Moua
 * @version 12/15/2010
 */

// Class Casino
public class casino  extends World
{

public static Actor helpicon; // for help menu
public static Actor diamondIcon; // diamond symbol
public static Actor heartIcon; // heart symbol
public static Actor clubIcon; // club symbol
public static Actor spadeIcon; // spade symbol
// symbol names followed by 1 and 2 are copies of the instances for animation purposes.
public static Actor diamondIcon1;
public static Actor heartIcon1;
public static Actor clubIcon1;
public static Actor spadeIcon1;
public static Actor diamondIcon2;
public static Actor heartIcon2;
public static Actor clubIcon2;
public static Actor spadeIcon2;
public static Actor spin; // spin button
public static Actor spinout; // inactive spin button
public static Actor x1button; // increase bet Amount by x1
public static Actor x2button; // increase bet Amount by x2
public static Actor x5button; // increase bet Amount by x5
public static Actor betlabelimg; // label for bet label
public static Actor helpImage; // image for help menu
public static Actor winx2Image; // displays pair win information
public static Actor winx3Image; // displays triplet win information
public static Actor winJPImage; // displays jackpot win information
public static Actor go; // instance of gameover()
public static Actor pa; // instance of playagain()







    /**
     * Constructor for objects of class casino.
     * Creates and Add new Objects for Spin Button, ScoreBoard, Card Game Symbols and other buttons in the main window.
     */
    public casino()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(401, 495, 1);
        // set up gameover, playagain, score and toasts for information purposes
        go=new gameover();
        pa=new playagain();
        winx2Image=new winx2();
        winx3Image=new winx3();
        winJPImage=new winJP();
        helpImage=new helpImage();
         helpicon=new help();
        addObject(helpicon,203,11);
        betLabel.betlabel="2 points";
        betlabelimg=new betLabel();
        addObject(betlabelimg,301,367);
       //create buttons x1, x2 and x3
       x1button=new x1();
       addObject(x1button,172,411);
       x2button=new x2();
       addObject(x2button,197,411);
       x5button=new x5();
       addObject(x5button,222,411);
       spinout=new spinLabel();
       addObject(spinout,317,450);

       // create a new scoreboard
    ScoreBoard scoreBoard=new ScoreBoard("Credits: 20");
    addObject(scoreBoard,211,450);
     spin=new spinButton(scoreBoard); // new spin button
       addObject(spin, 317,450);
       // create instances of card game symbols
       diamondIcon=new diamond();
       clubIcon=new club();
       heartIcon=new heart();
       spadeIcon=new spade();
       diamondIcon1=new diamond();
       clubIcon1=new club();
       heartIcon1=new heart();
       spadeIcon1=new spade();
       diamondIcon2=new diamond();
       clubIcon2=new club();
       heartIcon2=new heart();
       spadeIcon2=new spade();
      // add all to the main scenario
       addObject(diamondIcon, 118,248);
       addObject(heartIcon, 201,250);
       addObject(clubIcon, 284,249);
       
        
       
    }
 
       // end cinstructor
}
   
// end class
    

        
    