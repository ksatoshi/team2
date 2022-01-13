import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Judan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Judan extends Actor
{
    private GreenfootImage img;
    private int x,y;
    private int moving_width = 5;
    
    public Judan(){
        img = new GreenfootImage( getImage());
        img.scale(30,15);
        setImage(img);
    }
    /**
     * Act - do whatever the Judan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        x = getX();
        y = getY();
        
        setLocation(x-moving_width,y);
        
        //画面の端まで来たら削除する
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
