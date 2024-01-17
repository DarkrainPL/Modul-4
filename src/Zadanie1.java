import java.lang.reflect.Array;

public class Zadanie1 {

    public int sumArray(int[] array) {

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }

        return suma;
    }
}
