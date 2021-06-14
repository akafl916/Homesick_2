import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Homesick
{
    private GifImage gifBackground = new GifImage("spaceBackground.gif");
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(String level)
    {
        Text text = new Text("YOU LOSE", 200, Color.WHITE);
        addObject(text, MIDDLE, MIDDLE);
        Text text1 = new Text("You died because " + level, 70, Color.WHITE);
        addObject(text1, MIDDLE, MIDDLE+200);
    }
    
    public void act() {
        drawBackground();
    }
    
    private void drawBackground() {
        GreenfootImage background = gifBackground.getCurrentImage();
        background.scale(1080, 1080);
        setBackground(background);
    }
}
