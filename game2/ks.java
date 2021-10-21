import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ks extends Actor
{
    /**
     * Act - do whatever the ks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(180);
=======
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(-90);
>>>>>>> 489fc4d198eb5001f2b9f0a3d925b5cb2694693e
            move(1);
        }
    }    
}
