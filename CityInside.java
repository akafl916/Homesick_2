import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CityInside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityInside extends Homesick
{
    private Asset rocket = new Asset("rocket.png", false);
    private Asset portal = new Asset("portal.gif", true);
    /**
     * Constructor for objects of class CityInside.
     * 
     */
    public CityInside()
    {
       drawMaterials();
       drawButtons();
       drawActors();
       drawBackground();
    }
    
    public void act(){
        
    }
    
    public void drawMaterials(){
        
    }
    
    public void drawButtons(){
        Cyberpunkdoor cyberpunkdoor = new Cyberpunkdoor(new CityInside2());
        addObject(cyberpunkdoor, MIDDLE, MIDDLE);
    }
    
    public void drawActors(){
        
    }
    
    public void drawBackground(){
        GreenfootImage background = new GreenfootImage("cyberpunkcity2");
        background.scale(1080, 1080);
        setBackground(background);
    }
}
