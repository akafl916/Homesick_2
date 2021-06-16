import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesertFinalTransition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalTransition extends Homesick
{
    private int rotation = 0;
    private int shipX = -300;
    private int shipY = -100;
    private int s = 500;

    private GifImage gifBackground = new GifImage("vortex.gif");

    private Asset ship = new Asset("rocket.png", true);
    
    public FinalTransition()
    {  
       playMusic();
       drawButtons();
       drawActors();
       drawMaterials();
    }
    
    public void act() {
        stopPreviousMusic();
        drawBackground();
        initialAnimation();
    }

    private void initialAnimation() {
        addObject(ship, MIDDLE+shipX, MIDDLE+shipY);
        ship.setRotation(54 + rotation);
        rotation+=5;
        shipX+=3*0.1;
        shipY+=3*0.1;
        ship.setLocation(MIDDLE+shipX, MIDDLE+shipY);
        
        if(s > 100) {
            ship.scale(s, s);
            s-=3*0.1;
        } else {
            Greenfoot.setWorld(new FinalWorld());
        }
    }
    
    private void stopPreviousMusic() {
        desertMusic.pause();
    }
    
    private void drawBackground() {
        GreenfootImage background = gifBackground.getCurrentImage();
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void playMusic() {
        transitionSpook.setVolume(20*VOLUME);
        transitionSpook.play();
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        
    }
}
