import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Switch Button that opens and closes the settings
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingsButton extends SwitchButton
{   
    // Objects in Settings
    //private Asset backdrop = new Asset("metalPlateRedBorder.jpg");
    private VolumeButton mvb = new VolumeButton(0);
    private VolumeButton nvb = new VolumeButton(1);
    private VolumeButton hvb = new VolumeButton(2);
    private Text mute = new Text("Mute Volume", 24, Color.WHITE);
    private Text norm = new Text("Set Normal Volume", 24, Color.WHITE);
    private Text high = new Text("Set High Volume", 24, Color.WHITE);
    
    public SettingsButton() 
    {
        super("buttonUnpressed.png",
        "buttonHovered.png",
        "buttonPressed.png");
    }
    
    protected void On() {
        //getWorld().addObject(backdrop, Homesick.MIDDLE-270, Homesick.MIDDLE-20);
        getWorld().addObject(mvb, Homesick.MIDDLE-370, Homesick.MIDDLE+70);
        getWorld().addObject(nvb, Homesick.MIDDLE-370, Homesick.MIDDLE-20);
        getWorld().addObject(hvb, Homesick.MIDDLE-370, Homesick.MIDDLE-110);
        getWorld().addObject(mute, Homesick.MIDDLE-250, Homesick.MIDDLE+70);
        getWorld().addObject(norm, Homesick.MIDDLE-250, Homesick.MIDDLE-20);
        getWorld().addObject(high, Homesick.MIDDLE-250, Homesick.MIDDLE-110);
    }
    
    protected void Off() {
        World world = getWorld();
        //world.removeObject(backdrop);
        world.removeObject(mvb);
        world.removeObject(nvb);
        world.removeObject(hvb);
        //world.removeObject(backdrop);
        world.removeObject(mute);
        world.removeObject(norm);
        world.removeObject(high);
    }
}
