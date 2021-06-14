import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertTemple extends Homesick
{
    // Worlds Available
    // Images and Colors
    private GreenfootImage background = new GreenfootImage("desertTempleBackground.png");
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    public DesertTemple()
    {
       drawActors();
       drawButtons();
       drawMaterials();
       drawBackground();
    }
    
    public void act() {
       
    }
    
    private void drawBackground() {
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        Asset coffin3 = new Asset("coffin.png", false);
        coffin3.scale(0.75);
        addObject(coffin3, MIDDLE - 140, MIDDLE+175);
        Asset coffin2 = new Asset("coffin.png", false);
        coffin2.scale(0.9);
        addObject(coffin2, MIDDLE - 220, MIDDLE+270);
        Asset coffin1 = new Asset("coffin.png", false);
        addObject(coffin1, MIDDLE - 330, MIDDLE+370);
        Asset coffin4 = new Asset("coffin.png", false);
        coffin4.scale(0.75);
        addObject(coffin4, MIDDLE + 160, MIDDLE+175);
        Asset coffin5 = new Asset("coffin.png", false);
        coffin5.scale(0.9);
        addObject(coffin5, MIDDLE + 240, MIDDLE+270);
        Asset coffin6 = new Asset("coffin.png", false);
        addObject(coffin6, MIDDLE + 350, MIDDLE+370);
    }
}
