import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ring extends Actor
{
    /**
     * Act - do whatever the ring wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound yoshi =  new GreenfootSound("yoshi.mp3");
    public static int count ;
    public void act() 
    {
        if((Greenfoot.isKeyDown("s"))){
            getWorld().removeObject(this);
            yoshi.play();
            yoshi.setVolume(100);
            MyWorld.player1--;
            MyWorld.player2++;
        }
        if((Greenfoot.isKeyDown("down"))){
            getWorld().removeObject(this);
            yoshi.play();

            yoshi.setVolume(100);
            MyWorld.player2--;
            MyWorld.player1++;
        }
        delete();
    }    

    public ring(){
        GreenfootImage img = getImage();
        img.scale(80,100);
        setImage(img);
    }  

    public void delete(){
        count++;
        if(this.count >=200){
            getWorld().removeObject(this);
        }

    }
}
