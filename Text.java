import greenfoot.*;

/**
 * Class that constructs an actor with parameters text, size, and color 
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Text extends EnhancedActor
{
    private GreenfootImage image;
    /**
     * Constructor for objects of class Text
     */
    public Text(String text, int size, Color color)
    {
        super("metalPlate.jpg");
        GreenfootImage gi = new GreenfootImage(text, size, color, null);
        setImage(gi);
    }
}
