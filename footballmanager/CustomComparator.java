/*
 * Here we are using the Comparator Interface used to sort and order collection 
or arrays.
* Can be used to pass the sorting algorithm as a function parameter
* Intefaces share behaviour.
 */
package footballmanager;

import java.util.Comparator; // Importing a Java Utility.


public class CustomComparator implements Comparator<FootballClub> { // Here we have created a class which implements Comparator<Type>
/* 
    Below, we are implementing the Compare method.
    Comparing based on two football teams and whichever is less will be placed lower
    USE OF POLYMORPHISM - METHOD OVERRIDING; 
    TO PRESENT THE SAME INTERFACE FOR UNDERLYING FORMS
    */
    @Override
    public int compare(FootballClub t, FootballClub t1) {
        if (t.getPoints() > t1.getPoints()) {
            return -1;
        } else if (t.getPoints() < t1.getPoints()) {
            return 1;
        } else {
            int goalDif = t.getScoredGoalsCount() - t.getReceivedGoalsCount(); // APPLICATION OF ARITHMETIC OPERATORS
            int goalDif1 = t1.getScoredGoalsCount() - t1.getReceivedGoalsCount(); // APPLICATION OF ARITHMETIC OPERATORS
            if (goalDif > goalDif1) {
                return -1;
            } else if (goalDif < goalDif1) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}
