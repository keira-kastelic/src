public class YahtzeeScorecard {
    private int ones = -1;
    private int twos = -1;
    private int threes = -1;
    private int fours = -1;
    private int fives = -1;
    private int sixes = -1;
    private int threeKind = -1;
    private int fourKind = -1;
    private int chance = -1;
    private int fullHouse = -1;
    private int smStraight = -1;
    private int lgStraight = -1;
    private int yahtzee = -1;
    private boolean bonus = false;

    public YahtzeeScorecard() {
    }


    /* markOnes TODO:
        1. If the instance variable "ones" is not equal to -1 (meaning the score has already been updated) then
           return false.
        2. Otherwise:
            a. Count the number of ones. The arguments "var1" through "var5" represent the values of the 5 dice,
               so you will want to use these to figure out the number of ones.
            b. Update the instance variable "ones" based on the number of ones you counted.
            c. Return true.
     */
    public boolean markOnes(int var1, int var2, int var3, int var4, int var5) { // creating a boolean for if the roll will mark ones
        if (ones != -1) { // creating an if statement to check is the ones have been updated or not
            return false; // return false if it has already been marked
        } else {
            ones = 0; // setting the ones variable to 0 to acount for the adding to the -1 value
            if (var1 == 1) // checking to see if the variable is equal to one
                ones++; // adding one to the ones variable if the value is one to update the variable
            if (var2 == 1) // checking to see if the variable is equal to one
                ones++; // adding one to the ones variable if the value is one to update the variable
            if (var3 == 1) // checking to see if the variable is equal to one
                ones++; // adding one to the ones variable if the value is one to update the variable
            if (var4 == 1) // checking to see if the variable is equal to one
                ones++; // adding one to the ones variable if the value is one to update the variable
            if (var5 == 1) // checking to see if the variable is equal to one
                ones++; // adding one to the ones variable if the value is one to update the variable
            return true; // returning true to update the variable for the scorecard
        }
    }

    // TODO: markTwos should be the same as markOnes, but with the appropriate variables/values.
    public boolean markTwos(int var1, int var2, int var3, int var4, int var5) { // creating a boolean for if the roll will mark twos
        if (twos != -1) { // creating an if statement to check is the twos have been updated or not
            return false; // return false if it has already been marked
        } else {
            twos = 0; // setting the twos variable to 0 to acount for the adding to the -1 value
            if (var1 == 2) // checking to see if the variable is equal to two
                twos = twos + 2; // adding two to the twos variable if the value is two to update the variable
            if (var2 == 2) // checking to see if the variable is equal to two
                twos = twos + 2; // adding two to the twos variable if the value is two to update the variable
            if (var3 == 2) // checking to see if the variable is equal to two
                twos = twos + 2; // adding two to the twos variable if the value is two to update the variable
            if (var4 == 2) // checking to see if the variable is equal to two
                twos = twos + 2; // adding two to the twos variable if the value is two to update the variable
            if (var5 == 2) // checking to see if the variable is equal to two
                twos = twos + 2; // adding two to the twos variable if the value is two to update the variable
            return true; // returning true to update the variable for the scorecard
        }
    }

    // TODO: markThrees should be the same as markOnes, but with the appropriate variables/values.
    public boolean markThrees(int var1, int var2, int var3, int var4, int var5) { // creating a boolean for if the roll will mark threes

        if (threes != -1) { // creating an if statement to check is the threes have been updated or not
            return false; // return false if it has already been marked
        } else {
            threes = 0; // setting the threes variable to 0 to acount for the adding to the -1 value
            if (var1 == 3) // checking to see if the variable is equal to three
                threes = threes + 3; // adding three to the threes variable if the value is three to update the variable
            if (var2 == 3) // checking to see if the variable is equal to three
                threes = threes + 3; // adding three to the threes variable if the value is three to update the variable
            if (var3 == 3) // checking to see if the variable is equal to three
                threes = threes + 3; // adding three to the threes variable if the value is three to update the variable
            if (var4 == 3) // checking to see if the variable is equal to three
                threes = threes + 3; // adding three to the threes variable if the value is three to update the variable
            if (var5 == 3) // checking to see if the variable is equal to three
                threes = threes + 3; // adding three to the threes variable if the value is three to update the variable
            return true; // returning true to update the variable for the scorecard
        }
    }

    // TODO: markFours should be the same as markOnes, but with the appropriate variables/values.
    public boolean markFours(int var1, int var2, int var3, int var4, int var5) { // creating a boolean for if the roll will mark fours
        if (fours != -1) { // creating an if statement to check is the fours have been updated or not
            return false; // return false if it has already been marked
        } else {
            fours = 0; // setting the fours variable to 0 to acount for the adding to the -1 value
            if (var1 == 4) // checking to see if the variable is equal to four
                fours = fours + 4; // adding four to the fours variable if the value is four to update the variable
            if (var2 == 4) // checking to see if the variable is equal to four
                fours = fours + 4; // adding four to the fours variable if the value is four to update the variable
            if (var3 == 4) // checking to see if the variable is equal to four
                fours = fours + 4; // adding four to the fours variable if the value is four to update the variable
            if (var4 == 4) // checking to see if the variable is equal to four
                fours = fours + 4; // adding four to the fours variable if the value is four to update the variable
            if (var5 == 4) // checking to see if the variable is equal to four
                fours = fours + 4; // adding four to the fours variable if the value is four to update the variable
            return true; // returning true to update the variable for the scorecard
        }
    }

    // TODO: markFives should be the same as markOnes, but with the appropriate variables/values.
    public boolean markFives(int var1, int var2, int var3, int var4, int var5) { // creating a boolean for if the roll will mark fives

        if (fives != -1) { // creating an if statement to check is the fives have been updated or not
            return false; // return false if it has already been marked
        } else { // setting the fives variable to 0 to acount for the adding to the -1 value
            fives = 0;
            if (var1 == 5) // checking to see if the variable is equal to five
                fives = fives + 5; // adding five to the fives variable if the value is five to update the variable
            if (var2 == 5) // checking to see if the variable is equal to five
                fives = fives + 5; // adding five to the fives variable if the value is five to update the variable
            if (var3 == 5) // checking to see if the variable is equal to five
                fives = fives + 5; // adding five to the fives variable if the value is five to update the variable
            if (var4 == 5) // checking to see if the variable is equal to five
                fives = fives + 5; // adding five to the fives variable if the value is five to update the variable
            if (var5 == 5) // checking to see if the variable is equal to five
                fives = fives + 5; // adding five to the fives variable if the value is five to update the variable
            return true; // returning true to update the variable for the scorecard
        }
    }

    // TODO: markSixes should be the same as markOnes, but with the appropriate variables/values.
    public boolean markSixes(int var1, int var2, int var3, int var4, int var5) { // creating a boolean for if the roll will mark sixes

        if (sixes != -1) { // creating an if statement to check is the sixes have been updated or not
            return false; // return false if it has already been marked
        } else {
            sixes = 0; // setting the sixes variable to 0 to acount for the adding to the -1 value
            if (var1 == 6) // checking to see if the variable is equal to six
                sixes = sixes + 6; // adding six to the sixes variable if the value is six to update the variable
            if (var2 == 6) // checking to see if the variable is equal to six
                sixes = sixes + 6; // adding six to the sixes variable if the value is six to update the variable
            if (var3 == 6) // checking to see if the variable is equal to six
                sixes = sixes + 6; // adding six to the sixes variable if the value is six to update the variable
            if (var4 == 6) // checking to see if the variable is equal to six
                sixes = sixes + 6; // adding six to the sixes variable if the value is six to update the variable
            if (var5 == 6) // checking to see if the variable is equal to six
                sixes = sixes + 6; // adding six to the sixes variable if the value is six to update the variable
            return true; // returning true to update the variable for the scorecard
        }
    }

    /* markThreeOfAKind TODO:
        1. If the instance variable "threeKind" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has three of a kind (aka at least three dice with the same value).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have three of a kind, add up all the dice values and update the "threeKind" instance variable.
               If they do not have a three of a kind, set "threeKind" to 0.
            d. Return true.
     */
    public boolean markThreeOfAKind(int var1, int var2, int var3, int var4, int var5) { // creating a variable to see if there are three of one number in the roll
        if (threeKind != -1) // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        else {
            threeKind = 0; // setting the variable to 0 to acount for the adding to the -1 value
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
            int first = sorter.getFirst(); // reading in the first value
            int second = sorter.getSecond(); // reading in the second value
            int third = sorter.getThird(); // reading in the third value
            int fourth = sorter.getFourth(); // reading in the fourth value
            int fifth = sorter.getFifth(); // reading in the fifth value

            if(first == second && second == third) { // creating an if statement to check if the first three numbers are the same
                threeKind = first + second + third; // adding the values if they are and updating the method
            } else if (second == third && third == fourth){ // creating an else if statement to check if the second third and fourth number are the same
                threeKind = second + third + fourth; // adding the values if they are and updating the method
            } else if (third == fourth && fourth == fifth){ // creating an else if statement to check if the third fourth and fifth number are the same
                threeKind = third + fourth + fifth; // adding the values if they are and updating the method
            } else { // creating an else statement if there is not three of a kind
                threeKind = 0; // returning 0
            }
        } return true; // returning true to update the variable for the scorecard
    }

    /* markFourOfAKind TODO:
        1. If the instance variable "fourKind" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a four of a kind (aka at least four dice with the same value).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have four of a kind, add up all the dice values and update the "fourKind" instance variable.
               If they do not have a four of a kind, set "fourKind" to 0.
            d. Return true.
     */
    public boolean markFourOfAKind(int var1, int var2, int var3, int var4, int var5) { // creating a variable to see if there are four of one number in the roll
        if (fourKind != -1) // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        else {
            fourKind = 0; // setting the variable to 0 to acount for the adding to the -1 value
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
            int first = sorter.getFirst(); // reading in the first value
            int second = sorter.getSecond(); //  reading in the second value
            int third = sorter.getThird(); // reading in the third value
            int fourth = sorter.getFourth(); // reading in the fourth value
            int fifth = sorter.getFifth(); // reading in the fifth value

            if (first == second && second == third && third == fourth) { // creating an if statement to see if the first four numbers are the same
                fourKind = first + second + third + fourth; // adding the values if they are and updating the method
            } else if (second == third && third == fourth && fourth == fifth){ // creating an if statement to see if the last four numbers are the same
                fourKind = second + third + fourth + fifth; // adding the values if they are and updating the method
            } else { // creating an else statement if there are not four of a kind
                fourKind = 0; // returning 0
            }
        } return true; // returning true to update the variable for the scorecard
    }

    /* markFullHouse TODO:
        1. If the instance variable "fullHouse" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a Full House (aka three of the dice have the same value and the
               other two dice have the same value. Ex: 5   5   5   4   4, or 2   2   3   3   2, or 1   2   1   2   1).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have a Full House, update the "fullHouse" instance variable to be 25.
               If they do not have a Full House, set "fullHouse" to 0.
            d. Return true.
     */
    public boolean markFullHouse(int var1, int var2, int var3, int var4, int var5) {
        if (fullHouse != -1) // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        else {
            fullHouse = 0; // setting the variable to 0 to acount for the adding to the -1 value
                YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
                int first = sorter.getFirst(); // reading in the first value
                int second = sorter.getSecond(); // reading in the second value
                int third = sorter.getThird(); // reading in the third value
                int fourth = sorter.getFourth(); // reading in the fourth value
                int fifth = sorter.getFifth(); // reading in the fifth value
            if (first == second && second == third && fourth == fifth){ // creating an if statement to see if the first three are equal and the last two are equal
                fullHouse = first + second + third + fourth + fifth; // adding the values if they are and updating the method
            } else if (first == second && third == fourth && fourth == fifth){ // creating an if statement to see if the first two are equal and the last two are equal
                fullHouse = first + second + third + fourth + fifth; // adding the values if they are and updating the method
            } else { // creating an else statement if there is not a full house
                fullHouse = 0; // returning 0
            }
        } return true; // returning true to update the variable for the scorecard
    }

    /* markSmallStraight TODO:
        1. If the instance variable "smStraight" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a small straight (aka a sequence of 4 sequential numbers.
               Ex: 1   2   3   4   2 or 4   2   3   4   5 ).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have a small straight, update the "smStraight" instance variable to 30.
               If they do not have a small straight, set "smStraight" to 0.
            d. Return true.
     */
    public boolean markSmallStraight(int var1, int var2, int var3, int var4, int var5) {
        if (smStraight != -1) { // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
            int first = sorter.getFirst(); // reading in the first value
            int second = sorter.getSecond(); // reading in the second value
            int third = sorter.getThird(); // reading in the third value
            int fourth = sorter.getFourth(); // reading in the fourth value
            int fifth = sorter.getFifth(); // reading in the fifth value
            if (first+1 == second && second+1 == third && third+1 == fourth || second+1 == third && third+1 == fourth && fourth+1 == fifth || first+1 == third && third+1 == fourth && fourth+1 == fifth || first+1 == second && second+1 == fourth && fourth+1 == fifth){
               // ^^^ creating an if statement to check if either the first four values increase by one, the last four values increase by one, and creating two instances where there are two of the same number in the middle, but still have a small straight
                smStraight = 30; // returning 30 if there is a small straight
            } else { // creating an else statement if there is not a small straight
                smStraight = 0; // returning 0
            }
            return true; // returning true to update the variable for the scorecard
        }
    }

    /* markLargeStraight TODO:
        1. If the instance variable "lgStraight" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Determine whether the player actually has a large straight (aka a sequence of 5 sequential numbers.
               Ex: 1   2   3   4   5 or 2   3   4   5   6).
            b. In order to do this, you will want to create a new YahtzeeSortDice object using the arguments var1,
               var2, var3, var4, and var5. This will sort the values of the dice into numerical order (Ex: if you have
               5   2   3   1   1, it will sort it into 1   1   2   3   5). You can access the sorted numbers by
               using the methods getFirst(), getSecond(), getThird(), getFourth(), and getFifth() from the
               YahtzeeSortDice class.
            c. If they do have a large straight, update the "lgStraight" instance variable to 40.
               If they do not have a large straight, set "lgStraight" to 0.
            d. Return true.
     */
    public boolean markLargeStraight(int var1, int var2, int var3, int var4, int var5) {
        if (lgStraight != -1) { // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
            int first = sorter.getFirst(); // reading in the first value
            int second = sorter.getSecond(); // reading in the second value
            int third = sorter.getThird(); // reading in the third value
            int fourth = sorter.getFourth(); // reading in the fourth value
            int fifth = sorter.getFifth(); // reading in the fifth value

            if (first + 1 == second && second + 1 == third && third + 1 == fourth && fourth + 1 == fifth){ // creating an if statement to see if the values all increase by one
                lgStraight = 40; // returning 40 if there is a large straight
            } else { // creating an else statement if it is not a large straight
                lgStraight = 0; // returning 0
            }
        }
     return true ; // returning true to update the variable for the scorecard
    }

    /* markYahtzee TODO:
        1. If the instance variable "yahtzee" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Check if the player actually has a Yahtzee (aka all dice are the same value).
            c. If they do have a Yahtzee, update the "yahtzee" instance variable to 50.
               If they do not have a yahtzee, set "yahtzee" to 0.
            d. Return true.
     */
    public boolean markYahtzee(int var1, int var2, int var3, int var4, int var5) {

        if (yahtzee != -1){ // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
            int first = sorter.getFirst(); // reading in the first value
            int second = sorter.getSecond(); // reading in the second value
            int third = sorter.getThird(); // reading in the third value
            int fourth = sorter.getFourth(); // reading in the fourth value
            int fifth = sorter.getFifth(); // reading in the fifth value

            if (first == second && second == third && third == fourth && fourth == fifth){ // creating an if statement to see if all the numbers are the same
                yahtzee = 50; // returning 50 if there is a yahtzee
            } else { // creating an if statement is there is not a yahtzee
                yahtzee = 0; // returning 0
            }
        }
        return true; // returning true to update the variable for the scorecard
    }

    /* markChance TODO:
        1. If the instance variable "chance" is not equal to -1 (meaning the score has already been updated),
           then return false.
        2. Otherwise:
            a. Add up all the dice values and update the "chance" instance variable to that sum.
            b. Return true.
     */
    public boolean markChance(int var1, int var2, int var3, int var4, int var5) {
        if (chance != -1){ // seeing if the score has not already been marked
            return false; // return false if it has already been marked
        } else {
            YahtzeeSortDice sorter = new YahtzeeSortDice(var1, var2, var3, var4, var5); // creating a sorter object to sort the dice in numerical order
            int first = sorter.getFirst(); // reading in the first value
            int second = sorter.getSecond(); // reading in the second value
            int third = sorter.getThird(); // reading in the third value
            int fourth = sorter.getFourth(); // reading in the fourth value
            int fifth = sorter.getFifth(); // reading in the fifth value
            chance = first + second + third + fourth + fifth; // adding the values together
        }
        return true; // returning true to update the variable for the scorecard
    }

    /* getUpperTotal TODO:
    Add up the upper total (aka ones, twos, threes, fours, fives, and sixes) and return the sum. Make sure to only add
    the scores to the total if the score has been updated (aka they are not -1). If the score is 63 or more, remember
    to add a 35 point bonus!
    Make sure to only add the scores if they have been marked in the scorecard! Otherwise you will start off with
    an upper total of -7.
    */
    public int getUpperTotal() { // creating a method to return the total score for the upper total
        int sum = 0; // creating a sum variable to track the final number
            if (ones != -1) // seeing if the ones was marked
                sum = sum + ones; // adding the ones value to the sum
            if (twos != -1) // seeing if the twos was marked
                sum = sum + twos; // adding the twos value to the sum
            if (threes != -1) // seeing if the threes was marked
                sum = sum + threes; // adding the threes value to the sum
            if (fours != -1) // seeing if the fours were marked
                sum = sum + fours; // adding the fours value to the sum
            if (fives != -1) // seeing if the fives were marked
                sum = sum + fives; // adding the fives value to the sum
            if (sixes != -1) // seeing if the sixes were marked
                sum = sum + sixes; // adding the sixes value to the sum
            if (sum >= 63) // seeing if the sum is greater than or equal to 63
                sum = sum + 35; // adding a 35 point bonus

            return sum; // returning the sum
    }
    /* getLowerTotal TODO:
        Add up the lower total (aka threeKind, fourKind, fullHouse, smStraight, lgStraight, yahtzee, and chance) and
        return the sum. Remember that we are not including Yahtzee bonuses in this game
        (unless you are doing the extra credit).
        Make sure to only add the scores if they have been marked in the scorecard! Otherwise you will start off with
        a lower total of -7.
    */
    public int getLowerTotal() { // creating a method to return the total score for the lower total
        int sum = 0; // creating a sum variable to track the final number
        if (threeKind != -1) // seeing if three of a kind was marked
            sum = sum + threeKind; // adding the three of a kind value to the sum
        if(fourKind != -1) // seeing if the four of a kind was marked
            sum = sum + fourKind; // adding the four of a kind value to the sum
        if(fullHouse != -1) // seeing if the full house was marked
            sum = sum + fullHouse; // adding the full house value to the sum
        if(smStraight != -1) // seeing if the small straight was marked
            sum = sum + smStraight; // adding the small straight value to the sum
        if(lgStraight != -1) // seeing if the large straight was marked
            sum = sum + lgStraight; // adding the large straight value to the sum
        if(yahtzee != -1) // seeing if the yahtzee was marked
            sum = sum + yahtzee; // adding the value of yahtzee to the sum
        if(chance != -1) // seeing if chance was marked
            sum = sum + chance; // adding the chance value to the sum

        return sum; // returning the sum
    }

    /* getGrandTotal TODO:
        Add up the upper and lower totals and return the sum.
    */
    public int getGrandTotal() { // creating a method to get the total amount of points earned
        int sum = getLowerTotal() + getUpperTotal(); // adding the lower and upper totals
        return sum; // returning the sum
    }

    /* This method is already completed - do not edit!
        It will print out a Yahtzee "Score Card" that shows all of the options and any scores that are filled in.
    */
    public void printScoreCard() {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("*      Yahtzee Score Card       *");
        System.out.println("*                               *");
        System.out.print("*  Ones:\t\t\t");
        if (this.ones == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.ones);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Twos:\t\t\t");
        if (this.twos == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.twos);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Threes:\t\t\t");
        if (this.threes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threes);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Fours:\t\t\t");
        if (this.fours == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fours);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Fives:\t\t\t");
        if (this.fives == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fives);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Sixes:\t\t\t");
        if (this.sixes == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.sixes);
        }

        System.out.println("\t\t\t*");
        System.out.println("*\t\t\t\t\t\t\t\t*");
        System.out.print("*  Upper Bonus:\t\t");
        if (this.bonus) {
            System.out.print("35");
        } else {
            System.out.print("0");
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Upper Total:\t\t");
        System.out.print(this.getUpperTotal());
        System.out.println("\t\t\t*");
        System.out.println("*                               *");
        System.out.print("*  3 of Kind:\t\t");
        if (this.threeKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.threeKind);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  4 of Kind:\t\t");
        if (this.fourKind == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fourKind);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Full House:\t\t");
        if (this.fullHouse == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.fullHouse);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Sm Straight:\t\t");
        if (this.smStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.smStraight);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Lg Straight:\t\t");
        if (this.lgStraight == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.lgStraight);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Yahtzee:\t\t\t");
        if (this.yahtzee == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.yahtzee);
        }

        System.out.println("\t\t\t*");
        System.out.print("*  Chance:\t\t\t");
        if (this.chance == -1) {
            System.out.print("__");
        } else {
            System.out.print(this.chance);
        }

        System.out.println("\t\t\t*");
        System.out.println("*                               *");
        System.out.print("*  Lower Total:\t\t");
        System.out.print(this.getLowerTotal());
        System.out.println("\t\t\t*");
        System.out.println("*                               *");
        System.out.print("*  Grand Total:\t\t");
        System.out.print(this.getGrandTotal());
        System.out.println("\t\t\t*");
        System.out.println("*********************************");
        System.out.println();
    }

    public void Checker() {
        ones = -1;
        twos = -1;
        threes = -1;
        fours = -1;
        fives = -1;
        sixes = -1;
        threeKind = -1;
        fourKind = -1;
        chance = -1;
        fullHouse = -1;
        smStraight = -1;
        lgStraight = -1;
        yahtzee = -1;

        int onesCount = 0;
        markOnes(2, 4, 4, 2, 2);
        if (ones == 0) onesCount++;
        else System.out.println("2, 4, 4, 2, 2 should give 0 points in the ones category");
        ones = -1;
        markOnes(5, 5, 5, 5, 1);
        if (ones == 1) onesCount++;
        else System.out.println("5, 5, 5, 5, 1 should give 1 point in the ones category");
        ones = -1;
        markOnes(6, 1, 6, 6, 1);
        if (ones == 2) onesCount++;
        else System.out.println("6, 1, 6, 6, 1 should give 2 points in the ones category");
        ones = -1;
        markOnes(1, 5, 1, 5, 1);
        if (ones == 3) onesCount++;
        else System.out.println("1, 5, 1, 5, 1 should give 3 points in the ones category");
        ones = -1;
        markOnes(1, 2, 1, 1, 1);
        if (ones == 4) onesCount++;
        else System.out.println("1, 2, 1, 1, 1 should give 4 points in the ones category");
        ones = -1;
        markOnes(1, 1, 1, 1, 1);
        if (ones == 5) onesCount++;
        else System.out.println("1, 1, 1, 1, 1 should give 5 points in the ones category");

        if (onesCount == 6) System.out.println("all ones cases worked :)");

        int twosCount = 0;
        markTwos(1, 4, 4, 3, 6);
        if (twos == 0) twosCount++;
        else System.out.println("1, 4, 4, 3, 6 should give 0 points in the twos category");
        twos = -1;
        markTwos(5, 2, 5, 5, 1);
        if (twos == 2) twosCount++;
        else System.out.println("5, 2, 5, 5, 1 should give 2 points in the twos category");
        twos = -1;
        markTwos(2, 1, 2, 6, 1);
        if (twos == 4) twosCount++;
        else System.out.println("2, 1, 2, 6, 1 should give 4 points in the twos category");
        twos = -1;
        markTwos(2, 5, 2, 5, 2);
        if (twos == 6) twosCount++;
        else System.out.println("2, 5, 2, 5, 2 should give 6 points in the twos category");
        twos = -1;
        markTwos(2, 2, 1, 2, 2);
        if (twos == 8) twosCount++;
        else System.out.println("2, 2, 1, 2, 2 should give 8 points in the twos category");
        twos = -1;
        markTwos(2, 2, 2, 2, 2);
        if (twos == 10) twosCount++;
        else System.out.println("2, 2, 2, 2, 2 should give 10 points in the twos category");

        if (twosCount == 6) System.out.println("all twos cases worked :)");

        int threesCount = 0;
        markThrees(1, 4, 4, 2, 6);
        if (threes == 0) threesCount++;
        else System.out.println("1, 4, 4, 2, 6 should give 0 points in the threes category");
        threes = -1;
        markThrees(5, 2, 5, 3, 1);
        if (threes == 3) threesCount++;
        else System.out.println("5, 2, 5, 3, 1 should give 3 points in the threes category");
        threes = -1;
        markThrees(3, 1, 2, 6, 3);
        if (threes == 6) threesCount++;
        else System.out.println("3, 1, 2, 6, 3 should give 6 points in the threes category");
        threes = -1;
        markThrees(3, 3, 2, 5, 3);
        if (threes == 9) threesCount++;
        else System.out.println("3, 3, 2, 5, 3 should give 9 points in the threes category");
        threes = -1;
        markThrees(3, 3, 1, 3, 3);
        if (threes == 12) threesCount++;
        else System.out.println("3, 3, 1, 3, 3 should give 12 points in the threes category");
        threes = -1;
        markThrees(3, 3, 3, 3, 3);
        if (threes == 15) threesCount++;
        else System.out.println("3, 3, 3, 3, 3 should give 15 points in the threes category");

        if (threesCount == 6) System.out.println("all threes cases worked :)");

        int foursCount = 0;
        markFours(1, 6, 3, 3, 6);
        if (fours == 0) foursCount++;
        else System.out.println("1, 6, 3, 3, 6 should give 0 points in the fours category");
        fours = -1;
        markFours(5, 2, 5, 4, 1);
        if (fours == 4) foursCount++;
        else System.out.println("5, 2, 5, 4, 1 should give 4 point in the fours category");
        fours = -1;
        markFours(4, 1, 4, 6, 1);
        if (fours == 8) foursCount++;
        else System.out.println("4, 1, 4, 6, 1 should give 8 points in the fours category");
        fours = -1;
        markFours(4, 5, 4, 5, 4);
        if (fours == 12) foursCount++;
        else System.out.println("4, 5, 4, 5, 4 should give 12 points in the fours category");
        fours = -1;
        markFours(4, 4, 1, 4, 4);
        if (fours == 16) foursCount++;
        else System.out.println("4, 4, 1, 4, 4 should give 16 points in the fours category");
        fours = -1;
        markFours(4, 4, 4, 4, 4);
        if (fours == 20) foursCount++;
        else System.out.println("4, 4, 4, 4, 4 should give 20 points in the fours category");

        if (foursCount == 6) System.out.println("all fours cases worked :)");

        int fivesCount = 0;
        markFives(1, 4, 4, 3, 6);
        if (fives == 0) fivesCount++;
        else System.out.println("1, 4, 4, 3, 6 should give 0 points in the fives category");
        fives = -1;
        markFives(2, 2, 5, 6, 1);
        if (fives == 5) fivesCount++;
        else System.out.println("2, 2, 5, 6, 1 should give 5 points in the fives category");
        fives = -1;
        markFives(5, 1, 2, 5, 1);
        if (fives == 10) fivesCount++;
        else System.out.println("5, 1, 2, 5, 1 should give 10 points in the fives category");
        fives = -1;
        markFives(2, 5, 5, 5, 2);
        if (fives == 15) fivesCount++;
        else System.out.println("2, 5, 5, 5, 2 should give 15 points in the fives category");
        fives = -1;
        markFives(5, 2, 5, 5, 5);
        if (fives == 20) fivesCount++;
        else System.out.println("5, 2, 5, 5, 5 should give 20 points in the fives category");
        fives = -1;
        markFives(5, 5, 5, 5, 5);
        if (fives == 25) fivesCount++;
        else System.out.println("5, 5, 5, 5, 5 should give 25 points in the fives category");

        if (fivesCount == 6) System.out.println("all fives cases worked :)");

        int sixesCount = 0;
        markSixes(1, 4, 4, 3, 5);
        if (sixes == 0) sixesCount++;
        else System.out.println("1, 4, 4, 3, 5 should give 0 points in the sixes category");
        sixes = -1;
        markSixes(5, 2, 5, 6, 1);
        if (sixes == 6) sixesCount++;
        else System.out.println("5, 2, 5, 6, 1 should give 6 points in the sixes category");
        sixes = -1;
        markSixes(6, 1, 2, 6, 1);
        if (sixes == 12) sixesCount++;
        else System.out.println("6, 1, 2, 6, 1 should give 12 points in the sixes category");
        sixes = -1;
        markSixes(6, 5, 6, 6, 2);
        if (sixes == 18) sixesCount++;
        else System.out.println("6, 5, 6, 6, 2 should give 18 points in the sixes category");
        sixes = -1;
        markSixes(6, 2, 6, 6, 6);
        if (sixes == 24) sixesCount++;
        else System.out.println("6, 2, 6, 6, 6 should give 24 points in the sixes category");
        sixes = -1;
        markSixes(6, 6, 6, 6, 6);
        if (sixes == 30) sixesCount++;
        else System.out.println("6, 6, 6, 6, 6 should give 30 points in the sixes category");

        if (sixesCount == 6) System.out.println("all sixes cases worked :)");

        int threeKindCount = 0;
        markThreeOfAKind(2, 4, 4, 2, 2);
        if (threeKind > 0) threeKindCount++;
        else System.out.println("2, 4, 4, 2, 2 was incorrectly calculated as NOT being a three of a kind");
        threeKind = -1;
        markThreeOfAKind(1, 5, 1, 5, 1);
        if (threeKind > 0) threeKindCount++;
        else System.out.println("1, 5, 1, 5, 1 was incorrectly calculated as NOT being a three of a kind");
        threeKind = -1;
        markThreeOfAKind(6, 1, 6, 6, 1);
        if (threeKind > 0) threeKindCount++;
        else System.out.println("6, 1, 6, 6, 1  was incorrectly calculated as NOT being a three of a kind");
        threeKind = -1;
        markThreeOfAKind(5, 5, 5, 5, 5);
        if (threeKind > 0) threeKindCount++;
        else System.out.println("5, 5, 5, 5, 5  was incorrectly calculated as NOT being a three of a kind");
        threeKind = -1;
        markThreeOfAKind(5, 1, 1, 3, 5);
        if (threeKind == 0) threeKindCount++;
        else System.out.println("5, 1, 1, 3, 5  was incorrectly calculated as being a three of a kind");

        if (threeKindCount ==5) System.out.println("all three of a kind cases worked :)");

        int fourKindCount = 0;
        markFourOfAKind(2, 4, 2, 2, 2);
        if (fourKind > 0) fourKindCount++;
        else System.out.println("2, 4, 2, 2, 2 was incorrectly calculated as NOT being a four of a kind");
        fourKind = -1;
        markFourOfAKind(1, 1, 1, 5, 1);
        if (fourKind > 0) fourKindCount++;
        else System.out.println("1, 1, 1, 5, 1 was incorrectly calculated as NOT being a four of a kind");
        fourKind = -1;
        markFourOfAKind(6, 6, 1, 6, 6);
        if (fourKind > 0) fourKindCount++;
        else System.out.println("6, 6, 1, 6, 6  was incorrectly calculated as NOT being a four of a kind");
        fourKind = -1;
        markFourOfAKind(5, 5, 5, 5, 5);
        if (fourKind > 0) fourKindCount++;
        else System.out.println("5, 5, 5, 5, 5  was incorrectly calculated as NOT being a four of a kind");
        fourKind = -1;
        markFourOfAKind(5, 1, 1, 3, 1);
        if (fourKind == 0) fourKindCount++;
        else System.out.println("5, 1, 1, 3, 1  was incorrectly calculated as being a four of a kind");

        if (fourKindCount ==5) System.out.println("all four of a kind cases worked :)");

        int chanceCount = 0;
        markChance(2, 4, 2, 6, 2);
        if (chance == 16) chanceCount++;
        else System.out.println("2, 4, 2, 6, 2 should give 16 points in the chance category");
        chance = -1;
        markChance(1, 3, 1, 5, 2);
        if (chance == 12) chanceCount++;
        else System.out.println("1, 3, 1, 5, 2 should give 12 points in the chance category");
        chance = -1;
        markChance(6, 5, 1, 6, 4);
        if (chance == 22) chanceCount++;
        else System.out.println("6, 5, 1, 6, 4 should give 22 points in the chance category");
        chance = -1;
        markChance(5, 6, 2, 6, 5);
        if (chance == 24) chanceCount++;
        else System.out.println("5, 6, 2, 6, 5 should give 24 points in the chance category");
        chance = -1;
        markChance(5, 1, 1, 3, 6);
        if (chance == 16) chanceCount++;
        else System.out.println("5, 1, 1, 3, 6 should give 16 points in the chance category");

        if (chanceCount ==5) System.out.println("all chance cases worked :)");

        int smStraightCount = 0;
        markSmallStraight(2, 4, 3, 1, 3);
        if (smStraight == 30) smStraightCount++;
        else System.out.println("2, 4, 3, 1, 3 was incorrectly calculated as NOT being a small straight");
        smStraight = -1;
        markSmallStraight(2, 5, 6, 1, 3);
        if (smStraight != 30) smStraightCount++;
        else System.out.println("2, 5, 6, 1, 3 was incorrectly calculated as being a small straight");
        smStraight = -1;
        markSmallStraight(2, 5, 6, 4, 1);
        if (smStraight != 30) smStraightCount++;
        else System.out.println("2, 5, 6, 4, 1  was incorrectly calculated as being a small straight");
        smStraight = -1;
        markSmallStraight(6, 5, 4, 3, 1);
        if (smStraight == 30) smStraightCount++;
        else System.out.println("6, 5, 4, 3, 1  was incorrectly calculated as NOT being a small straight");
        smStraight = -1;
        markSmallStraight(6, 4, 3, 2, 1);
        if (smStraight == 30) smStraightCount++;
        else System.out.println("6, 4, 3, 2, 1  was incorrectly calculated as NOT being a small straight");
        smStraight = -1;
        markSmallStraight(2, 4, 3, 2, 1);
        if (smStraight == 30) smStraightCount++;
        else System.out.println("2, 4, 3, 2, 1  was incorrectly calculated as NOT being a small straight");
        smStraight = -1;
        markSmallStraight(2, 4, 3, 4, 1);
        if (smStraight == 30) smStraightCount++;
        else System.out.println("6, 4, 3, 4, 1  was incorrectly calculated as NOT being a small straight");
        smStraight = -1;
        markSmallStraight(2, 5, 3, 4, 1);
        if (smStraight == 30) smStraightCount++;
        else System.out.println("6, 5, 3, 4, 1  was incorrectly calculated as NOT being a small straight");
        if (smStraightCount ==8) System.out.println("all small straight cases worked :)");

        int lgStraightCount = 0;
        markLargeStraight(2, 4, 3, 1, 5);
        if (lgStraight == 40) lgStraightCount++;
        else System.out.println("2, 4, 3, 1, 5 was incorrectly calculated as NOT being a large straight");
        lgStraight = -1;
        markLargeStraight(2, 5, 6, 4, 3);
        if (lgStraight == 40) lgStraightCount++;
        else System.out.println("2, 5, 6, 4, 3 was incorrectly calculated as NOT being a large straight");
        lgStraight = -1;
        markLargeStraight(1, 5, 6, 4, 3);
        if (lgStraight != 40) lgStraightCount++;
        else System.out.println("1, 5, 6, 4, 3  was incorrectly calculated as being a large straight");
        lgStraight = -1;
        markLargeStraight(6, 5, 4, 3, 6);
        if (lgStraight != 40) lgStraightCount++;
        else System.out.println("6, 5, 4, 3, 6  was incorrectly calculated as being a large straight");

        if (lgStraightCount ==4) System.out.println("all large straight cases worked :)");

        int fullHouseCount = 0;
        markFullHouse(2, 4, 4, 2, 2);
        if (fullHouse == 25) fullHouseCount++;
        else System.out.println("2, 4, 4, 2, 2 was incorrectly calculated as NOT being a full house");
        fullHouse = -1;
        markFullHouse(2, 5, 2, 5, 2);
        if (fullHouse == 25) fullHouseCount++;
        else System.out.println("2, 5, 2, 5, 2 was incorrectly calculated as NOT being a full house");
        fullHouse = -1;
        markFullHouse(6, 1, 6, 6, 1);
        if (fullHouse == 25) fullHouseCount++;
        else System.out.println("6, 1, 6, 6, 1  was incorrectly calculated as NOT being a full house");
        fullHouse = -1;
        markFullHouse(5, 5, 5, 5, 5);
        if (fullHouse == 25) fullHouseCount++;
        else System.out.println("5, 5, 5, 5, 5  was incorrectly calculated as NOT being a full house");
        fullHouse = -1;
        markFullHouse(5, 1, 1, 3, 5);
        if (fullHouse != 25) fullHouseCount++;
        else System.out.println("5, 1, 1, 3, 5  was incorrectly calculated as being a full house");

        if (fullHouseCount ==5) System.out.println("all full house cases worked :)");

        int yahtzeeCount = 0;
        markYahtzee(2, 2, 2, 2, 2);
        if (yahtzee == 50) yahtzeeCount++;
        else System.out.println("2, 2, 2, 2, 2 was incorrectly calculated as NOT being a yahtzee");
        yahtzee = -1;
        markYahtzee(5, 5, 5, 5, 5);
        if (yahtzee == 50) yahtzeeCount++;
        else System.out.println("5, 5, 5, 5, 5 was incorrectly calculated as NOT being a yahtzee");
        yahtzee = -1;
        markYahtzee(6, 6, 6, 6, 6);
        if (yahtzee == 50) yahtzeeCount++;
        else System.out.println("6, 6, 6, 6, 6  was incorrectly calculated as NOT being a yahtzee");
        yahtzee = -1;
        markYahtzee(3, 3, 3, 3, 3);
        if (yahtzee == 50) yahtzeeCount++;
        else System.out.println("3, 3, 3, 3, 3  was incorrectly calculated as NOT being a yahtzee");
        yahtzee = -1;
        markYahtzee(1, 1, 1, 1, 5);
        if (yahtzee != 50) yahtzeeCount++;
        else System.out.println("5, 1, 1, 3, 5  was incorrectly calculated as being a yahtzee");

        if (yahtzeeCount ==5) System.out.println("all yahtzee cases worked :)");





    }

}


