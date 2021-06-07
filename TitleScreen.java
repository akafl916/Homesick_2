import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class GeneralWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends Homesick
{
    // Images
    private GifImage gifBackground = new GifImage("spaceBackground.gif");
   
    // Active Actors
    
    /**
     * Constructor for objects of class GeneralWorld.
     * 
     */
    public TitleScreen()
    {  
       playMusic();
       drawButtons();
       drawActors();
       drawMaterials();
    }
    
    public void act() {
        drawBackground();
    }
    
    private void drawBackground() {
        GreenfootImage background = gifBackground.getCurrentImage();
        background.scale(1080, 1080);
        setBackground(background);
    }
    
    private void playMusic() {
        this.introMusic.setVolume(VOLUME*25);
        this.introMusic.playLoop();
    }
    
    private void drawButtons() {
        RectYellowWorldButton nextWorld = new RectYellowWorldButton(new OpeningWorld());
        addObject(nextWorld, MIDDLE+270, MIDDLE+200);
        SettingsButton settings = new SettingsButton();
        addObject(settings, MIDDLE-270, MIDDLE+200);
    }
    
    private void drawMaterials() {
        Asset titleLogo = new Asset("homesickLogo.png");
        addObject(titleLogo, MIDDLE, 200);
        Text txt1 = new Text("Settings", 30, BARK_RED);
        Text txt2 = new Text("Begin!", 30, BARK_RED);
        addObject(txt1, MIDDLE-270, MIDDLE+200);
        addObject(txt2, MIDDLE+270, MIDDLE+200);
    }
    
    private void drawActors() {
        
    }
}
