import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomba extends Actor
{
    private int leavesEaten;
    public void act()
    {
        
    }
    
        public boolean foundmorango()
    {
        Actor ben10= getOneObjectAtOffset(0, 0, ben10.class);
        return ben10 != null;
    }
    
    /**
     * Eat a leaf (if there is one in our cell).
     */
    public void eatben10()
    {
        Actor ben10 = getOneObjectAtOffset(0, 0, ben10.class);
        if (ben10 != null) {
            
            getWorld().removeObject(ben10);
            leavesEaten = leavesEaten + 1; 
        }
    }
    
public int getLeavesEaten()
    {
        return leavesEaten;
    }
}


