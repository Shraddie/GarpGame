import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garp here.
 * 
 * @author Shradhand Harkisoen 
 * @version (12-11-2015)
 */
public class Garp extends Actor
{
    private GreenfootImage imageLeft = new GreenfootImage("GarpLeft.png");
    private GreenfootImage imageRight = new GreenfootImage("GarpRight.png");
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")) {
            setImage(imageRight);
            setRotation(0);
            move(5);
        }
        
        if(Greenfoot.isKeyDown("left")) {
            setImage(imageLeft);
            setRotation(0);
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("down")) {
             setRotation(90);
            move(5);
        }
        
        if(Greenfoot.isKeyDown("up")) {
           
            setRotation(270);
            move(5);
        }
    }    
}

