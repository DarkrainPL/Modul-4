import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClassZadanie1 {

    private Zadanie1 testObject = new Zadanie1();
    @Test
    public void sumOneThreeFiveIsNine() {
        Assertions.assertEquals(9, testObject.sumArray());
    }
}
