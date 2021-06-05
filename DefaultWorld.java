import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DefaultWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultWorld extends World
{
    public static int middle = 540;
    public static int musicVolume = 0;
    public static int sfxVolume = 0;
    
    //Sounds and Music
    public static GreenfootSound introMusic = new GreenfootSound("homesick.mp3");
    
    
    /**
     * Constructor for objects of class DefaultWorld.
     * 
     */
    public DefaultWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 1080, 1);
    }
}
