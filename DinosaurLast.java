import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DinosaurLast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinosaurLast extends Homesick
{
    private NPC Tod = new NPC("tod.png", 1, 10);
    private NPC Rob = new NPC("rob.png", 0, 0);
    private Asset ship = new Asset("rocket.png", false);
    private Asset portal = new Asset ("portal2.gif", true);
    private int scene = 0;
    
    public DinosaurLast()
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
           Rob.say("Our ship! ...How?", false, 1);
           Greenfoot.delay(150);
           Rob.stopSaying();
           Tod.say("Who cares! Lets\nGO", false, 1);
           Greenfoot.delay(150);
           Tod.stopSaying();
           scene++;
       }
       if(scene == 1) {
           if(Tod.getX() >= MIDDLE-200) {
               Tod.move(-5);
           } else {
               scene++;
           }
           if(Rob.getX() >= MIDDLE-200) {
               Rob.move(-5);
           }
       }
       if(scene == 2) {
           removeObject(Rob);
           removeObject(Tod);
           addObject(portal, MIDDLE-200, 100);
           scene++;
       }
       if(scene == 3) {
           ship.setLocation(ship.getX(), ship.getY()-10);
           if(ship.getY() < 100) {
               Greenfoot.setWorld(new FinalTransition());
           }
       }
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("DinosaurBackground.png");
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
        addObject(Tod, MIDDLE+300, MIDDLE+400);
        addObject(Rob, MIDDLE+200, MIDDLE+400);
        Tod.scale(0.7);
        Rob.scale(0.7);
        Tod.flip();
        Rob.flip();
        ship.setRotation(-90);
        ship.scale(6);
        addObject(ship, MIDDLE-200, MIDDLE+200);
    }
}
