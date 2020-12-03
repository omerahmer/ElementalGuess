import greenfoot.*;  

/**
 * This is responsible for creating the world that the game takes place on.
 * 
 * @author Eshan Bathula, Omer Ahmer, Anish Shivamurthy
 * @date 12/2/2020
 */
public class ChemWorld extends World
{
    
    private static DamageCounter theDamageCounter;
    
    public ChemWorld()
    {    
        // Creates the world
        super(600, 600, 1); 
        addObject(new ElementalGroup(), 305, 550); //this makes the elemental group appear
        theDamageCounter = new DamageCounter();
        addObject(theDamageCounter, 300, 50);

    }
    public static DamageCounter getDamageCounter(){
        return theDamageCounter;
    }
    public void act()
    {
        String[] images = {"Lithium.PNG", //metals start
                                   "Beryllium.PNG",
                                   "Sodium.PNG",
                                   "Magnesium.PNG",
                                   "Potassium.PNG",
                                   "Calcium.PNG",
                                   "Rubidium.PNG",
                                   "Strontium.PNG",
                                   "Caesium.PNG",
                                   "Barium.PNG", //metals end
                                   "Francium.PNG",//metalloids start
                                   "Radium.PNG",
                                   "Boron.PNG",
                                   "Silicon.PNG",
                                   "Germanium.PNG",
                                   "Arsenic.PNG",
                                   "Antimony.PNG",
                                   "Tellurium.PNG",//metalloids end
                                   "Astatine.PNG",//nonmetals
                                   "hydrogen.PNG",
                                   "Carbon.PNG",
                                   "Nitrogen.PNG",
                                   "Oxygen.PNG",
                                   "Phosphorus.PNG",
                                   "Sulfur.PNG",
                                   "Chlorine.PNG",
                                   "Selenium.PNG",
                                   "Iodine.PNG",//nonmetals
                                };
                               
        if(Greenfoot.getRandomNumber(50) < 2) //makes it so elements/obstacles randomly spawn
        {        
            addObject(new Elements(images[Greenfoot.getRandomNumber(27)]), Greenfoot.getRandomNumber(200) + 200, 0); //makes sure the elements spawn and stay on the screen  
        }
        
        
    }
    
}
