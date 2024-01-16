

public class Zadanie1 {

    public int sumArray() {

        int[] array = {1, 3, 5};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
          //  System.out.println(array[i]);
            suma = suma + array[i];
        }
        // System.out.println("Suma liczb to: " + suma);
        return suma;
    }
}
