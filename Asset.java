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
    
    public Asset(String image) 
    {
        setImage(image);
        this.image = image;
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
