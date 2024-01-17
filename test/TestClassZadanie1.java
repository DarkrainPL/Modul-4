import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClassZadanie1 {

    private Zadanie1 testObject = new Zadanie1();
    @Test
    public void sumArrayPositive() {
        int[] array = {1, 3, 5};
        Assertions.assertEquals(9, testObject.sumArray(array));
    }
    @Test
    public void sumArrayNegative() {
        int[] array = {-1, -3, -5};
        Assertions.assertEquals(-9, testObject.sumArray(array));
    }
}
