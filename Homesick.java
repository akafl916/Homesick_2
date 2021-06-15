import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that constructs a basic screen and holds universal variables for its subclasses
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Homesick extends World
{
    public static boolean isClickThrough = false;
    public static int MIDDLE = 540;
    public static int VOLUME = 1;
    
    //Sounds and Music
    public static GreenfootSound introMusic = new GreenfootSound("homesick.mp3");
    public static GreenfootSound ambientSpace = new GreenfootSound("ambientspacything.mp3");
    public static GreenfootSound desertMusic = new GreenfootSound("desertMusic.mp3");
    public static GreenfootSound cityMusic = new GreenfootSound("city.mp3");
    
    public static GreenfootSound normal1Low = new GreenfootSound("normal1Low.mp3");
    public static GreenfootSound normal2Low = new GreenfootSound("normal1Low.mp3");
    public static GreenfootSound sadLow = new GreenfootSound("sadLow.mp3");
    public static GreenfootSound happyLow = new GreenfootSound("happyLow.mp3");
    public static GreenfootSound normal1Mid = new GreenfootSound("normal1Mid.mp3");
    public static GreenfootSound normal2Mid = new GreenfootSound("normal1Mid.mp3");
    public static GreenfootSound sadMid = new GreenfootSound("sadMid.mp3");
    public static GreenfootSound happyMid = new GreenfootSound("happyMid.mp3");
    public static GreenfootSound normal1High = new GreenfootSound("normal1High.mp3");
    public static GreenfootSound normal2High = new GreenfootSound("normal1High.mp3");
    public static GreenfootSound sadHigh = new GreenfootSound("sadHigh.mp3");
    public static GreenfootSound happyHigh = new GreenfootSound("happyHigh.mp3");
    public static GreenfootSound angry = new GreenfootSound("angry.mp3");
    
    public static GreenfootSound portalPew = new GreenfootSound("portalPew.mp3");
    public static GreenfootSound groundPow = new GreenfootSound("groundPow.mp3");
    public static GreenfootSound clink = new GreenfootSound("winclink.mp3");
    public static GreenfootSound transitionSpook = new GreenfootSound("transitionSpook.mp3");
    public static GreenfootSound nopeWrong = new GreenfootSound("nopewrong.mp3");
    public static GreenfootSound bum = new GreenfootSound("pow.mp3");
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
