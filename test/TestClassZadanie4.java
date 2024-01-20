import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClassZadanie4 {


    @Test
    public void areThoseEqual() {


        Student student1 = new Student(24, 180, "John", "Doe5");
        Student student2 = new Student(33, 179, "Roger", "Doe4");
        Student student3 = new Student(12, 178, "Steven", "Doe3");
        Student student4 = new Student(121, 177, "Mike", "Doe2");
        Student student5 = new Student(200, 176, "Tony", "Doe1");

        List<Student> listOfStudentsNotSorted = new ArrayList<>();

        listOfStudentsNotSorted.add(student1);
        listOfStudentsNotSorted.add(student2);
        listOfStudentsNotSorted.add(student3);
        listOfStudentsNotSorted.add(student4);
        listOfStudentsNotSorted.add(student5);

        List<Student> listOfStudentsSorted = new ArrayList<>();

        listOfStudentsSorted.add(student3);
        listOfStudentsSorted.add(student1);
        listOfStudentsSorted.add(student2);
        listOfStudentsSorted.add(student4);
        listOfStudentsSorted.add(student5);

        Assertions.assertNotEquals(listOfStudentsSorted, listOfStudentsNotSorted);

        Collections.sort(listOfStudentsNotSorted);
        CompareByAge comparator = new CompareByAge();
        Collections.sort(listOfStudentsNotSorted, comparator);

        Assertions.assertEquals(listOfStudentsSorted, listOfStudentsNotSorted);

        // potrzebuje to przeanalizowac krok po kroku, mimo ze to działa w zasadzie

    }

}


