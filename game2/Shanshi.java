import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shanshi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shanshi extends Actor
{
    /**
     * Act - do whatever the Shanshi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage img_bkup = null;
    private int width=250;
    private int height= 250;

    public Shanshi(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }

    public void act() 
    {
        // Add your action code here.

        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);

        int x = getX();
        int y = getY();
        int up=0;
        int down=0;

        for(int i=0; i<90; i++)
        {
            up = (int)Math.random()*4;
            down = (int)Math.random()*4;

            setLocation(x,y+up);
            setLocation(x,y+down);

        }

    }      
}
