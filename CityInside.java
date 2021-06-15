import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CityInside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityInside extends Homesick
{
    private GreenfootImage background = new GreenfootImage("interiorBuilding.png");
    private NPC lilBot = new NPC("littlerobot.png", 2, 0);
    private NPC bigBot = new NPC("bigrobot.png", 0, 0);
    private NPC Tod = new NPC("tod.png", 1, 4);
    private NPC Rob = new NPC("rob.png", 0, 0);
    private Asset explosion = new Asset("explosion.png", false);
    private Asset pow = new Asset("pow.png", false);
    private int scene = 0;
    private int scene2 = 0;
    
    public CityInside()
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
        if(scene < 50) {
            bigBot.setLocation(bigBot.getX()-5, bigBot.getY());
            scene++;
        }
        if(scene == 50) {
            Greenfoot.delay(100);
            bigBot.say("These are \nprivate grounds.\nYou are\ntresspassing.", false, 3);
            Greenfoot.delay(150);
            bigBot.stopSaying();
            lilBot.say("Yeah what he said!", false, 2);
            Greenfoot.delay(150);
            lilBot.stopSaying();
            Tod.say("...", false, 0);
            Greenfoot.delay(100);
            Tod.stopSaying();
            Rob.say("Yeah we're\ndefinitely taking the\none on the left.", false, 0);
            Greenfoot.delay(150);
            Rob.stopSaying();
            Tod.say("Yeah for sure", false, 0);
            Greenfoot.delay(150);
            Tod.stopSaying();
            lilBot.say("DUDE i'm right here!", false, 2);
            Greenfoot.delay(150);
            lilBot.stopSaying();
            bigBot.flip();
            bigBot.say("I mean they aren't\nwrong, Kyle", false, 0);
            Greenfoot.delay(150);
            bigBot.stopSaying();
            lilBot.say("LEAVE ME ALONE", false, 3);
            Greenfoot.delay(150);
            lilBot.stopSaying();
            bigBot.say("sheesh", true, 0);
            Greenfoot.delay(100);
            bigBot.stopSaying();
            bigBot.flip();
            scene++;
        }
        if(scene > 50 && scene < 100) {
            bigBot.setLocation(bigBot.getX()+5, bigBot.getY());
            scene++;
        }
        if(scene == 100) {
            Greenfoot.delay(50);
            Tod.say("I mean if i\nwe're you i'd\npick the one\non the left.", false, 0);
            Greenfoot.delay(150);
            Tod.stopSaying();
            Tod.say("But if you think\nyou can take the\nbig guy, go\nahead.", false, 0);
            Greenfoot.delay(150);
            Tod.stopSaying();
            scene++;
        }
    }
    
    private void postScene() {
        if(scene == 101) {
            if(Greenfoot.mouseClicked(lilBot)) {
                scene+=100;
            } else if(Greenfoot.mouseClicked(bigBot)) {
                scene+=200;
            }
        }
        if(scene == 301) {
            loseAnimation();
        }
        if(scene == 201) {
            startChase();
        }
    }
    
    private void loseAnimation() {
        bigBot.turnTowards(Rob.getX(), Rob.getY());
        bigBot.move(15);
        bigBot.setRotation(0);
        if (Math.abs(bigBot.getX() - Rob.getX()) < 10 && Math.abs(bigBot.getY() - Rob.getY()) < 10) {
            explosion.scale(0.5);
            addObject(explosion, Rob.getX(), Rob.getY());
            this.groundPow.setVolume(VOLUME*20);
            this.groundPow.play();
            Greenfoot.delay(75);
            Greenfoot.setWorld(new GameOver("you chose the\nbig guy, idiot..."));
        }
    }
    
    private void startChase() {
        if(scene2 == 0) {
            Rob.turnTowards(lilBot.getX(), lilBot.getY());
            Rob.move(5);
            Rob.setRotation(0);
        }
        if (scene2==0 && Math.abs(Rob.getX() - lilBot.getX()) < 10 && Math.abs(Rob.getY() - lilBot.getY()) < 10) {
            pow.scale(0.6);
            addObject(pow, lilBot.getX(), lilBot.getY());
            this.bum.setVolume(VOLUME*20);
            this.bum.play();
            Greenfoot.delay(75);
            removeObject(lilBot);
            removeObject(pow);
            scene2++;
        }
        if(scene2 == 1) {
            Greenfoot.delay(40);
            Rob.say("Run Tod!", false, 0);
            Greenfoot.delay(75);
            Tod.say("AAAAAAA", false, 0);
            Greenfoot.delay(100);
            Tod.stopSaying();
            scene2++;
        }
        if(scene2 == 2) {
            Tod.moveOnKeyPress();
            bigBot.turnTowards(Tod.getX(), Tod.getY());
            bigBot.move(3);
            bigBot.setRotation(0);
            if (Math.abs(bigBot.getX() - Tod.getX()) < 10 && Math.abs(bigBot.getY() - Tod.getY()) < 10) {
                explosion.scale(0.5);
                addObject(explosion, Tod.getX(), Tod.getY());
                this.groundPow.setVolume(VOLUME*20);
                this.groundPow.play();
                Greenfoot.delay(75);
                Greenfoot.setWorld(new GameOver("Tod's slow."));
            } else if(Math.abs(Rob.getX() - Tod.getX()) < 50 && Math.abs(Rob.getY() - Tod.getY()) < 50) {
                Greenfoot.setWorld(new CityInside2());
            }
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
        Rob.scale(0.55);
        Tod.scale(0.55);
        addObject(Rob, MIDDLE-150, MIDDLE+400);
        addObject(Tod, MIDDLE+150, MIDDLE+400);
        bigBot.scale(0.2);
        addObject(bigBot, MIDDLE+400, MIDDLE);
        lilBot.scale(0.15);
        addObject(lilBot, MIDDLE-400, MIDDLE);
    }
}
