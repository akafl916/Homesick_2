import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desert extends Homesick
{
    private int scene = 0;
    private int musicScene = 0;
    private int todInt = 0;
    private Asset rocket = new Asset("rocket.png", false);
    private Asset portal = new Asset("portal.gif", true);
    private Asset explosion = new Asset("explosion.png", false);
    private NPC Tod = new NPC("tod.png", 1, 0);
    private NPC Rob = new NPC("rob.png", 0, 0);
    // Worlds Available
    // Images and Colors
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    
    public Desert()
    {
       drawMaterials();
       drawButtons();
       drawActors();
       drawBackground();
    }
    
    private void stopPreviousMusic() {
        this.ambientSpace.pause();
    }
    
    public void act() {
       stopPreviousMusic();
       initialAnimation();
    }
        
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("desertBackground.jpg");
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void playMusic() {
        this.desertMusic.setVolume(VOLUME*15);
        this.desertMusic.playLoop();
        musicScene++;
    }
    
    private void drawButtons() {
        DesertDoor desertDoor = new DesertDoor(new DesertTemple());
        addObject(desertDoor, MIDDLE-300, MIDDLE+310);
    }
    
    private void drawMaterials() {
        Asset desertPyramid = new Asset("desertPyramid.png", false);
        desertPyramid.scale(1000, 1000);
        addObject(desertPyramid, MIDDLE, MIDDLE);
        Asset house1 = new Asset("pyramidDoor.png", false);
        addObject(house1, MIDDLE-260, MIDDLE+310);
        Asset house3 = new Asset("pyramidDoor.png", false);
        addObject(house3, MIDDLE-200, MIDDLE+320);
        Asset house4 = new Asset("pyramidDoor.png", false);
        addObject(house4,  MIDDLE-360, MIDDLE+300);
        Asset house2 = new Asset("pyramidDoor.png", false);
        addObject(house2, MIDDLE-390, MIDDLE+319);
        addObject(portal, 1040, 50);
    }
    
    private void initialAnimation() {
        if(scene == 0) {
            this.portalPew.setVolume(VOLUME*20);
            this.portalPew.play();
            scene++;
        }
        addObject(rocket, 1080, 0);
        rocket.setRotation(120);
        if(rocket.getY() < 900) {
            rocket.move(20);
        } else {
            scene++;
        }
        
        if(scene == 2) {
            Text text1 = new Text("Rob: Tod! It was a big red button that said 'time travel' and\n'DO NOT TOUCH' what do you mean you 'had to touch it'?", 24, Color.BLACK);
            Text text2 = new Text("Tod: ...", 24, Color.BLACK);
            Text text3 = new Text("Rob: Now look at us, we're stranded!", 24, Color.BLACK);
            Text text4 = new Text("Tod: ...I guess you could say we're in the... pyra-middle... of nowhere...", 24, Color.BLACK);
            Text text5 = new Text("Rob: TOD", 24, Color.BLACK);
            removeObject(portal);
            explosion.scale(200, 200);
            addObject(explosion, rocket.getX(), rocket.getY());
            this.groundPow.setVolume(VOLUME*20);
            this.groundPow.play();
            Greenfoot.delay(50); 
            removeObject(explosion);
            Greenfoot.delay(130);
            addObject(text1, MIDDLE+200, MIDDLE);
            this.sadLow.setVolume(VOLUME*20);
            this.sadLow.play();
            Greenfoot.delay(250);
            addObject(text2, MIDDLE+200, MIDDLE+50);
            this.normal1Mid.setVolume(VOLUME*20);
            this.normal1Mid.play();
            Greenfoot.delay(150);
            addObject(text3, MIDDLE+200, MIDDLE+100);
            this.sadLow.setVolume(VOLUME*20);
            this.sadLow.play();
            Greenfoot.delay(200);
            addObject(text4, MIDDLE+200, MIDDLE+150);
            this.normal2Mid.setVolume(VOLUME*20);
            this.normal2Mid.play();
            Greenfoot.delay(250);
            addObject(text5, MIDDLE+200, MIDDLE+200);
            this.angry.setVolume(VOLUME*50);
            this.angry.play();
            Greenfoot.delay(200);
            playMusic();
            Rob.scale(0.5);
            Tod.flip();
            Tod.scale(0.5);
            addObject(Rob, 700, 920);
            addObject(Tod, 600, 900);
            scene++;
        }
        if(Greenfoot.mouseClicked(Tod) && todInt == 0) {
            Tod.say("maybe\nwe should\ngo inside\none of those\nhouses", true, 0);
            todInt = 1;
        } else if (Greenfoot.mouseClicked(Tod) && todInt == 1) {
            Tod.stopSaying();
            todInt = 0;
        }
    }
    
    private void drawActors() {
        
    }
}
