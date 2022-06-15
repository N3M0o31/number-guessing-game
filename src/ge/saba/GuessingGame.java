package ge.saba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;


public class GuessingGame {
    private static final Logger log = LoggerFactory.getLogger(GuessingGame.class);

    public static void main(String[] args) {
        log.info("Application started");
        int Number = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        log.debug("The correct guess would be {}", Number);
        int count = 1;

        while (userAnswer != Number) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter number between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, Number, count));
            count++;
        }
        log.info("Application ended");
    }

    /**
     * Returns message which tells user the state of the game.
     * @param userAnswer number that user pass
     * @param computerNumber Number to guess
     * @param count Guess steps
     * @return Formatted message
     */
    public static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Invalid Number";
        } else if (userAnswer == computerNumber) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (userAnswer > computerNumber) {
            return "Too high \nTry Number: " + count;
        } else if (userAnswer < computerNumber) {
            return "Too low \nTry Number: " + count;
        } else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
