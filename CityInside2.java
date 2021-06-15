import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CityInside2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityInside2 extends Homesick
{
    private GreenfootImage background = new GreenfootImage("interiorBuildingNoDoor.png");
    private NPC Tod = new NPC("tod.png", 1, 4);
    private NPC Rob = new NPC("rob.png", 0, 0);
    private Asset controlPanel = new Asset("controlPanel.png", false);
    private Asset portal = new Asset("portal2.gif", true);
    private int scene = 0;
    public CityInside2()
    {
       drawBackground();
       drawButtons();
       drawActors();
       drawMaterials();
       playMusic();
    }
    
    public void act() {
       initialScene();
       postScene();
    }
    
    private void initialScene() {
        if (scene == 0) {
            Rob.say("Look, another\nconvienently placed\ntime... thing?", false, 1);
            Greenfoot.delay(150);
            Rob.stopSaying();
            Tod.say("Whatever it\nis, i'm just gonna\npull this big\nred lever", false, 1);
            Greenfoot.delay(150);
            Tod.stopSaying();
            Rob.say("huh, what's\nthis? 'warning...\ndo not\npull the big\nred lever.'", true, 0);
            Greenfoot.delay(200);
            Rob.stopSaying();
            Rob.say("...", false, 0);
            Greenfoot.delay(200);
            Rob.stopSaying();
            Rob.say("TOD NOOOOOOOOO\nOOOOOOOOOOOOOO\nOOOOOOOOOOOOOO", false, 3);
            Greenfoot.delay(50);
            Rob.stopSaying();
            addObject(portal, MIDDLE-200, MIDDLE);
            scene++;
        }
        if (scene == 1) {
            Tod.turnTowards(portal.getX(), portal.getY());
            Rob.turnTowards(portal.getX(), portal.getY());
            Tod.move(10);
            Rob.move(10);
            if(Tod.getX() <= portal.getX()) {
                Greenfoot.setWorld(new CityTransition());
            }
        }
    }
    
    private void postScene() {
        
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
        Rob.scale(0.55);
        Tod.scale(0.55);
        controlPanel.scale(0.5);
        controlPanel.setRotation(-90);
        Tod.flip();
        Rob.flip();
        addObject(Rob, MIDDLE+350, MIDDLE-70);
        addObject(Tod, MIDDLE+350, MIDDLE+70);
        addObject(controlPanel, MIDDLE+200, MIDDLE);
    }
}
