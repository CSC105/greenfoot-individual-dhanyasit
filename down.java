import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class down here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class down extends Actor
{
    /**
     * Act - do whatever the down wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public down(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/14,img.getHeight()*1/14);
        setImage(img);
    }
}
