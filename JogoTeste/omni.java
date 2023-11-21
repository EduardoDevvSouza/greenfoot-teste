import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class omni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class omni extends Actor
{
    GifImage omni = new GifImage("omni.gif");
    
    /**
     * Act - do whatever the omni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(omni.getCurrentImage());
        
    }
}
