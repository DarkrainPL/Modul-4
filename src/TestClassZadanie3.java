import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestClassZadanie3 {

    private Zadanie3 testObject = new Zadanie3();
    private HashMap<String, Integer> testObjectExpected = new HashMap<>();


    @Test
    public void alaMaKota() {
        String word = "Ala ma kota, kota ma Ala";
        testObjectExpected.put("Ala", 2);
        testObjectExpected.put("ma", 2);
        testObjectExpected.put("kota", 2);
        Assertions.assertTrue(testObject.countWords(word).equals(testObjectExpected));
    }

}
