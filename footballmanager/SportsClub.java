/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager; // Collection of Java classes

/**
 *
 * @author User
 */
public abstract class SportsClub // Functions as a base for subclasses
{
    // USE OF ENCAPSULATION - Declared class variables as private
    
    private String name; // Only accessible in the desired class
    private String location; // Only accessible in the desired class
    private String statistics; // Only accessible in the desired class
    
    // USE OF OVERRIDE
    //  USE OF POLYMORPHISM - METHOD OVERRIDING; 
    // TO PRESENT THE SAME INTERFACE FOR UNDERLYING FORMS
    
    @Override 
    public boolean equals(Object o)
    {
        return this.name.equals(((SportsClub)o).name);
    }
    
    public String getName() // Prompts the user to enter the name of the SportsClub
    {
        return name; // // 'return' is used to go back to the main address
    }
    
    public String getLocation() // Prompts the user to enter the name of the SportsClub
    {
        return location; // 'return' is used to go back to the main address
    }
    
    public String getStatistics() // Prompts the user to enter the name of the SportsClub
    {
        return statistics; // 'return' is used to go back to the main address
    }
    
    public void setName (String s) // Anyone can access and no values need to be returned
    {
        this.name = s; // 'this' keyword is used to eliminate the confusion between class atttributes and parameters with the same name
    }
    
    public void setLocation (String s) // Anyone can access and no values need to be returned
    {
        this.location = s; // 'this' keyword is used to eliminate the confusion between class atttributes and parameters with the same name
    }
    
    public void setStatistics (String s) // Anyone can access and no values need to be returned
    {
        this.statistics = s; // 'this' keyword is used to eliminate the confusion between class atttributes and parameters with the same name
    }
    
}


