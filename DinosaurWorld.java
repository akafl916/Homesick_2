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
    private NPC Tod = new NPC("tod.png", 1, false);
    private NPC Rob = new NPC("rob.png", 0, false);
    private Asset dinosaur = new Asset("Dinosaur.png", false);
    
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
        if (Tod.getY() < 850) {
            Tod.setLocation(Tod.getX()-1, Tod.getY()+18);
        }
        if (Rob.getY() < 850) {
            Rob.setLocation(Rob.getX()+2, Rob.getY()+15);
        } else if(scene == 0){
            removeObject(portal);
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
            scene++;
        }
        if (scene == 1) {
            addObject(dinosaur, 0,700);
            dinosaur.scale(2.5);
            Greenfoot.delay(30);
            Rob.say("OH COME ON", false, 3);
            Greenfoot.delay(100);
            Rob.stopSaying();
            scene++;
        }
        if (scene == 2) {
            toCave();
        }
    }
    
    private void toCave() {
        Greenfoot.setWorld(new DinosaurTransition());
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
        addObject(portal, 540, 100);
        addObject(Tod, 540, 100);
        addObject(Rob, 540, 100);
        Tod.scale(0.7);
        Rob.scale(0.8);
    }
}
