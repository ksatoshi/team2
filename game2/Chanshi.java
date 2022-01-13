import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Chanshi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chanshi extends Actor
{
    /**
     * Act - do whatever the Chanshi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private GreenfootImage img_bkup = null;
    private int width=150;
    private int height= 150;
    private Random rand;

    public Chanshi(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
        rand = new Random();
    }

    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();

        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        
        //銃弾を出すための乱数を生成
        int r = rand.nextInt(100)+1;
        //rが3の倍数の時に銃弾を出す
        if(r%98==0){
            getWorld().addObject(new Judan(),x,y);
        }

    }
}
