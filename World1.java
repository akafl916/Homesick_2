import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends GeneralWorld
{
    private Button button1 = new Button(1);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public World1()
    {    
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        initalScene();
    }
    
    public void act() {
        initialSceneAct();
    }
    
    private void initialSceneAct() {
        if (button1.getA() == 1) {
            scene1act();
        }
    }
    
    private void initalScene() {
        addObject(button1, 100, 300);
    }
    
    private void scene1Act() {
        
    }
    
    private void scene1() {
        Button button2 = new Button(2);
        addObject(button2, 300, 300);
    }
}
