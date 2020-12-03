import greenfoot.*;  

/**
 * This checks if the player elemental group is hitting anything and is also responsible for making the player move the elemental group however they want
 * it will also keep up with the damage done to the elemental group.
 * @author Eshan Bathula, Omer Ahmer, Anish Shivamurthy
 * @date 12/2/2020
 */

public class ElementalGroup extends Actor
{
    
    public int damage;
    
    public ElementalGroup()  //makes the elemental group spawn with 0 damage
      {
         String group = ElementalGroup.randGroup();
         setImage(new GreenfootImage(group, 20, Color.WHITE, Color.BLACK));
 
         damage = 0;
      }
 
    public static String randGroup()
    {
        String group = "";
        int num = Greenfoot.getRandomNumber(4);
        if(num == 1)
        {
            group = "metals";
        }
        else if(num == 2)
        {
            group = "metalloids";
        }
        else if(num == 3)
        {
            group = "nonmetals";
        }
        return group;
    }  
    public void act() // main part of the group that keeps running.
    {
        checkKeyPress();
        checkCollision();

    }  
   
    public void checkCollision() // makes the player take damage when they hit an obstacle element
    {
        Actor actor = getOneIntersectingObject(Elements.class);
        if (actor != null)
        {
            damage++;
            DamageCounter counter = ChemWorld.getDamageCounter();
            counter.bumpCount(1);
            getWorld().removeObject(actor);
        }
        if (damage >= 100)
        {
            Greenfoot.stop();
        }
               
    }
    
    public void moveLeft() // allows elemental group to go to the left but also makes it stay on the road
    {  
        setLocation(getX() - 2, getY());   
    }
    
    public void moveRight()  // allows elemental group to go to the right but also makes it stay on the road
    {
        setLocation(getX() + 2, getY());   
    }
    
    public void moveUp()  // makes elemental group go up screen
    {
        setLocation(getX(), getY() - 2);
    }
    public void moveDown() // makes elemental group go down screen
    {
        setLocation(getX(), getY() + 2);
    }
    
    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left")) // move elemental group left
        {
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right")) // move elemental group right
        {
            moveRight();
        }
        if(Greenfoot.isKeyDown("up")) // Move elemental group up
        {
            moveUp();
        }
        if(Greenfoot.isKeyDown("down")) // Move elemental group down
        {     
            moveDown();
        }
      
    }   
    
}
