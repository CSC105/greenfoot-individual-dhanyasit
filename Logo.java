import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Actor
{
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        dance();
    }

    public Logo(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/3,img.getHeight()*1/3);
        setImage(img);
    }

    public void dance(){
        if(getX()==264){
            move(0);
        }else{
            move(-2);
        }
    }
}
