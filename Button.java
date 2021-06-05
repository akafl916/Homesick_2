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
    private String unpressed;
    private String hovered;
    private String pressed;
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(World world,
    String unpressed,
    String hovered,
    String pressed) 
    {
        this.world = world;
        this.unpressed = unpressed;
        this.hovered = hovered;
        this.pressed = pressed;
    }
    
    public void act() {
        onClick();
        onHover();
    }
    
    private void onClick() {
        if (Greenfoot.mouseClicked(this)) {
            setImage(pressed);
            Greenfoot.delay(2);
            Greenfoot.setWorld(world);
        }
    }
    
    private void onHover() {
        if (Greenfoot.mouseMoved(this)) {
            setImage(hovered);
        } else if (Greenfoot.mouseMoved(getWorld())) {
            setImage(unpressed);
        }
    }
    
    public int getWidth() {
        return this.getImage().getWidth();
    }
    
    public int getHeight(){
        return this.getImage().getHeight();
    }
}
