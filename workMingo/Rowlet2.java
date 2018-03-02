import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rowlet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rowlet2 extends Actor
{
    GreenfootSound o = new GreenfootSound("yoro.mp3");
    GreenfootSound d =  new GreenfootSound("disgrace.wav");
    private int count;
    boolean a,b = true;
    public void act() 
    {
        delete();
    }   

    public Rowlet2(){
        GreenfootImage img = getImage();
        img.scale(450,300);
        setImage(img);
    }

    public void delete(){
        if((Greenfoot.isKeyDown("d"))){
            getWorld().removeObject(this);
            o.play();
            o.setVolume(80);
            MyWorld.player1++;
        }
        else if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("a")){
            getWorld().removeObject(this);
            MyWorld.player1--;
            d.play();
            d.setVolume(100);
            a = true;
            if(a == true){
                MyWorld.player1=MyWorld.player1;
            }
        }
        else if((Greenfoot.isKeyDown("right"))){
            getWorld().removeObject(this);
            o.play();
            o.setVolume(80);
            MyWorld.player2++;
        }
        else if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("left")){
            getWorld().removeObject(this);
            MyWorld.player2--;
            d.play();
            d.setVolume(100);
            b = true;
            if(b == true){
                MyWorld.player2=MyWorld.player2;
            }
        }
        count++;
        if(count>=200){
        getWorld().removeObject(this);
        }
       
    }
}

