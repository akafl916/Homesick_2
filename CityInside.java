import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CityInside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityInside extends Homesick
{

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
        
    }
    
    public void drawActors(){
        
    }
    
    public void drawBackground(){
        GreenfootImage background = new GreenfootImage("cyberpunkcity2.1.jpg");
        background.scale(1080, 1080);
        setBackground(background);
    }
}
