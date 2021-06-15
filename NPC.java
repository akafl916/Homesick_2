import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Actor that creates dialogue
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.2.2021
 */
public class NPC extends EnhancedActor
{
    private Asset speechBubble;
    private Text speech;
    private GreenfootSound normal1;
    private GreenfootSound normal2;
    private GreenfootSound sad;
    private GreenfootSound happy;
    private GreenfootSound angry = Homesick.angry;
    private boolean isPlayer;
    private int rand = Greenfoot.getRandomNumber(100);
    private int speed;
    /**
     * Act - do whatever the NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NPC(String image, int pitch, int speed) 
    {
        super(image);
        if (pitch == 0) {
            this.normal1 = new GreenfootSound("normal1Low.mp3");
            this.normal2 = new GreenfootSound("normal1Low.mp3");
            this.sad = new GreenfootSound("sadLow.mp3");
            this.happy = new GreenfootSound("happyLow.mp3");
        } else if (pitch == 1) {
            this.normal1 = new GreenfootSound("normal1Mid.mp3");
            this.normal2 = new GreenfootSound("normal1Mid.mp3");
            this.sad = new GreenfootSound("sadMid.mp3");
            this.happy = new GreenfootSound("happyMid.mp3");
        } else if (pitch == 2){
            this.normal1 = new GreenfootSound("normal1High.mp3");
            this.normal2 = new GreenfootSound("normal1High.mp3");
            this.sad = new GreenfootSound("sadHigh.mp3");
            this.happy = new GreenfootSound("happyHigh.mp3");
        }
        this.isPlayer = isPlayer;
        this.speed = speed;
    }
    
    public void act() {
        if(isPlayer) {
            moveOnKeyPress();
        }
    }
    
    public void moveOnKeyPress() {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-speed);
        } else if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+speed);
        } else if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-speed, getY());
        } else if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+speed, getY());
        }
    }
    
    public void say(String dialogue, boolean isThought, int Mood) {
        speech = new Text(dialogue, getWidth()/4, Color.BLACK);
        
        if (isThought) {
            speechBubble = new Asset("thoughtBubble.png", false);
        } else {
            speechBubble = new Asset("speechBubble.png", false);
        }
        
        speechBubble.scale(getWidth()*2, (int)(getHeight()*1.5));
        getWorld().addObject(speechBubble,
        getX()+(getWidth()/2)+(getWidth()/2),
        getY()-(int)(getHeight()*1.5));
        
        getWorld().addObject(speech,
        (getX()+(getWidth()/2)+(getWidth()/2)),
        getY()-(int)(getHeight()*1.5)-speechBubble.getHeight()/12);
        
        if (Mood==0) {
            if(rand<50) {
                normal1.setVolume(20*Homesick.VOLUME);
                normal1.play();
            } else {
                normal2.setVolume(20*Homesick.VOLUME);
                normal2.play();
            }
        } else if (Mood==1) {
            happy.setVolume(20*Homesick.VOLUME);
            happy.play();
        } else if (Mood==2) {
            sad.setVolume(20*Homesick.VOLUME);
            sad.play();
        } else if (Mood==3) {
            angry.setVolume(50*Homesick.VOLUME);
            angry.play();
        }
    }
    
    public void stopSaying() {
        getWorld().removeObject(speech);
        getWorld().removeObject(speechBubble);
    }
}
