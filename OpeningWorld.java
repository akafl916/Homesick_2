import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OpeningWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OpeningWorld extends DefaultWorld
{
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    public OpeningWorld()
    {    
        drawButtons();
        playMusic();
    }
    
    public void act() {
        this.introMusic.pause();
    }
    
    private void drawButtons() {
        RectYellowButton button1 = new RectYellowButton(this);
        addObject(button1, middle+150, middle+150);
    }
    
    private void playMusic() {
        
    }
}
