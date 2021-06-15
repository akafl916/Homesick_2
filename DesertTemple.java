import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DesertTemple extends Homesick
{
    private int scene = 0;
    private int answerCounter = 0;
    private int robsPatience = 90;
    private Asset coffin1 = new Asset("coffin.png", false);
    private Asset coffin2 = new Asset("coffin.png", false);
    private Asset coffin3 = new Asset("coffin.png", false);
    private Asset coffin4 = new Asset("coffin.png", false);
    private Asset coffin5 = new Asset("coffin.png", false);
    private Asset coffin6 = new Asset("coffin.png", false);
    private NPC Tod = new NPC("tod.png", 1, false);
    private NPC Rob = new NPC("rob.png", 0, false);
    private Asset mummy = new Asset("mummy.png", false);
    private Asset key = new Asset("key.png", false);
    private Text rp = new Text("Rob's Patience: " + 90, 50, Color.BLACK);
    private Asset explosion = new Asset("explosion.png", false);
    // Worlds Available
    // Images and Colors
    private GreenfootImage background = new GreenfootImage("desertTempleBackground.png");
    // Sounds and Music
    /**
     * Constructor for objects of class OpeningWorld.
     * 
     */
    public DesertTemple()
    {
       drawActors();
       drawButtons();
       drawMaterials();
       drawBackground();
    }
    
    public void act() {
       initialScene();
       if(Greenfoot.mouseClicked(coffin3)) {
           if(scene == 1) {
               spawnMummy();
               scene++;
           }
       }
       if(Greenfoot.mouseClicked(coffin1) || Greenfoot.mouseClicked(coffin2)
       || Greenfoot.mouseClicked(coffin4) || Greenfoot.mouseClicked(coffin5)
       || Greenfoot.mouseClicked(coffin6)){
           robsPatience-=30;
           removeObject(rp);
           rp = new Text("Rob's Patience: " + robsPatience, 50, Color.BLACK);
           addObject(rp,300, 100);
       }
       if(robsPatience==0) {
           Greenfoot.setWorld(new GameOver("Rob got tired\nof waiting around."));
       }
       if(scene == 2) {
           mummy.setLocation(mummy.getX()+2, mummy.getY()-1);
           if(mummy.getY() == Tod.getY()) {
               Greenfoot.setWorld(new GameOver("you got killed\nby the mummy"));
           }
           if(Greenfoot.mouseClicked(mummy)) {
               addObject(explosion, mummy.getX(), mummy.getY());
               this.groundPow.setVolume(VOLUME*20);
               this.groundPow.play();
               Greenfoot.delay(50);
               removeObject(explosion);
               removeObject(mummy);
               scene++;
           }
       }
       if(scene == 3) {
           Tod.stopSaying();
           Greenfoot.delay(50);
           Tod.say("...", false, 0);
           Greenfoot.delay(125);
           Tod.stopSaying();
           Tod.say("Kaboom?", false, 0);
           Greenfoot.delay(150);
           Tod.stopSaying();
           Tod.say("I should\nprobably get that\nkey and bring it\nto Rob.", true, 0);
           scene++;
       }
       if(Greenfoot.mouseClicked(key)) {
           Greenfoot.setWorld(new DesertTimeMachine());
       }
    }
    
    private void spawnMummy() {
        coffin3.setImage("openCoffin.png");
        coffin3.scale(0.34);
        key.scale(0.05);
        addObject(key, coffin3.getX(), coffin3.getY());
        mummy.scale(0.2);
        addObject(mummy, coffin3.getX()+30, coffin3.getY()+40);
        Rob.stopSaying();
        Greenfoot.delay(75);
        Rob.say("I'm getting\nout of here!", false, 0);
        Greenfoot.delay(50);
        Rob.move(100);
        Greenfoot.delay(20);
        Rob.stopSaying();
        removeObject(Rob);
        Tod.stopSaying();
        Tod.say("I gotta\nget out of\n here!", true, 0);
        Greenfoot.delay(50);
    }
    
    private void initialScene() {
        if (scene == 0) {
            Greenfoot.delay(50);
            Rob.say("You\nshould probably\nCheck those coffins,\nTod.", false, 0);
            Greenfoot.delay(100);
            Tod.say("Ok", false, 0);
            scene++;
        }
    }
    
    private void drawBackground() {
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        addObject(rp, 300, 100);
    }
    
    private void drawActors() {
        coffin3.scale(0.75*0.5);
        addObject(coffin3, MIDDLE - 140, MIDDLE+175+50);
        coffin2.scale(0.9*0.5);
        addObject(coffin2, MIDDLE - 220, MIDDLE+270+50);
        addObject(coffin1, MIDDLE - 330, MIDDLE+370+50);
        coffin4.scale(0.75*0.5);
        addObject(coffin4, MIDDLE + 160, MIDDLE+175+50);
        coffin5.scale(0.9*0.5);
        coffin1.scale(0.5);
        coffin6.scale(0.5);
        addObject(coffin5, MIDDLE + 240, MIDDLE+270+50);
        addObject(coffin6, MIDDLE + 350, MIDDLE+370+50);
        Rob.scale(0.5);
        addObject(Rob, MIDDLE-70, MIDDLE+140);
        Tod.scale(0.6);
        addObject(Tod, MIDDLE+70, MIDDLE+160);
    }
}
