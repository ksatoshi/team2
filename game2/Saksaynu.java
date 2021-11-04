import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Saksaynu extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width= 175;
    private int height= 175;

    public Saksaynu(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
        
    }

  
}    

