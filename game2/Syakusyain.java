import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Syakusyain extends Actor
{
    private int width= (int)(720*0.2);
    private int height= (int)(1111*0.2);
    
    //シャクシャインの過去の座標
    private int past_x = 0;
    private int past_y = 0;
    
    private final int moving_width = 5; /*移動幅の指定*/
    
    public Syakusyain(){
        getImage().scale( width,height );
    }

    public void act(){
        //シャクシャインの現在の座標
        int current_x = getX(); 
        int current_y = getY();
        
        
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(current_x,current_y-moving_width);
        }
        
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            setLocation(current_x-moving_width,current_y);
        }
        
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(current_x,current_y+moving_width);
        }
        
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(current_x+moving_width,current_y);
        }
        
        Actor chanshi = getOneIntersectingObject(Chanshi.class);
        Actor shanshi = getOneIntersectingObject(Shanshi.class);
        
        //当たり判定の処理
        if(chanshi != null || shanshi != null){
            //衝突があったとき過去のx,y座標に戻す
            setLocation(past_x,past_y);
        }
        
        //過去の座標の更新
        past_x = current_x;
        past_y = current_y;
    }
}    

