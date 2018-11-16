import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LeafGoingRight  extends Actor
{
        //variables to represent the leaf images
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");

        
        
    /**
     * Sets four possible images to represent a leaf whenever it spawns in.
     * 
     * @param There are none
     * @return There isnt one
     */
    public LeafGoingRight()
    {
        //Get a random number that will correspond to the image that is shown for OfLeafGoingRight
        int randomImage = Greenfoot.getRandomNumber(4);
        
        //If the random number is 0...
        if ( randomImage == 0 )
        {
            //Set the image to the first option (leafcutout0)
            setImage( "cutoutleaf0.png" );
        }
        else if ( randomImage == 1 )//Otherwise, if the random number is 1...
        {
            //Set the image to the second option (leafcutout1)
            setImage( "cutoutleaf1.png" );
        }
        else if ( randomImage == 2 ) //Otherwise, if the number is 2...
        {
            //Set the image to the last option (leafcutout2)
            setImage( "cutoutleaf2.png" );
        }
        else
        {
            //Set the image to the last option (leafcutout3
            setImage( "cutoutleaf3.png" );
        }
 
     }

    
    public void act() 
    {
        int speed = 2;
        
        int rotation = getRotation();
        
        setRotation(rotation+5);
        
        move(speed);
        
        moveDown();
        
    }
    
    /**
     * Makes the leaves move diagonally across the screen and removes them
     * from the world if they touch the edge.
     * 
     * @param There are none
     * @return There isn't one
     */
    
    public void moveDown()
    {
        
        
        setLocation(getX()+2,getY()+3); 
        
        
        if ( isAtEdge() == true ) 
        {
            getWorld().removeObject(this);
        }
        
    }
       
}
