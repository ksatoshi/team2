import greenfoot.*;
import greenfoot.core.TextLabel;
import greenfoot.WorldVisitor;
import greenfoot.util.GraphicsUtilities;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public int timer = 9000;
    GreenfootSound bgm = null;
    // Reffered from core/TextLabel.java
    // Copyright (C) 2013,2014 Poul Henriksen and Michael Kolling 
    // Licence: GPL2
    class TextLabelEx extends TextLabel
    {
        boolean enable;
        int xpos;
        int ypos;
        int size;
        boolean bold;
        greenfoot.Color gfcolor;
        java.awt.Color color;
        String text;
        String[] lines;
        private GraphicsUtilities.MultiLineStringDimensions dimensions = null;

        @Override
        public int getX(){ return xpos;}

        @Override
        public int getY(){ return ypos;}

        @Override
        public String getText(){ return text;}     

        public TextLabelEx(String _text, int _xpos, int _ypos, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            super("", 0, 0 );
            lines = new String[1];
            xpos = _xpos;
            ypos = _ypos;
            reset( _text, _size, _bold, _gfcolor );
        }

        public void reset( String _text, int _size, boolean _bold, greenfoot.Color _gfcolor )
        {
            if( text == _text && size == _size && bold == _bold && gfcolor == _gfcolor ) return;
            text = _text;
            size = _size;
            bold = _bold;
            gfcolor = _gfcolor;
            lines[0] = text;
            dimensions = null;

            if( text.length() == 0 ) enable = false;
            else enable = true;
        }

        @Override
        public void draw(Graphics2D g, int cellsize)
        {
            if( !enable ) return;
            if(dimensions == null) {
                dimensions = GraphicsUtilities.getMultiLineStringDimensions(lines, bold ? java.awt.Font.BOLD : java.awt.Font.PLAIN, size);
                color = new java.awt.Color( gfcolor.getRed(), gfcolor.getGreen(), gfcolor.getBlue(), gfcolor.getAlpha() );
            }

            int ydraw = ypos * cellsize - dimensions.getHeight() / 2 + cellsize / 2;
            int xdraw = xpos * cellsize - dimensions.getWidth() / 2 + cellsize / 2;
            g.translate(xdraw, ydraw);
            GraphicsUtilities.drawOutlinedText(g, dimensions, color, java.awt.Color.BLACK);
            g.translate(-xdraw, -ydraw);
        }
    }   

    public void showTextEx(String text, int x, int y, int size, boolean bold, greenfoot.Color color )
    {
        for( TextLabel label : WorldVisitor.getTextLabels(this) ){
            if( label.getX() == x && label.getY() == y ){
                if( label instanceof TextLabelEx ){
                    ((TextLabelEx)label).reset(text, size, bold, color);
                    return;                    
                }
            }
        }
        WorldVisitor.getTextLabels(this).add(new TextLabelEx( text, x, y, size, bold, color ) );

        //showText( "labels: "+WorldVisitor.getTextLabels(this).size(), 80, 20 );
    }

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
        addObject( new Shanshi(), 1450, 225 );
        addObject( new Shanshi(), 1450, 500 );
        addObject( new Shanshi(), 1450, 775 );
        showTextEx("Timer:" + timer/100, 100, 50, 50, false, greenfoot.Color.BLACK );
        
        bgm = new GreenfootSound( "test.mp3" );
    }

    public void subtractTime()
    {
        showTextEx("Timer:" + timer/100, 100, 50, 50, false, greenfoot.Color.BLACK );
        if(timer > 0) {
            timer--;
        }
        if(timer <= 0){
            
            showText( "GAME CLEAR!", 800, 450 );
            Greenfoot.stop();
        }
        //addObject( new timer(),100,50);

    }

    public void act() 
    {
        subtractTime();
    }
    
    public void started()
    {
        bgm.playLoop();
    }
    
    public void stopped()
    {
        bgm.stop();
    }
}
