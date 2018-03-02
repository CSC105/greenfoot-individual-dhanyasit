import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hey extends Actor
{
    /**
     * Act - do whatever the hey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public hey(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*2/3,img.getHeight()*2/3);
        setImage(img);
    }
}
