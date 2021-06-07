import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that constructs a basic screen and holds universal variables for its subclasses
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Homesick extends World
{
    public static int MIDDLE = 540;
    public static int VOLUME = 0;
    
    //Sounds and Music
    public static GreenfootSound introMusic = new GreenfootSound("homesick.mp3");
    
    //Colors
    public static Color BARK_RED = new Color(89, 0, 12);
    
    /**
     * Constructor for objects of class DefaultWorld.
     * 
     */
    public Homesick()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 1080, 1);
    }
}
