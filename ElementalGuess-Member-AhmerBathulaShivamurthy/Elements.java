
import greenfoot.*;  

/**
 * This code is meant to make elements randomly spawn as obstacles for the player
 * If player racks up enough damage, they lose
 * @author Eshan Bathula, Omer Ahmer, Anish Shivamurthy
 * @date 12/2/2020
 */
public class Elements extends Actor 
{
    GreenfootImage image= null;
    
    public Elements(String imgName){
         image=new GreenfootImage(imgName);
    }
    public void act() //this function is responsible for checking for collisions, making elements go down, and despawning elements when they are off screen
    {
        int i;
        checkCollision();
        fallDown();
        bottom();
        setImage(image);
         
        
    } 
    
    public void fallDown() // this makes elements go down 3 units
    {
        setLocation(getX(), getY() + 3);
    }
    
    public void checkCollision() // this ensures that the elements don't spawn on each other by checking for any collisions
    {
        Actor element = getOneIntersectingObject(Elements.class);
        if(element != null)
        {
            getWorld().removeObject(element); 
        }
        
     }
     
     
     
    public void bottom() // this despawns the truck when it goes off screen
    {
        if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject(this);
            
        }
        
    }
}
