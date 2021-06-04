import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World world;
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(World world, String image) 
    {
        this.world = world;
        setImage(image);
    }
    
    public void act() {
        onClick();
    }
    
    private void onClick() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(world);
        }
    }
}
