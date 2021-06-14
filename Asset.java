import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that constructs an actor from a greenfoot image 
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Asset extends Actor
{
    private String image;
    private boolean isGif;
    private GifImage imageGif;
    
    public Asset(String image, boolean isGif) 
    {
        this.image = image;
        this.isGif = isGif;
        if(isGif) {
            imageGif = new GifImage(image);
        } else {
            setImage(image);
        }
    }
    
    public void act() {
        if (isGif) {
            GreenfootImage temp = imageGif.getCurrentImage();
            setImage(temp);
        }
    }
    
    public void scale(int x, int y) {
        GreenfootImage scaled = new GreenfootImage(image);
        scaled.scale(x, y);
        this.setImage(scaled);
    }
    
    public int getWidth() {
        return this.getImage().getWidth();
    }
    
    public int getHeight(){
        return this.getImage().getHeight();
    }
}
