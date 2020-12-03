import greenfoot.*;  

/**
 * This shows the player how much damage they have taken
 * 
 * @author Eshan Bathula, Omer Ahmer, Anish Shivamurthy
 * @date 12/2/2020
 */
public class DamageCounter extends Actor
{
    private int totalDamage = 0;
    
    public DamageCounter()
    {
        setImage(new GreenfootImage("", 20, Color.WHITE, Color.BLACK));
    }
      
    public void bumpCount(int damageAmount)
    {
        totalDamage += damageAmount;
        setImage(new GreenfootImage("" + "", 20, Color.WHITE, Color.BLACK));
        if(totalDamage == 15){
           setImage(new GreenfootImage("BETTER GET BACK TO STUDYING!", 40, Color.RED, Color.BLACK));
           Greenfoot.stop();
        }
    }
   
}
