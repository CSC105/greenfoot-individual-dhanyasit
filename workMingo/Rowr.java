import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rowr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rowr extends Actor
{
    /**
     * Act - do whatever the Rowr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public Rowr(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/10,img.getHeight()*1/10);
        setImage(img);
    }
}
