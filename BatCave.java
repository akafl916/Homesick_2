import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BatCave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatCave extends Homesick
{   
    private NPC Tod = new NPC("tod.png", 1, 10);
    private NPC Rob = new NPC("rob.png", 0, 0);
    private NPC firstBat = new NPC("bat.png", 2, 0);
    private int scene = 0;
    
    public BatCave()
    {
       drawMaterials();
       drawButtons();
       drawActors();
       drawBackground();
    }
    
    public void act() {
        initialScene();
        postScene();
    }
    
    private void initialScene() {
        if(scene == 0) {
            if(Tod.getX()>600) {
                Tod.move(-5);
            } else {
                scene++;
            }
        }
        if(scene == 1) {
            Greenfoot.delay(100);
            firstBat.say("Hey! What're you\ndoing in my cave!", false, 0);
            Greenfoot.delay(160);
            Tod.flip();
            Greenfoot.delay(50);
            firstBat.stopSaying();
            Tod.say("...we can take\ndown one bat,\ncmon.", false, 0);
            Greenfoot.delay(150);
            Tod.stopSaying();
            scene++;
        }
        if(scene == 2) {
            if(Rob.getX()>200) {
                Rob.move(-5);
            } else {
                scene++;
            }
        }
        if(scene == 3) {
            Tod.flip();
            Rob.flip();
            Greenfoot.delay(50);
            Rob.say("You do what you\nwant to, i'm\ngetting out of\nhere.", false, 0);
            Greenfoot.delay(100);
            Rob.stopSaying();
            scene++;
        }
        if(scene == 4) {
            if(Rob.getY()>600) {
                Rob.setLocation(Rob.getX(), Rob.getY()-4);
            } else {
                Greenfoot.delay(20);
                removeObject(Rob);
                scene++;
            }
        }
        if(scene == 5) {
            if(Tod.getX()<800) {
                Tod.move(5);
            } else {
                scene++;
            }
        }
        if(scene == 6) {
            firstBat.say("Wait until i\ncall mommy!", false, 0);
            Greenfoot.delay(100);
            firstBat.stopSaying();
            scene++;
        }
        if(scene == 7) {
            if(firstBat.getX()>50) {
                firstBat.move(-5);
            } else {
                removeObject(firstBat);
                scene++;
            }
        }
        if(scene == 8) {
            Tod.say("Welp i guess i\nreally am a main\ncharacter.", false, 1);
            Greenfoot.delay(100);
            Tod.stopSaying();
            Tod.say("Oh no", false, 0);
            Greenfoot.delay(100);
            Tod.stopSaying();
            scene = 100;
        }
    }
    
    private void postScene() {
        if(scene == 100) {
            if (Greenfoot.getRandomNumber(1000) < 20) {
                Bat bat = new Bat();
                bat.scale(0.2);
                addObject(bat, 0, Greenfoot.getRandomNumber(150)+780);
            }
            Tod.isTouching(Bat.class, 60, "rabies.");
            Tod.moveOnKeyPress(true, 600);
            if(Tod.getX()<=300 && Tod.getY() <= 700) {
                Greenfoot.setWorld(new DinosaurLast());
            }
        }
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
        addObject(firstBat, MIDDLE-300, 800);
        addObject(Rob, MIDDLE+400, 900);
        addObject(Tod, MIDDLE+350, 900);
        Tod.scale(0.8);
        Rob.scale(0.7);
        firstBat.scale(0.45);
        Tod.flip();
        Rob.flip();
    }
}
