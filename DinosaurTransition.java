import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinosaurTransition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinosaurTransition extends Homesick
{

    /**
     * Constructor for objects of class DinosaurTransition.
     * 
     */
    
    public DinosaurTransition()
    {
       drawBackground();
       Text text = new Text("A few minutes later...", 100, Color.WHITE);
       addObject(text, 550, 700);
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("black.png");
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    public void act() {
        Greenfoot.delay(200);
        Greenfoot.setWorld(new BatCave());
    }
}
