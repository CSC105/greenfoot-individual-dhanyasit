import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mingy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mingy extends Actor
{
    
    public int frame = 1;
    private GreenfootImage[] fla = new GreenfootImage[37];
    private GreenfootSound ah = new GreenfootSound("ah.mp3");
    public Mingy(){
        GreenfootImage image = getImage();
        image.scale(80, 150);
        image.mirrorHorizontally();
        setImage(image);
        

    }

    public void act() { 
        move(0);
        movement();
        animateF();

    }

    protected void addedToWorld(World world) {
        for (int i = 1; i <= 36; i++) {
            fla[i] = new GreenfootImage("Flamingo" + i + ".png");
            fla[i].scale(80, 150);
            fla[i].mirrorHorizontally();
        }
    }

    public void animateF() {
        GreenfootImage image = getImage();
      setImage(fla[frame]);
        if (frame == 36 ) {
            frame = 1;
            return;
        }
        frame++;
    }

    public void movement(){
        /*if(Rowlet1.class == null){
        if(Rowlet2.class == null){
        if(Rowlet3.class == null){*/
        if(Greenfoot.isKeyDown("up")){

            setLocation(550,400);
        }else if(Greenfoot.isKeyDown("right")){

            move(3);
        }else if(Greenfoot.isKeyDown("left")){

            move(-3);
        }else if(Greenfoot.isKeyDown("down")){
            ah.setVolume(30);
            ah.play();
        }
        else{
            setLocation(550,500); 
        }
    }
}
