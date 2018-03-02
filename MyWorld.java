import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int player1 = 0;
    public static int player2 = 0;
    public static int winner1 = 0;
    public static int winner2 = 0;
    private int count;
    private int naruto;
    private int naruto1;
    private int naruto2;
    int timer = 240;
    int ex = 440;
    GreenfootSound ora =  new GreenfootSound("ora.mp3");
    GreenfootSound pixel =  new GreenfootSound("pixel.mp3");
    GreenfootSound rave = new GreenfootSound("Rave.mp3");

    public void ShowText(){
        showText("Score : "+player1,50,50);
        showText("Score : "+player2,750,50);

    }

    public MyWorld()
    {    
        super(800,600,1);
        count = 0;
        player1 = 0;
        player2 = 0;
        naruto = 0;
        naruto1 =0;
        naruto2 =0;
        ex = 440;
        timer = 240;
        prepare();
        setPaintOrder(Player1.class,Player2.class,Rowlet1.class,Rowlet2.class,Rowlet3.class,sasuke2.class,sasuke1.class,konoha.class);
    }

    private void prepare()
    {
        Mingo mingo = new Mingo();
        addObject(mingo,168,297);
        mingo.setLocation(250, 500);
        mingo.setLocation(250, 500);

        Mingy mingy = new Mingy();
        addObject(mingy,679,362);
        mingy.setLocation(528,503);

        down down = new down();
        addObject(down,155,160);
        down.setLocation(370,210);
        narutu narutu = new narutu();
        addObject(narutu,506,365);
        narutu.setLocation(529,183);
    }

    public void Sound(){
        if(pixel.isPlaying()== false){

            pixel.setVolume(50);
            pixel.playLoop();
            //rave.setVolume(50);
            //rave.playLoop();

        }
        if(player1>=5||player2>=5){

            pixel.stop();
            //rave.stop();
        }
    }

    public void act(){
        Sound();
        tu();
        tu1();
        tu2();

        if(player1<=-2){
            player1 = -2;
        }
        if(player2<=-2){
            player2=-2;
        }
        if(count == 0)
        {
            reveal();
            ShowText();
            Winner();
            Extra();

        }
    }

    public void reveal(){
        timer--;
        int Num = Greenfoot.getRandomNumber(6)%3;

        if(timer==0){
            timer = 240;
            if(Num == 1 ){
                addObject(new Rowlet1(),400,150);
            }
            if(Num == 2){
                addObject(new Rowlet2(),400,150);
            }
            if(Num == 0){
                addObject(new Rowlet3(),400,150);
            }

        }
    }

    public void Winner(){
        if(player1>=5 && count==0){
            count++;
            addObject(new Player1(),400,200);
            addObject(new Re(),300,450);
            addObject(new back(),500,450);
            ora.play();

        }
        else if(player2>=5 && count == 0){
            count++;
            addObject(new Player2(),400,200);
            addObject(new Re(),300,450);
            addObject(new back(),500,450);
            ora.play();

        }
    }

    public void Extra(){
        int k = Greenfoot.getRandomNumber(300)%2;
        ex--;
        if(ex==0){
            ex = 440;
            if(k == 0){

                addObject(new richard(),400,500);
            }
            if(k == 1){

                addObject(new ring(),400,500);

            }
        }

    }

    public void tu(){
        naruto++;
        if(naruto == 400){
            
            addObject(new konoha(),459,165);
        }
    }

    public void tu1(){
        naruto1++;
        if(naruto1 == 500){
            
            addObject(new sasuke1(),430,170);
        }
    }

    public void tu2(){
        naruto2++;
        if(naruto2 == 620){
            
            addObject(new sasuke2(),430,170);
        }
    }
}

