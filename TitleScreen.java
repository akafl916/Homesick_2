import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class GeneralWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends DefaultWorld
{
    // Worlds Available
    private OpeningWorld opw = new OpeningWorld();
    private Settings set = new Settings();
    // Images and Colors
    private GifImage gifBackground = new GifImage("spaceBackground.gif");
    private Color BARK_RED = new Color(89, 0, 12);
    // Sounds and Music
    
    /**
     * Constructor for objects of class GeneralWorld.
     * 
     */
    public TitleScreen()
    {  
       drawButtons();
       drawActors();
       drawMaterials();
       playMusic();
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
        this.introMusic.setVolume(musicVolume*25);
        this.introMusic.playLoop();
    }
    
    private void drawButtons() {
        RectYellowButton nextWorld = new RectYellowButton(opw);
        addObject(nextWorld, middle+270, middle+200);
        RectYellowButton settings = new RectYellowButton(set);
        addObject(settings, middle-270, middle+200);
    }
    
    private void drawMaterials() {
        Material titleLogo = new Material("homesickLogo.png");
        addObject(titleLogo, middle, 200);
        Text txt1 = new Text("Settings", 30, BARK_RED);
        Text txt2 = new Text("Begin!", 30, BARK_RED);
        addObject(txt1, middle-270, middle+200);
        addObject(txt2, middle+270, middle+200);
    }
    
    private void drawActors() {
        
    }
}
