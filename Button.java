import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int a;
    private int a2;
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(int a) 
    {
        this.a = a;
        this.a2 = -1;
    }
    public int getA() {
        return a2;
    }
    public void act() {
        if (isPressed()) {
            a2 = a;
        }
    }
    public boolean isPressed() {
        if (Greenfoot.mousePressed(this)) {
            return true;
        }
        else {
            return false;
        }
    }
}

