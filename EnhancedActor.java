import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnhancedActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnhancedActor extends Actor
{
    private String image;

    /**
     * Constructor for objects of class EnhancedActor
     */
    public EnhancedActor(String image)
    {
        this.image = image;
        setImage(image);
    }

    public int getWidth() {
        return this.getImage().getWidth();
    }
    
    public int getHeight(){
        return this.getImage().getHeight();
    }
    
    public void scale(int x, int y) {
        getImage().scale(x, y);
    }
    
    public void scale(double p) {
        getImage().scale((int)(getWidth()*p), (int)(getHeight()*p));
    }
    
    public void flip() {
        getImage().mirrorHorizontally();
    }
}
