import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage img_bkup = null;
    private int width=75;
    private int height= 75;
    
    public Life(){
        img_bkup = new GreenfootImage( getImage() );
        img_bkup.scale( width,height );
        setImage(img_bkup);
    }
    
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
    }    
}
