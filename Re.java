import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Re here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Re extends Actor
{
    /**
     * Act - do whatever the Re wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());

        }
    }    

    public Re(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/9,img.getHeight()*1/9);
        setImage(img);
    }
}
