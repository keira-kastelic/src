import java.util.*;

public class YahtzeeGame {

    public static final int NUM_SIDES = 6;
    //TODO: create 5 new YahtzeeDie objects as instance variables here (one for each of the 5 dice):
    private YahtzeeDie die1 = new YahtzeeDie(); // creating a new yahtzee die
    private YahtzeeDie die2 = new YahtzeeDie(); // creating a new yahtzee die
    private YahtzeeDie die3 = new YahtzeeDie(); // creating a new yahtzee die
    private YahtzeeDie die4 = new YahtzeeDie(); // creating a new yahtzee die
    private YahtzeeDie die5 = new YahtzeeDie(); // creating a new yahtzee die

    //TODO: create a new YahtzeeScorecard object as instance data here:
    YahtzeeScorecard scorecard = new YahtzeeScorecard(); // creating a yahtzee scorecard object

    /* PlayGame TODO:
        1. Call the method "takeTurn" 13 times. (You will be coding takeTurn later on in this class,
           so feel free to do that first!)
        2. Print the scorecard by calling the method "printScoreCard" on your YahtzeeScorecard object.
        3. Return the grand total by calling the method "getGrandTotal" on your YahtzeeScorecard object.
    */
    public int playGame() { // creating a play game method to run the game created when the user says they want to play
        for (int i = 0; i < 13; i++){ // establishing the player gets 13 turns per a game
            takeTurn(); // returning the take turn method
        }
        scorecard.printScoreCard(); // printing the scorecard after the game is over
        return scorecard.getGrandTotal(); // returning the grand total in the scorecard variable
    }

    /* takeTurn TODO:
        1. Roll the dice by calling the "rollDice" method. (You will be coding rollDice later on in this class,
           so feel free to do that first!)
        2. Print out their first dice roll by calling the "printDice" method. (You will be coding printDice later
           on in this class, so feel free to do that first!)
        3. Ask the player if they are satisfied with their roll or if they want to roll again and freeze some
           dice (prompt already given).
        4. If the user chooses to roll again (enters "r") you should:
             a. Ask them to choose which dice to freeze (make use of the "chooseFrozen" method, below).
             b. Roll the dice again.
             c. Print out their second dice roll.
             d. Prompt the user to choose again (s/r).
             e. If the user chooses to roll again, repeat a-c again for their third roll. (Max 3 rolls allowed.)
        5. If the user chooses "s" after either of the first two rolls, immediately stop and go to step 6.
        6. Call the "markScore" method. (You will be coding markScore later on in this class,
           so feel free to do that first!)
    */
    private void takeTurn() { // creating a take turn method to show when their next turn is

        rollDice(); // rolling the dice/ generating 5 random numbers between 1 and 6
        printDice(); // printing out the numbers
        System.out.print("Are you (s)atisfied or to you want to (r)oll again and freeze some dice? (s/r): "); // promoting the user to roll again or finish their turn
        Scanner s = new Scanner(System.in); // creating a new scanner
        String input = s.nextLine(); // reading in the users input
        int i = 1; // creating an i variable for the amount of times able to roll a dice
        if (input.equals("r") && i < 2){ // creating an if statement for it the user wants to roll again and they have played less than twice
            System.out.println("which dice would you like to freeze?"); // prompting the user which dice to freeze
            chooseFrozen(); // using the chooseFrozen methos to freeze numbers to not randomize again
            rollDice(); // rolling the dice again
            printDice(); // printing out the new numbers
            i++; // updating the i variable after their turn
            System.out.print("Are you (s)atisfied or to you want to (r)oll again and freeze some dice? (s/r): "); // prompting the user to roll again or finish their turn
            input = s.nextLine(); // creading in the users input
        }
        if(input.equals("r")){ // creating an if statement for their last turn if they pressed roll again
        System.out.println("which dice would you like to freeze?"); // prompting the user which dice to freeze
        chooseFrozen(); // freezing the dice the user choose
        rollDice(); // rolling the new dice
        printDice(); // printing the dice out
        markScore(); // printing out the scorecard after they are done with their rolls
        }
        if(input.equals("s")){ // creating an if statement for when the user is satisfied with their roll
            markScore(); // printing the scorecard after they are done with their rolls
        }
    }

    /* rollDice TODO:
        For each of the 5 dice, you should do the following:
        If the die is not frozen, you should roll that die. Otherwise if it is frozen, unfreeze it but do NOT roll it.
    */
    private void rollDice() { // creating a roll dice method for which dice to roll
        if(!this.die1.isFrozen()){ // checking to see if the die is NOT frozen
            this.die1.rollDie(); // if it is not frozen, print a new number
        } else { // checking if the die is frozen
            this.die1.unfreezeDie(); // unfreezing the die
        }
        if(!this.die2.isFrozen()){ // checking to see if the die is NOT frozen
            this.die2.rollDie(); // if it is not frozen, print a new number
        } else { // checking if the die is frozen
            this.die2.unfreezeDie(); // unfreezing the die
        }
        if(!this.die3.isFrozen()){ // checking to see if the die is NOT frozen
            this.die3.rollDie(); // if it is not frozen, print a new number
        } else { // checking if the die is frozen
            this.die3.unfreezeDie(); // unfreezing the die
        }
        if(!this.die4.isFrozen()){ // checking to see if the die is NOT frozen
            this.die4.rollDie(); // if it is not frozen, print a new number
        } else { // checking if the die is frozen
            this.die4.unfreezeDie(); // unfreezing the die
        }
        if(!this.die5.isFrozen()){ // checking to see if the die is NOT frozen
            this.die5.rollDie(); // if it is not frozen, print a new number
        } else { // checking if the die is frozen
            this.die5.unfreezeDie(); // unfreezing the die
        }
    }

    /* chooseFrozen TODO:
        1. Prompt the user to enter which dice to freeze (sample prompt provided).
        2. For each number entered, freeze the corresponding die by calling the "freezeDie" method for that
           particular YahtzeeDie object.
    */
    private void chooseFrozen() { // creating the choose frozen method
        System.out.print("Enter which dice to freeze (1-5). Enter them all in one line (ex: 134): "); // prompting the user to pick di(c)e to freeze
        Scanner s = new Scanner(System.in); // creating a scanner
        String input = s.nextLine(); // reading in the users input
        if(input.indexOf("1") >= 0){ // seeing if they choose to freeze the first die
            this.die1.freezeDie(); // freezing the die to not change the number
        }
        if(input.indexOf("2") >= 0){ // seeing if they choose to freeze the second die
            this.die2.freezeDie(); // freezing the die to not change the number
        }
        if(input.indexOf("3") >= 0){ // seeing if they choose to freeze the second die
            this.die3.freezeDie(); // freezing the die to not change the number
        }
        if(input.indexOf("4") >= 0){ // seeing if they choose to freeze the second die
            this.die4.freezeDie(); // freezing the die to not change the number
        }
        if(input.indexOf("5") >= 0){ // seeing if they choose to freeze the second die
            this.die5.freezeDie(); // freezing the die to not change the number
        }
    }

    /* printDice TODO:
        Print the value of each of the 5 dice using the "getValue" method, separated by tabs, all on one line.
        (Ex: 2   5   3   1   5).
    */
    private void printDice() { // creating a print dice method to print out the values
        System.out.println(this.die1.getValue() + "\t" + this.die2.getValue() + "\t" + this.die3.getValue() + "\t" + this.die4.getValue() + "\t" + this.die5.getValue()); // getting the values for the die and printing them with spaces inbetween
    }

    /* markScore TODO:
        1. Create a do while loop in which you:
            a. Print the score by calling the "printScoreCard" method.
            b. Create a second do while loop in which you:
                1. Prompt the user for where they want to place their score (sample prompt provided).
                2. Read in their choice.
                3. Repeat until they enter a valid number.
            c. Create a switch statement based on the number the user previously entered for where they want to place
               their score. For each case, you should:
                1. Call the appropriate method from your scorecard object (ex: markOnes, markFullHouse, etc.).
                   Remember that these methods take in the value of all 5 of the dice as their arguments. Additionally,
                   these methods will return true if the corresponding category is empty and has been updated, and
                   will return false if the corresponding category is already full. You should store the returned value
                   into the boolean "scoreUpdated", which is already given. This will be used to check and see if you
                   should re-prompt the user.
                2. Repeat until "scoreUpdated" is true.
    */
    private void markScore() { // creating the mark score method to print out the scorecard
        boolean scoreUpdated = true; // creating a boolean for if the score is updated and setting it equal to true
        int print; // creating a print variable
        do { // creating a do while loop for if the score updated boolean is false
            do { // creating a do while loop for when the user enters a number that is not 1-13
                scorecard.printScoreCard(); // printing the score card
                System.out.println("Where would you like to place your score?"); // printing the number key
                System.out.println("1. Ones \t7.  3 of Kind");
                System.out.println("2. Twos \t8.  4 of Kind");
                System.out.println("3. Threes \t9.  Full House");
                System.out.println("4. Fours \t10. Sm Straight");
                System.out.println("5. Fives \t11. Lg Straight");
                System.out.println("6. Sixes \t12. Yahtzee");
                System.out.println("\t\t13. Chance");
                System.out.print("Enter 1-13: ");
                Scanner s = new Scanner(System.in); // creating a scanner
                print = s.nextInt(); // reading in the users input and updating the print variable
            } while (print <1 || print > 13); // while loop for when the user does not choose a valid number
            switch (print) { // creating a switch loop for the number entered by the user
                case 1: boolean one = scorecard.markOnes(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue()); // getting the values of the dice in the mark ones method
                    if (one == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 2: boolean two = scorecard.markTwos(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (two == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 3: boolean three = scorecard.markThrees(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (three == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 4: boolean four = scorecard.markFours(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (four == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 5: boolean five = scorecard.markFives(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (five == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 6: boolean six = scorecard.markSixes(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (six == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 7: boolean threeKind = scorecard.markThreeOfAKind(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (threeKind == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 8: boolean fourKind = scorecard.markFourOfAKind(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (fourKind == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 9: boolean full = scorecard.markFullHouse(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (full == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 10: boolean smStraight = scorecard.markSmallStraight(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (smStraight == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 11: boolean lgStraight = scorecard.markLargeStraight(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (lgStraight == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 12: boolean yahtzee = scorecard.markYahtzee(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (yahtzee == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                case 13: boolean chance = scorecard.markChance(this.die1.getValue(), this.die2.getValue(), this.die3.getValue(),this.die4.getValue(),this.die5.getValue());
                    if (chance == false) { // seeing if the boolean created above is equal to false/ has been updated
                        scoreUpdated = false; // updating the score
                    }break; // stopping the code after the case has gone through
                default: // is the user did not enter a valid number
                    System.out.println("please enter a valid number"); // re-prompting the user
            }
        } while (scoreUpdated == false); // while loop for is the score updated boolean is false
    }
}
