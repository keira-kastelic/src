import java.util.*;

public class YahtzeeDie {
	/* TODO: set instance data as follows:
	   your instance data should include a Random number generator named r, an int named value
	   that stores the current value of the die, and a boolean named isFrozen which is true
	   if die is frozen, and false if not. */

    private Random r; // creating a random object
    private int value; // creating a value variable
    private boolean isFrozen; // creating a frozen boolean

    /* TODO: initialize your instance data appropriately.
       Initialize "r", set "value" to 0, and set "isFrozen" to false. */
    public YahtzeeDie()
    {
        this.r = new Random(); // establishing the variable is a random object
        this.value = 0; //seting value to 0
        this.isFrozen = false; // setting the isFrozen boolean to false
    }

    /* TODO: set a new value for the die using the Random object. */
    public void rollDie() { this.value = r.nextInt(6) + 1;} // creating a method to pick a random number between one and 6

    /* TODO: return the current die value. */
    public int getValue()
    {
        return this.value;
    } // creating a method to return the variable value

    /* TODO: set the value of isFrozen to true. */
    public void freezeDie() {isFrozen = true;} // setting the freezeDie method to be frozen based on the isFrozen boolean

    /* TODO: set the value of isFrozen to false. */
    public void unfreezeDie()
    {
        isFrozen = false;
    } // setting unfreezeDie to be true in the isFrozen method
    // your code here
    /* TODO: return true if die is frozen, false if it is unfrozen. */
    public boolean isFrozen() { // creating an isFrozen method to check if the Die is is frozen
        if (isFrozen) { // creating an is statement to return true if it is frozen or false otherwise
            return true;
        } else {
            return false;
        }
    }
}