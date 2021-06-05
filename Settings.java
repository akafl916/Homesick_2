import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings extends DefaultWorld
{
    /**
     * Constructor for objects of class World2.
     * 
     */
    public Settings()
    {
        playMusic();
    }
    
    private void playMusic() {
        this.introMusic.pause();
    }
}
