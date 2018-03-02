import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RowU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RowU extends Actor
{
    /**
     * Act - do whatever the RowU wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   

    public RowU(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/10,img.getHeight()*1/10);
        setImage(img);
    }
}
