import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BatCave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatCave extends Homesick
{

    /**
     * Constructor for objects of class BatCave.
     * 
     */
    
    private NPC Tod = new NPC("tod.png", 1, 0);
    private NPC Rob = new NPC("rob.png", 0, 0);
    private Asset bat = new Asset("bat.png", false);
    
    public BatCave()
    {
       drawMaterials();
       drawButtons();
       drawActors();
       drawBackground();
    }
    
    private void initialScene() {
        Greenfoot.delay(70);
        Rob.say("Oh hey, I think\nyou got it\nthis time!", false, 1);
        Greenfoot.delay(100);
        Rob.stopSaying();
        Greenfoot.delay(50);
        Tod.say("...", false, 0);
        Greenfoot.delay(70);
        Tod.stopSaying();
        Greenfoot.delay(70);
        Rob.say("You know\n what Tod, I think \nthat once I take a\n very very\n long shower,", false, 1);
        Greenfoot.delay(150);
        Rob.stopSaying();
        Greenfoot.delay(50);
        Rob.say("I can find\nit in my heart to\nforgive you", false, 1);
        Greenfoot.delay(100);
        Rob.stopSaying();
        Greenfoot.delay(100);
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("cave.jpeg");
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        addObject(Tod, 540, 100);
        addObject(Rob, 540, 100);
        Tod.scale(0.7);
        Rob.scale(0.8);
    }
}
