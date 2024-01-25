import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class TestClassModule4Task2 {

    private PasswordVerification testObject = new PasswordVerification(); // ??


    @Test
    public void hasGoodLenghtTest() {
        Assertions.assertTrue(testObject.hasGoodLenght());
    }

    @Test
    public void hasNoWhiteSpacesTest() {
        Assertions.assertFalse(testObject.hasNoWhiteSpaces());
    }

    @Test
    public void hasNoRepetitionTest() {
        Assertions.assertFalse(testObject.hasNoRepetitions());
    }

    @Test
    public void hasNumbersTest() {
        Assertions.assertTrue(testObject.hasNumbers());
    }

    @Test
    public void hasSpecialCharacterTest() {
        Assertions.assertTrue(testObject.hasSpecialCharacter());
    }
}