import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sasuke2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sasuke2 extends Actor
{
    /**
     * Act - do whatever the sasuke2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int naruto2 ;
    public void act() 
    {
        delete();
    }    

    public sasuke2(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/8,img.getHeight()*1/8);
        setImage(img);
    }
    public void delete(){
        naruto2++;
        if(naruto2 >= 700){
            
            getWorld().removeObject(this);
        }
    } 
}
