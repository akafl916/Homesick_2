import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desert extends Homesick
{
    // Worlds Available
    // Images and Colors
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    
    public Desert()
    {
       drawMaterials();
       drawButtons();
       drawActors();
       playMusic();
    }
    
    public void act() {
       drawBackground();
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("desertBackground.jpg");
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void playMusic() {
        
    }
    
    private void drawButtons() {
        WorldButton desertDoor = new WorldButton(new World3(),"pyramidDoor.png",
        "pyramidDoor.png",
        "pyramidDoor.png");
        addObject(desertDoor, MIDDLE-100, MIDDLE+150);
    }
    
    private void drawMaterials() {
        Asset desertPyramid = new Asset("desertPyramid.png");
        desertPyramid.scale(1000, 1000);
        addObject(desertPyramid, MIDDLE, MIDDLE);
    }
    
    private void drawActors() {
        
    }
}
