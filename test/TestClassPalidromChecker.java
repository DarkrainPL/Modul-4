import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestClassPalidromChecker {

    PalindromChecker testObiect = new PalindromChecker();
    @Test
    public void areYouNotPalindomeTest() {
        String stringTestowany = "RaCecarS";
        Assertions.assertFalse(testObiect.areYouPalindrome(stringTestowany));
    }
    @Test
    public void areYouPalindomeTest() {
        String stringTestowany = "KAJak";
        Assertions.assertTrue(testObiect.areYouPalindrome(stringTestowany));
    }

}
