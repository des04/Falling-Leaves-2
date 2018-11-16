import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The scoreboard adds a score at the top left side of the screen, allowing
 * you to win the game
 * 
 * @author (Des) 
 * @version (1)
 */
public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    /**
     * Sets the visible part of the scoreboard that you actually can see,
     * allowing you to know how many leaves you've caught and when you've
     * won.
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.setColor(new Color(225,225,255));
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * Code that adds points to the visible score whenever a leaf is caught
     * and stops the code when the player wins
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 10) {
           img.drawString("Score: " + points, 5,25); 
            
        } else {
            
           img.drawString("You win!!!", 5,25);
           Greenfoot.playSound("win.wav");
           Greenfoot.stop();
        }        
    }    
}
