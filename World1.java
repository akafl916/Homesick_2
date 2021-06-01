import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends GeneralWorld
{
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
        initialScene1();
    }
    
    private void initialScene1() {
        Button1 button1 = new Button1();
        addObject(button1, 100, 300);
        if (button1.getA() == 1) {
            scene1();
        }
    }
    private void scene1() {
        Button2 button2 = new Button2();
        addObject(button2, 300, 300);
    }
}
