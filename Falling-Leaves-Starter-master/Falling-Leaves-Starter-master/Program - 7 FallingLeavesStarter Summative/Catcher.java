 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    public void act() 
    {
        CatcherMove();
    } 
    
    /**
     * Gives the player the ability to move left and right using the arrow
     * keys. Also senses if the Catcher is touching a leaf and removes it
     * while making sure to update the score.
     * 
     * @param There are none
     * @return There isn't one
     */
    
    private void CatcherMove()
    {
        if ( Greenfoot.isKeyDown ("right") ) 
        {
            setLocation( getX()+6, getY() );
        }
        if ( Greenfoot.isKeyDown ("left") )
        {
            setLocation( getX()-6, getY() );
        }
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            //call the method update from the KittyWorld class
            ( (AutumnWorld)getWorld() ).update();
        }
        if(isTouching(LeafGoingLeft.class))
        {
            removeTouching(LeafGoingLeft.class);
            //call the method update from the KittyWorld class
            ( (AutumnWorld)getWorld() ).update();
        }
        if(isTouching(LeafGoingRight.class))
        {
            removeTouching(LeafGoingRight.class);
            //call the method update from the KittyWorld class
            ( (AutumnWorld)getWorld() ).update();
        }
    }
    
     
    
}
