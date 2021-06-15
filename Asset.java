import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that constructs an actor from a greenfoot image 
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Asset extends EnhancedActor
{
    private boolean isGif;
    private GifImage imageGif;
    private boolean isScaled;
    private int scaleAmount;
    
    public Asset(String image, boolean isGif) 
    {
        super(image);
        this.isGif = isGif;
        if(isGif) {
            this.imageGif = new GifImage(image);
        }
    }
    
    public void act() {
        if(isGif) {
            GreenfootImage temp = imageGif.getCurrentImage();
            setImage(temp);
        }
    }
}
