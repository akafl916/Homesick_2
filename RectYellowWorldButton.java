import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * WorldButton subclass that constructs a yellow rectangle button
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.5.2021
 */
public class RectYellowWorldButton extends WorldButton
{
    /**
     * Act - do whatever the rectYellowButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RectYellowWorldButton(World world) 
    {
        super(world,
        "buttonUnpressed.png",
        "buttonHovered.png",
        "buttonPressed.png");
    }
}
