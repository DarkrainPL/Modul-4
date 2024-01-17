import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestClassZadanie4 {



    @Test
    public void areEqual() {

        List<Student> listOfStudentsBefore = new ArrayList<>();

        Student student1 = new Student(24, 180, "John", "Doe5");
        Student student2 = new Student(33, 179, "Roger", "Doe4");
        Student student3 = new Student(12, 178, "Steven", "Doe3");
        Student student4 = new Student(121, 177, "Mike", "Doe2");
        Student student5 = new Student(200, 176, "Tony", "Doe1");

        listOfStudentsBefore.add(student1);
        listOfStudentsBefore.add(student2);
        listOfStudentsBefore.add(student3);
        listOfStudentsBefore.add(student4);
        listOfStudentsBefore.add(student5);

        Assertions.assertArrayEquals(listOfStudentsBefore,
    }

}


