import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalWorld extends Homesick
{
    private NPC Tod = new NPC("tod.png", 1, 0);
    private NPC Rob = new NPC("rob.png", 0, 0);
    private int scene = 0;
    
    public FinalWorld()
    {
       drawBackground();
       drawButtons();
       drawActors();
       drawMaterials();
       playMusic();
    }
    
    public void act() {
       if(scene == 0) {
           Greenfoot.delay(50);
           Rob.say("Finally!", false, 0);
           Greenfoot.delay(150);
           Rob.stopSaying();
           Rob.say("We can go home!", false, 0);
           Greenfoot.delay(200);
           Rob.stopSaying();
           Tod.say("...", false, 0);
           Greenfoot.delay(200);
           Tod.stopSaying();
           Tod.say("Hey rob...", false, 2);
           Greenfoot.delay(150);
           Tod.stopSaying();
           Rob.say("Yeah?", false, 1);
           Greenfoot.delay(100);
           Rob.stopSaying();
           Tod.say("You got the keys,\nright?", false, 2);
           Greenfoot.delay(150);
           Tod.stopSaying();
           Rob.say("No I thought you\nhad them?", false, 0);
           Greenfoot.delay(150);
           Rob.stopSaying();
           Tod.say("Rob...", false, 2);
           Greenfoot.delay(100);
           Tod.stopSaying();
           Tod.say("...", false, 2);
           Greenfoot.delay(100);
           Tod.stopSaying();
           Rob.say("...", false, 2);
           Greenfoot.delay(200);
           Rob.flip();
           Greenfoot.delay(100);
           Rob.stopSaying();
           Greenfoot.delay(100);
           Rob.say("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", false, 3);
           Greenfoot.delay(100);
           Greenfoot.setWorld(new EndCredits());
        }
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("finalBackground.jpg");
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
        Tod.scale(0.87);
        Rob.scale(0.8);
        addObject(Tod, MIDDLE-70, MIDDLE+200);
        addObject(Rob, MIDDLE+70, MIDDLE+190);
    }
}
