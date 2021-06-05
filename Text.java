import greenfoot.*;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Constructor for objects of class Text
     */
    public Text(String text, int size, Color color)
    {
        GreenfootImage gi = new GreenfootImage(text, size, color, null);
        setImage(gi);
    }
}
