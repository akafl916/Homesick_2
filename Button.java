import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Actor subclass that constructs a simple button.
 * The button will set a hovered image when hovered and set a clicked image when clicked.
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class Button extends EnhancedActor
{
    protected GreenfootImage image;
    private GreenfootImage image_pressed;
    private GreenfootImage image_hovered;
    
    public Button(String image,
    String image_hovered,
    String image_pressed) 
    {
        super(image);
        this.image = new GreenfootImage(image);
        this.image_hovered = new GreenfootImage(image_hovered);
        this.image_pressed = new GreenfootImage(image_pressed);
    }
    
    public void act() {
        onClick();
        onHover();
    }
    
    public void scale(int x, int y) {
        image.scale(x, y);
        image_hovered.scale(x, y);
        image_pressed.scale(x, y);
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
