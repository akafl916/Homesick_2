import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Homesick subclass that creates the opening world, with the spaceship and portal. 
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class OpeningWorld extends Homesick
{
    private int scene = 1;
    private int imageCount = 0;
    private boolean isClicked = false;
    private Asset ship = new Asset("rocket.png", false);
    private Asset portal = new Asset("portal.gif", true);
    // Worlds Available
    Desert desert = new Desert();
    // Images and Colors
    GreenfootImage starsbackground = new GreenfootImage("starsbackground.png");
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    public OpeningWorld()
    {
       drawButtons();
       drawActors();
       drawMaterials();
    }
    
    public void act() {
       if (scene == 1) {
           playMusic();
           scene++;
       }
       stopPrevMusic();
       imageCount += 5; //(or any other value; small -> slow moving, big -> fast movement)
       drawBackground();
       if(Greenfoot.mouseClicked(ship)) {
           addObject(portal, MIDDLE, MIDDLE-400);
           isClicked = true;
       }
       if (isClicked) {
           ship.move(15);
           if(ship.getY() <= MIDDLE-400) {
               Greenfoot.setWorld(desert);
           }
       }
    }
     
    public void drawBackground() {
        if (imageCount > starsbackground.getHeight()) {
            imageCount -= starsbackground.getHeight();
        }
        int temp = imageCount;
        getBackground().drawImage(starsbackground, 0, temp);
        getBackground().drawImage(starsbackground, 0, temp - starsbackground.getHeight());
    }
    
    private void playMusic() {
        this.ambientSpace.setVolume(VOLUME*25);
        this.ambientSpace.playLoop();
    }
    
    private void stopPrevMusic() {
        this.introMusic.pause();
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        addObject(ship, MIDDLE, MIDDLE);
        ship.setRotation(-90);
    }
}
