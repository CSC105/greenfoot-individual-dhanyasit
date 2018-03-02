import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teachcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teachcon extends World
{

    /**
     * Constructor for objects of class Teachcon.
     * 
     */
    public Teachcon()
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
        hey hey = new hey();
        addObject(hey,695,374);
        hey.setLocation(472,347);
        ring ring = new ring();
        addObject(ring,50,475);
        ring.setLocation(70,522);
        back back = new back();
        addObject(back,711,49);
        back.setLocation(710,74);
        richard richard = new richard();
        addObject(richard,52,441);
        richard.setLocation(70,422);
        RowU rowu = new RowU();
        addObject(rowu,229,304);
        rowu.setLocation(67,219);
        hey.setLocation(471,347);
        rowu.setLocation(72,223);
        Rowr rowr = new Rowr();
        addObject(rowr,133,195);
        rowr.setLocation(78,118);
        rowu.setLocation(67,222);
        hey.setLocation(474,347);
        rowu.setLocation(72,222);
        Rowl rowl = new Rowl();
        addObject(rowl,163,369);
        rowl.setLocation(69,325);
        hey.setLocation(475,349);
        richard.setLocation(69,432);
        ring.setLocation(66,535);
        How how = new How();
        addObject(how,276,139);
        how.setLocation(413,39);
        rings rings = new rings();
        addObject(rings,185,522);
        rings.setLocation(73,533);
        removeObject(ring);
    }
}
