import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
public int temp = 8;
public int temp1 = 10;
public int temp2 = 10;
    
    public intro()
    {    
        
        super(800, 450, 1); 
    }
    public void act(){
    temp--;
    //Diálogo Toad
    if(Greenfoot.isKeyDown("enter") && (temp < 1)){
        setBackground(new GreenfootImage("2.png"));
        temp1--;
    }
    //Diálogo Mário
    if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
        setBackground(new GreenfootImage("3.png"));
        temp2--;
    }
    //Iniciar o jogo
    if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
        Mundo world = new Mundo();
        Greenfoot.setWorld(world);
    }
}
    }

