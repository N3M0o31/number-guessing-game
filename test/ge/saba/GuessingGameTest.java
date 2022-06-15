package ge.saba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessingGameTest {
    @Test
    public void testDetermineGuess() {
        String result = GuessingGame.determineGuess(2, 1, 3);
        Assertions.assertEquals("Too high \nTry Number: 3", result);

         result = GuessingGame.determineGuess(-1, 1, 3);
        Assertions.assertEquals("Invalid Number", result);

        result = GuessingGame.determineGuess(1, 2, 3);
        Assertions.assertEquals("Too low \nTry Number: 3", result);

        result = GuessingGame.determineGuess(3, 3, 3);
        Assertions.assertEquals("Correct!\nTotal Guesses: 3", result);
    }
}
