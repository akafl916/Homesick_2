import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
