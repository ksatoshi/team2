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
        // Add your action code here.
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(1);
        }   
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(-90);
            move(1);
        }
    }
}
