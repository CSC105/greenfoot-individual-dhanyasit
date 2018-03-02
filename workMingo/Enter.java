import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enter extends Actor
{
    /**
     * Act - do whatever the Enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());

        } 
    }

    public Enter(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/2,img.getHeight()*1/2);
        setImage(img);
    }

}
