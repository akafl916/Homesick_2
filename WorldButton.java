import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button subclass that constructs a button that takes in the parameter world.
 * A world button will set a given world when pressed.
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.2.2021
 */
public class WorldButton extends Button
{
    private World world;
    public WorldButton(World world,
    String image,
    String image_hovered,
    String image_pressed) 
    {
        super(image, image_hovered, image_pressed);
        this.world = world;
    }
    
    public void act() {
        toWorld();
        onHover();
    }
    
    private void toWorld() {
        if (Greenfoot.mouseClicked(this)) {
            super.onClick();
            Greenfoot.setWorld(world);
        }
    }
}
