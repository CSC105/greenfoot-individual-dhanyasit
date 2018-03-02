import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rowlet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rowlet1 extends Actor
{
    GreenfootSound o = new GreenfootSound("yoro.mp3");
    private int count;
    GreenfootSound d =  new GreenfootSound("disgrace.wav");

    boolean y , z = true;
    public void act() 
    {
        delete();
    }

    public Rowlet1(){
        GreenfootImage img = getImage();
        img.scale(450,300);
        setImage(img);
    }

    public void delete(){
        if((Greenfoot.isKeyDown("a"))){
            getWorld().removeObject(this);
            o.play();
            o.setVolume(80);
            MyWorld.player1++;
        }
        else if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("d")){
            getWorld().removeObject(this);
            d.play();
            d.setVolume(100);
            MyWorld.winner1--;
            if(MyWorld.winner1<0){
                MyWorld.player1-=1;
                y = true;
            }
            if(y == true){
                MyWorld.player1=MyWorld.player1;
            }
        }
        else if((Greenfoot.isKeyDown("left"))){
            getWorld().removeObject(this);
            o.play();
            o.setVolume(80);
            MyWorld.player2++;
        }
        else if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("up")){
            getWorld().removeObject(this);
            MyWorld.player2--;
            d.play();
            d.setVolume(100);
            z = true;
            if(z == true){
                MyWorld.player2=MyWorld.player2;
            }
        }
        count++;
        if(count>=200){
        getWorld().removeObject(this);
        }
       
    }
}
