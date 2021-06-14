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
    /**
     * Act - do whatever the NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NPC(String image, int pitch) 
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
            if(Greenfoot.getRandomNumber(100) < 50) {
                normal1.setVolume(10*Homesick.VOLUME);
                normal1.play();
            } else {
                normal2.setVolume(10*Homesick.VOLUME);
                normal2.play();
            }
        } else if (Mood==1) {
            happy.setVolume(10*Homesick.VOLUME);
            happy.play();
        } else if (Mood==2) {
            sad.setVolume(10*Homesick.VOLUME);
            sad.play();
        }
    }
    
    public void stopSaying() {
        getWorld().removeObject(speech);
        getWorld().removeObject(speechBubble);
    }
}
