import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinosaurWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinosaurWorld extends Homesick
{

    /**
     * Constructor for objects of class DinosaurWorld.
     * 
     */
    private int scene = 0;
    private Asset portal = new Asset("portal.gif", true);
    
    public DinosaurWorld()
    {
       drawMaterials();
       drawButtons();
       drawActors();
       drawBackground();
    }
    
    public void act() {
        initialScene();
    }
    
    private void initialScene() {
        addObject(portal, 540, 100);
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("DinosaurBackground.png");
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        
    }
}
