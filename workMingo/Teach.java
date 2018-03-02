import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teach extends World
{

    /**
     * Constructor for objects of class Teach.
     * 
     */
    public Teach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rowr rowr = new Rowr();
        addObject(rowr,153,253);
        rowr.setLocation(125,274);
        RowU rowu = new RowU();
        addObject(rowu,257,392);
        rowu.setLocation(124,473);
        rowr.setLocation(123,327);
        rowr.setLocation(127,327);
        Rowl rowl = new Rowl();
        addObject(rowl,104,161);
        rowl.setLocation(126,189);
        rowu.setLocation(124,464);
        How how = new How();
        addObject(how,439,71);
        how.setLocation(409,70);
        rowu.setLocation(115,506);
        rowr.setLocation(121,363);
        rowl.setLocation(126,214);
        rowl.setLocation(123,214);
        rowu.setLocation(93,515);
        rowr.setLocation(93,398);
        rowl.setLocation(95,283);
        hey hey = new hey();
        addObject(hey,526,406);
        hey.setLocation(478,405);
        how.setLocation(177,81);
        speed speed = new speed();
        addObject(speed,458,166);
        speed.setLocation(527,166);
        how.setLocation(164,36);
        speed.setLocation(446,166);
        how.setLocation(408,43);
        back back = new back();
        addObject(back,275,70);
        back.setLocation(111,72);
        speed.setLocation(428,239);
        removeObject(hey);
        removeObject(rowr);
        removeObject(rowu);
        removeObject(rowl);
        speed.setLocation(405,275);
        back.setLocation(131,97);
        how.setLocation(448,89);
        Rowl rowl2 = new Rowl();
        addObject(rowl2,519,339);
        rowl2.setLocation(111,447);
        Rowlet2 rowlet2 = new Rowlet2();
        addObject(rowlet2,566,436);
        rowlet2.setLocation(369,445);
        removeObject(rowlet2);
        speed.setLocation(409,276);
        rowl2.setLocation(108,395);
        RowU rowu2 = new RowU();
        addObject(rowu2,408,450);
        rowu2.setLocation(281,399);
        rowl2.setLocation(447,396);
        Rowr rowr2 = new Rowr();
        addObject(rowr2,354,443);
        rowr2.setLocation(108,398);
        ring ring = new ring();
        addObject(ring,786,346);
        ring.setLocation(735,396);
        richard richard = new richard();
        addObject(richard,791,479);
        richard.setLocation(611,408);
        ring.setLocation(724,407);
        richard.setLocation(601,405);
        next next = new next();
        addObject(next,542,447);
        
        back.setLocation(125,87);
        how.setLocation(424,91);
        next.setLocation(716,516);
        removeObject(ring);
        rings rings = new rings();
        addObject(rings,741,387);
        rings.setLocation(706,405);
    }
}
