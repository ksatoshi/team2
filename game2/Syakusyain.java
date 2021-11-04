import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Syakusyain extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width= 175;
    private int height= 175;

    public Syakusyain(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
        
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(x,y+1);
        }
        
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            setLocation(x-1,y);
        }
        
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(x,y-1);
        }
        
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(x+1,y);
        }
    }

  
}    

