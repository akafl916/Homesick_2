import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flyer extends EnhancedActor
{
    int rotation = 0;
    int speed = 1;
    
    public Flyer(int speed, int rotation, String image) {
        super(image);
        this.speed = speed;
        this.rotation = rotation;
    }
    
    /**
    * Float along the bloodstream, slowly rotating.
    */
    public void act() 
    {
        setLocation(getX()-speed, getY());
        turn(rotation);
        
        if (getX() > 1000) 
        {
            getWorld().removeObject(this);
        }
    }
}
