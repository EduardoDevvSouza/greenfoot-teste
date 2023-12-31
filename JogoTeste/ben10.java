import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ben10 extends Actor
{
    public int speed=3;
public void act()
    {
       
        if (canMove()) {
            movimento();
        }
        else {
            turnLeft();
        }
    }
    /**
     * Move one step forward.
     */
    public void move()
    {
        move(1);
    }
    
    /**
     * Turn left by 90 degrees.
     */
    public void turnLeft()
    {
        turn(-90);
    }
       
    
    /**
     * Set the direction we're facing. The 'direction' parameter must
     * be in the range [0..3].
     */
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            setRotation(direction * 90);
        }
    }
    
    public void movimento() {
        
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("space")){
            getWorld().addObject(new fogo(), getX() - 100, getY() + 30);
        }
    }
    
    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     */
    public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
        
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
        
        return !facingEdge;
    }
    }
