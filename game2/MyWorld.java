import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1600, 900, 1); 
        addObject( new Syakusyain(), 100, 396 );
        addObject( new Chanshi(), 1200, 350 );
        addObject( new Chanshi(), 1200, 650 );
        addObject( new Shanshi(), 1450, 200 );
        addObject( new Shanshi(), 1450, 475 );
        addObject( new Shanshi(), 1450, 750 );
       

    }
}
