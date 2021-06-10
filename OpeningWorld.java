import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World subclass
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class OpeningWorld extends Homesick
{
    // Worlds Available
    // Images and Colors
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    public OpeningWorld()
    {
       drawBackground();
       drawButtons();
       drawActors();
       drawMaterials();
       playMusic();
    }
    
    public void act() {
       stopPrevMusic();
    }
    
    private void drawBackground() {
        setBackground("metalPlate.jpg");
    }
    
    private void playMusic() {
        
    }
    
    private void stopPrevMusic() {
        this.introMusic.pause();
    }
    
    private void drawButtons() {
        RectYellowWorldButton nextWorld = new RectYellowWorldButton(new Desert());
        addObject(nextWorld, 100, 100);
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        
    }
}
