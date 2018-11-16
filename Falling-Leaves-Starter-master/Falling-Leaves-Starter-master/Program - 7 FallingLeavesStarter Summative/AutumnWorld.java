 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Keeps track of the startup placement and helps a lot with the scoreboard
 * (and adds the background)
 * 
 * @author (Des) 
 * @version (This is the first version: 10/30/2018)
 */
public class AutumnWorld  extends World
{
    //sets a score
    private Scoreboard score;
    
    //when activated this variable will decide which way the leaf falls
    public boolean leftFall = false;
    
    /**
     * Constructor for objects of class FallWorld.
     * 
     * There are no parameters and there isnt a return type
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        
        addObject( new Catcher(), getWidth()/2, getHeight()-80 ) ;
        
        score = new Scoreboard();
        addObject( score, 75, 25);
    }
    
    /**
    *act - things you want to do each time around go in here
    * 
    */
    public void act()
    {
        randomLeaf();
    }
    
    /**
     * Puts the leaf in a random position on the screen
     * 
     * there are no parameters and there isn't a return type
     */
    public void randomLeaf()
    {
        if (Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new Leaf(), Greenfoot.getRandomNumber (500) , 0 );
            addObject(new LeafGoingLeft(), Greenfoot.getRandomNumber (500), 0 );
            addObject(new LeafGoingRight(), Greenfoot.getRandomNumber (500), 0 );
        }
    }
    public void update()
    {
        score.addToScore();
    }
}
