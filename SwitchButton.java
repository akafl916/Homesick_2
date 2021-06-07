import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button subclass that constructs a button that turns on and off.
 * 
 * @authors Aryan Kafle, Aaron Williams, Christopher Jo, Martin Jang
 * @version 6.2.2021
 */
public class SwitchButton extends Button
{
    private boolean isOn = false;
    public SwitchButton(String image, String image_hovered, String image_unpressed) 
    {
        super(image, image_hovered, image_unpressed);
    }
    
    public void act() {
        setOnClick();
        onHover();
    }
    
    private void setOnClick() {
        if (Greenfoot.mouseClicked(this)) {
            super.onClick();
            if(isOn) {
                Off();
                isOn = false;
            } else if(!isOn) {
                On();
                isOn = true;
            }
        }
    }
    
    protected void On() {}
    protected void Off() {}
}
