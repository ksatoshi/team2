import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

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
    private int width=150;
    private int height= 150;
    private int timecount=900;
    private Random rand;
   
    public Shanshi(){
        img_bkup = new GreenfootImage( getImage() );
        img_bkup.scale( width,height );
        setImage(img_bkup);
        rand = new Random();
    }
    

    public void act() 
    {
        // Add your action code here.
        //timecount--;

        //GreenfootImage img = new GreenfootImage(img_bkup);
        //img.scale( width,height );
        

        int x = getX();
        int y = getY();
        
        int timer = ((MyWorld)getWorld()).timer;
       
        timer = timer / 100;
        
        if((timer%2) == 0)
        {
            setLocation(x,y+1);
        }
        if((timer%2) == 1)
        {
            setLocation(x,y-1);
        }

                //銃弾を出すための乱数を生成
        int r = rand.nextInt(1000)+1;
        //rが3の倍数の時に銃弾を出す
        if(r%330==0){
            getWorld().addObject(new Judan(),x,y);
        }
    }      
}
