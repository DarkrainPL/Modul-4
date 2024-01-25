import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class TestClassModule4Task2 {

    private PasswordVerification testObject = new PasswordVerification();


    @Test
    public void hasGoodLenghtTest() {
        String password = "!amjustTheRightLenght";
        Assertions.assertTrue(testObject.hasGoodLenght(password));
    }

    @Test
    public void hasNoGoodLenghtTest() {
        String password = "2short";
        Assertions.assertFalse(testObject.hasGoodLenght(password));
    }

    @Test
    public void hasNoWhiteSpacesTest() {
        String password = "Thereisnowhitespaceshere";
        Assertions.assertFalse(testObject.hasNoWhiteSpaces(password));
    }
    @Test
    public void hasWhiteSpacesTest() {
        String password = "Thereis whitespace";
        Assertions.assertFalse(testObject.hasNoWhiteSpaces(password));
    }
    @Test
    public void hasNoRepetitionTest() {
        String password = "IamRepetitionFree";
        Assertions.assertTrue(testObject.hasNoRepetitions(password));
    }
    @Test
    public void hasRepetitionTest() {
        String password = "AAbbCCddEEff123";
        Assertions.assertTrue(testObject.hasNoRepetitions(password));
    }
    @Test
    public void hasNumbersTest() {
        String password = "QWERTY123456";
        Assertions.assertTrue(testObject.hasNumbers(password));
    }
    @Test
    public void hasNoNumbersTest() {
        String password = "SoOutNumbered";
        Assertions.assertFalse(testObject.hasNumbers(password));
    }
    @Test
    public void hasSpecialCharacterTest() {
        String password = "soooSpecial!!!";
        Assertions.assertTrue(testObject.hasSpecialCharacter(password));
    }
    @Test
    public void hasNoSpecialCharacterTest() {
        String password = "totallynothingspecial";
        Assertions.assertFalse(testObject.hasSpecialCharacter(password));
    }
}