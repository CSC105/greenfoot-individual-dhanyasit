import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class konoha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class konoha extends Actor
{
    /**
     * Act - do whatever the konoha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int naruto = 0;
    public void act() 
    {
        delete();
    }    

    public konoha(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/8,img.getHeight()*1/8);
        setImage(img);
    }
    public void delete(){
        naruto++;
        if(naruto >= 400){
            getWorld().removeObject(this);
        }
    }
}
