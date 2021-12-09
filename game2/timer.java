import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    public int timer = 90;
    public void setImage()
    {
        text();
    }
    public void text(){
        setImage(new GreenfootImage("Timer:" + timer,50,Color.BLACK,Color.WHITE));
    }
    public void subtractTime()
    {
        setImage();
        if(timer > 0) {
            timer--;
        }
        if(timer <= 0){
            Greenfoot.stop();
        }
    }
    public  timer() 
    {
        subtractTime();
    }    
}
