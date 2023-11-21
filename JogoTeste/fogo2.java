import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fogo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fogo2 extends Actor
{
    public int temp = 20;
    /**
     * Act - do whatever the fogo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque()
{
    double angle = Math.toRadians( getRotation() );
    int x = (int) Math.round(getX() + Math.cos(angle));
    int y = (int) Math.round(getY() - Math.sin(angle));

    setLocation(x, y);
}
public void acertarAlvo() {
        Actor c = getOneIntersectingObject(ben10.class);
        temp--;
        if (c != null){
        Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        counter2.add(1);    
        if (temp < 1){
            getWorld().removeObject(c);
            getWorld().removeObject(this);
            AlbedoWin world = new AlbedoWin();
            Greenfoot.setWorld(world);
            }
        }
            
            
        }
    }


