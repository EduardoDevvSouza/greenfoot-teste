import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Eduardo
 * @version 0.1 Alpha
 */
public class Mundo extends World
{

    private GreenfootSound bgMusic = new GreenfootSound("ben10theme.mp3");

public void started()
{
bgMusic.playLoop();
}

public void stopped()
{
bgMusic.pause();
}
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        ben10 ben10 = new ben10();
        addObject(ben10,616,309);
        ben10.setLocation(686,305);
        ben10.setLocation(645,309);
        ben10.setLocation(675,371);
        ben10.setLocation(504,176);
        ben10.setLocation(497,228);
        ben10.setLocation(552,192);
        ben10.setLocation(540,208);
        ben10.setLocation(540,219);
        albedo albedo = new albedo();
        addObject(albedo,243,213);
        omni omni = new omni();
        addObject(omni,706,400);
        Counter counter = new Counter();
        addObject(counter,97,46);
        Counter2 counter2 = new Counter2();
        addObject(counter2,701,43);
        ben10.setLocation(626,217);
        albedo.setLocation(152,214);
    }
}
