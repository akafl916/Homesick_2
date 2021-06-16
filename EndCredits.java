import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndCredits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndCredits extends Homesick
{
    private Text developers = new Text("Developers", 60, Color.BLUE);
    private Text developers1 = new Text("Aryan Kafle\nAaron Williams\nMartin Jang\nChristopher Jo", 40, Color.WHITE);
    private Text music = new Text("Music", 60, Color.RED);
    private Text music1 = new Text("Aryan Kafle", 40, Color.WHITE);
    private Text characters = new Text("Characters", 60, Color.GREEN);
    private Text characters1 = new Text("Rob - played by Robert\nTod - played by Todler\nKyle - played by Kevin\nKevin - played by Kyle\nThe Bat - played by Sam", 40, Color.WHITE);
    private Text art = new Text("Special Shoutouts", 60, Color.WHITE);
    private Text art1 = new Text("Art - Google Images\nCode - Greenfoot\nHumor - Tod", 40, Color.WHITE);
    private Text fin = new Text("Thanks for Playing", 100, Color.YELLOW);
    private Asset logo = new Asset("homesickLogo.png", false);
    private Asset black = new Asset("blacker.png", false);
    private Asset black2 = new Asset("blacker.png", false);
    private int slide = 1080;
    private int scene = 0;
    public EndCredits()
    {
       drawBackground();
       drawButtons();
       drawActors();
       drawMaterials();
    }
    
    public void act() {
       if(scene == 0) {
            playMusic();
            scene++;
       }
       developers.setLocation(MIDDLE, 50 + slide);
       developers1.setLocation(MIDDLE, 160 + slide);
       music.setLocation(MIDDLE, 300 + slide);
       music1.setLocation(MIDDLE, 350 + slide);
       characters.setLocation(MIDDLE, 430 + slide);
       characters1.setLocation(MIDDLE, 560 + slide);
       fin.setLocation(MIDDLE, 800 + slide);
       logo.setLocation(MIDDLE, 1080 + slide);
       if(logo.getY() >= 500) {
           slide--;
       }
    }
    
    private void drawBackground() {
        GreenfootImage background = new GreenfootImage("black.png");
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void playMusic() {
        homesick.setVolume(VOLUME*20);
        homesick.play();
    }
    
    private void drawButtons() {
        
    }
    
    private void drawMaterials() {
        
    }
    
    private void drawActors() {
        addObject(developers, MIDDLE, 50);
        addObject(developers1, MIDDLE, 160);
        addObject(music, MIDDLE, 300);
        addObject(music1, MIDDLE, 350);
        addObject(characters, MIDDLE, 430);
        addObject(characters1, MIDDLE, 560);
        addObject(fin, MIDDLE, 800);
        addObject(logo, MIDDLE, 1080);
        black.scale(1080, 300);
        addObject(black, MIDDLE, 1080);
        black2.scale(1080, 300);
        addObject(black2, MIDDLE, 30);
    }
}
