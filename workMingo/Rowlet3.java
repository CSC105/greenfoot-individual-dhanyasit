import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rowlet3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rowlet3 extends Actor
{
    GreenfootSound o = new GreenfootSound("yoro.mp3");
    private int count;
    GreenfootSound v =  new GreenfootSound("disgrace.wav");
    boolean c,d = true;
    public void act() 
    {
        delete();
    } 

    public Rowlet3(){
        GreenfootImage img = getImage();
        img.scale(450,300);
        setImage(img);

    }

    public void delete(){
        if((Greenfoot.isKeyDown("w"))){
            getWorld().removeObject(this);
            o.play();
            o.setVolume(80);
            MyWorld.player1++;
        }else if(Greenfoot.isKeyDown("a")||Greenfoot.isKeyDown("d")){
            getWorld().removeObject(this);
            MyWorld.player1--;
            v.play();
            v.setVolume(100);
            c = true;
            if(c== true){
                MyWorld.player1=MyWorld.player1;
            }
        }
        else if((Greenfoot.isKeyDown("up"))){
            o.play();
            o.setVolume(80);
            getWorld().removeObject(this);
            MyWorld.player2++;
        }
        else if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("right")){
            getWorld().removeObject(this);
            MyWorld.player2--;
            v.play();
            v.setVolume(100);
            d = true;
            if(d == true){
                MyWorld.player2=MyWorld.player2;
            }
            
        }
        count++;
            if(count>=200){
                getWorld().removeObject(this);
            }

    }
}

