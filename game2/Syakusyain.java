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
    
    public Syakusyain(){
        getImage().scale( width,height );
    }

    public void act(){
        int x = getX();
        int y = getY();
        
        
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
        
        Actor chanshi = getOneIntersectingObject(Chanshi.class);
        Actor shanshi = getOneIntersectingObject(Shanshi.class);
        
        //当たり判定の処理
        if(chanshi != null){
            int width = chanshi.getImage().getWidth();
            int height = chanshi.getImage().getHeight();
            int en_x = chanshi.getX();
            int en_y = chanshi.getY();
            
            if(x <= en_x){
                setLocation(en_x-width-2,y);
            }else{
                setLocation(en_x+width/2,y);
            }
        }
        
        if(shanshi != null){
            
        }
    }
}    

