import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Actor subclass that constructs a simple button.
 * The button will set a hovered image when hovered and set a clicked image when clicked.
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Button extends Actor
{
    protected String image;
    private String image_pressed;
    private String image_hovered;
    
    public Button(String image,
    String image_hovered,
    String image_pressed) 
    {
        this.image = image;
        this.image_hovered = image_hovered;
        this.image_pressed = image_pressed;
    }
    
    public int getWidth() {
        return this.getImage().getWidth();
    }
    
    public int getHeight(){
        return this.getImage().getHeight();
    }
    
    public void act() {
        onClick();
        onHover();
    }
    
    protected void onClick() {
        if (Greenfoot.mouseClicked(this)) {
            setImage(image_pressed);
            Greenfoot.delay(2);
        }
    }
    
    protected void onHover() {
        if (Greenfoot.mouseMoved(this)) {
            setImage(image_hovered);
        } else if (Greenfoot.mouseMoved(getWorld())) {
            setImage(image);
        }
    }
}
