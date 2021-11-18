import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Syakusyain extends Actor
{
    private int width= 175;
    private int height= 175;
    
    private final int moving_width = 3; /*移動幅の指定*/
    
    private Actor chanshi;
    private Actor shanshi;

    public Syakusyain(){
        getImage().scale( width,height );
    }

    public void act(){
        int x = getX();
        int y = getY();
        
        chanshi = getOneIntersectingObject(Chanshi.class);
        shanshi = getOneIntersectingObject(Shanshi.class);
        
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(x,y-moving_width);
        }
        
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            setLocation(x-moving_width,y);
        }
        
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(x,y+moving_width);
        }
        
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(x+moving_width,y);
        }
        
        //当たり判定の処理
        if(chanshi != null){
        }
        
        if(shanshi != null){
        }
    }
}    

