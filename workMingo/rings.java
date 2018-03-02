import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rings extends Actor
{
    /**
     * Act - do whatever the rings wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public rings(){
        GreenfootImage img = getImage();
        img.scale(80,100);
        setImage(img);
    }  
}
