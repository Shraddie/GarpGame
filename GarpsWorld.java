import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GarpsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GarpsWorld extends World
{

    /**
     * Constructor for objects of class GarpsWorld.
     * 
     */
    public GarpsWorld()
    {    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        populateTheWorld();
        
    }
       protected void populateTheWorld() 

{

addObject(new Garp(), 350, 250);

addObject(new Gnomus(), Greenfoot.getRandomNumber(670) + 15, 

Greenfoot.getRandomNumber(470) + 15);

        }
    }


