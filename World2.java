import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends Homesick
{
    // Worlds Available
    // Images and Colors
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    public World2()
    {
       drawButtons();
       drawActors();
       drawMaterials();
       playMusic();
    }
    
    public void act() {
       drawBackground();
    }
    
    private void drawBackground() {
        
    }
    
    private void playMusic() {
        
    }
    
    private void drawButtons() {
        RectYellowWorldButton nextWorld = new RectYellowWorldButton(new World3());
        addObject(nextWorld, 200, 300);
    }
    
    private void drawMaterials() {
    
    }
    
    private void drawActors() {
        
    }
}
