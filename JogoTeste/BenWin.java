import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BenWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BenWin extends World
{
    public int temp = 20;
    /**
     * Constructor for objects of class BenWin.
     * 
     */
    public BenWin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act(){
        temp--;
        if (Greenfoot.isKeyDown("enter") && (temp < 1)){
            creditos world = new creditos();
            Greenfoot.setWorld(world);
        }
    }
}
