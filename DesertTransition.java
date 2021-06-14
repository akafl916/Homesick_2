import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesertTransition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertTransition extends Homesick
{
    private int rotation = 0;
    private int todX = 200;
    private int robX = -300;
    private int todY = 100;
    private int robY = -100;
    private int s = 500;
    private GifImage gifBackground = new GifImage("vortex.gif");
    private NPC Tod = new NPC("tod.png", 1, false);
    private NPC Rob = new NPC("rob.png", 0, false);
    /**
     * Constructor for objects of class DesertTransition.
     * 
     */
    public DesertTransition()
    {  
       playMusic();
       drawButtons();
       drawActors();
       drawMaterials();
    }
    
    public void act() {
        drawBackground();
        addObject(Tod, MIDDLE+todX, MIDDLE+todY);
        Tod.setRotation(147 + rotation);
        addObject(Rob, MIDDLE+robX, MIDDLE+robY);
        Rob.setRotation(54 + rotation);
        rotation+=5;
        todX-=3;
        robX+=3;
        todY-=3;
        robY+=3;
        Tod.setLocation(MIDDLE+todX, MIDDLE+todY);
        Rob.setLocation(MIDDLE+robX, MIDDLE+robY);
        
        if(s > 100) {
            Rob.scale(s, s);
            Tod.scale(s, s);
            s-=3;
        } else {
            Greenfoot.setWorld(new CyberpunkCity());
        }
    }
    
    private void drawBackground() {
        GreenfootImage background = gifBackground.getCurrentImage();
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void playMusic() {
        
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        
    }
}
