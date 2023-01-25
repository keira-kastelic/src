import java.util.Scanner;

public class YahtzeeDriver {
    /* YahtzeeDriver TODO:
        1. Create a new instance of the YahtzeeGame class.
        2. Call the playGame method on the created instance.
        3. Ask the user if they would like to play again, and repeat the game until the user says no.
        4. When the user is done playing, print the number of games played, in addition to the min score,
           max score, and average score of all games. These values should be calculated within this code.
    */
    public static void main(String[] args) {
        System.out.println("Welcome to Keira's AP CSA Yahtzee Game!! would you like to play? (y/n)"); // prompting the user to play the game

        Scanner s = new Scanner(System.in); // creating a scanner
        String play; // reading in the users input
        int gamePlayed = 0; // creating a variable for the amount of games played
        int min = 0; // creating a min score variable
        int max = 0; // creating a max score variable
        int sum = 0; // creating a sum variable for the scores of the games added up
        do { // creating a do while loop for if the user wants to play the game
            YahtzeeGame game = new YahtzeeGame(); // creating a new yahtzee game object
            game.playGame(); // playing the game
            gamePlayed++; // updating the games played method
            System.out.println("Would you like to play again? (y/n)"); // re-prompting the user to play again
            play = s.nextLine(); // updating the play variable

            int total = game.playGame(); // storing the grand total score in the total variable
            int i = 0; // creating a variable for the do while loop to know when to stop looping
           do{ // creating a do while loop to make sure the min and max value will not always be 0 because of how they are declared
               min = total; // setting the min to be the first total score
               max = total; // setting the max to be the first total score
               i++; // updating the i variable so it will not play again
           }while(i == 0);
            if(total <= min){ // creating an if statement for if the total points is less than the one played before
                min = total; // making the min variable the new total
            } else if (total >= max){ // creating an else if statement to see if the score is a new maximum
                max = total; // making the max variable the new total
            }
            sum = sum + total; // adding the total to the sum variable
        } while (play.equals("y")); // while loop for if the user enters y to play again

        int average = sum / gamePlayed; // finding the average score based on the total points divided by the amount if games played
        System.out.println("You have played " + gamePlayed + " games!" + // printing out the amount of games played, min score, max score, and average score once the user is done playing
                           "\nYour minimum score is: " + min +
                           "\nYour maximum score is: " + max +
                           "\nYour average score is: " + average);
    }
}
