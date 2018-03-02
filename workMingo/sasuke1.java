import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sasuke1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sasuke1 extends Actor
{
    /**
     * Act - do whatever the sasuke1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int naruto1 ;
    public void act() 
    {
        delete();
    }    

    public sasuke1(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/8,img.getHeight()*1/8);
        setImage(img);
    }
    public void delete(){
        naruto1++;
        if(naruto1 >= 600){
            
            getWorld().removeObject(this);
        }
    } 
}
