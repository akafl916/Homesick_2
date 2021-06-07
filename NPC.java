import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Actor that creates dialogue
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.2.2021
 */
public class NPC extends Actor
{
    Asset speechBubble;
    Text speech;
    /**
     * Act - do whatever the NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public NPC(String image) 
    {
        setImage(image);
    }
    
    public void say(String dialogue, boolean isThought) {
        speech = new Text(dialogue, 24, Color.BLACK);
        
        if (isThought) {
            speechBubble = new Asset("thoughtBubble");
        } else {
            speechBubble = new Asset("speechBubble.png");
        }
        
        getWorld().addObject(speechBubble,
        getX()+(getWidth()/2)+(speechBubble.getWidth()/2)-100,
        getY()-(getHeight()/2)-(speechBubble.getHeight()/2)+50);
        
        getWorld().addObject(speech,
        getX()+(getWidth()/2)+(speechBubble.getWidth()/2)-100,
        getY()-(getHeight()/2)-(speechBubble.getHeight()/2)-50);
    }
    
    public void stopSaying() {
        getWorld().removeObject(speech);
        getWorld().removeObject(speechBubble);
    }
    
    public int getWidth() {
        return this.getImage().getWidth();
    }
    
    public int getHeight(){
        return this.getImage().getHeight();
    }
}
