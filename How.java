import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How extends Actor
{
    /**
     * Act - do whatever the How wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Teach());
          
        }// Add your action code here.
    }

    public How(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/2,img.getHeight()*1/2);
        setImage(img);
    }
}
