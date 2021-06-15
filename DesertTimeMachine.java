import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DesertTimeMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertTimeMachine extends Homesick
{
    private int scene = 0;
    private GreenfootImage background = new GreenfootImage("desertTempleBackground.png");
    private Asset timemachine = new Asset("timemachine.png", false);
    private NPC Tod = new NPC("tod.png", 1, false);
    private NPC Rob = new NPC("rob.png", 0, false);
    /**
     * Constructor for objects of class DesertTimeMachine.
     * 
     */
    public DesertTimeMachine()
    {
       drawActors();
       drawButtons();
       drawMaterials();
       drawBackground();
    }
    
    public void act() {
        if (scene == 0) {
            Rob.say("Oh what a\nconveniently placed\ntime machine!", false, 1);
            Greenfoot.delay(150);
            Rob.stopSaying();
            Tod.say("So we're\njust gonna ignore\nhow you left me\nto get killed\nby a MUMMY", false, 3);
            Greenfoot.delay(300);
            Tod.stopSaying();
            Rob.say("Don't worry, we're\n protagonists, we\ncan't die.", false, 1);
            Greenfoot.delay(150);
            Rob.stopSaying();
            Rob.say("Now use that\nkey on the time\nmachine", false, 0);
            scene++;
        }
        if(Greenfoot.mouseClicked(timemachine)) {
            Greenfoot.setWorld(new DesertTransition());
        }
    }
    private void drawBackground() {
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
        timemachine.scale(0.4);
        addObject(timemachine, MIDDLE, MIDDLE+100);
        Tod.scale(0.7);
        Rob.scale(0.7);
        addObject(Tod, MIDDLE-50, MIDDLE+380);
        addObject(Rob, MIDDLE+50, MIDDLE+400);
    }
}
