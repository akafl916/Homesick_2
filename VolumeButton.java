import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button subclass that constructs a button that changes the universal music volume.
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.2.2021
 */
public class VolumeButton extends Button
{
    private int value;
    /**
     * Act - do whatever the VolumeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VolumeButton(int value)
    {
        super("buttonSmall.png", "buttonSmallHovered.png", "buttonSmallPressed.png");
        this.value = value;
    }
    
    public void act() {
        changeOnClick();
        onHover();
    }
    
    private void changeOnClick() {
        if (Greenfoot.mouseClicked(this)) {
            super.onClick();
            Homesick.VOLUME = value;
            Homesick.introMusic.setVolume(Homesick.VOLUME*25);
        }
    }
}
