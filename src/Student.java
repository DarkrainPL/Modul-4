import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private int age;
    private int height;
    private String name;
    private String lastName;

    public Student(int age, int height, String name, String lastName) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
    }

    public void sortStudent() {

        List<Student> listOfStudents = new ArrayList<>();

        Student student1 = new Student(24, 180, "John", "Doe5");
        Student student2 = new Student(33, 179, "Roger", "Doe4");
        Student student3 = new Student(12, 178, "Steven", "Doe3");
        Student student4 = new Student(121, 177, "Mike", "Doe2");
        Student student5 = new Student(200, 176, "Tony", "Doe1");

        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        listOfStudents.add(student5);

        System.out.println("Before sorting");
        for (Student student : listOfStudents) {        //nie wiem czemu tak? - dopytać raz jeszcze!!!
            System.out.println(student.getName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getHeight());
        }

        Collections.sort(listOfStudents);
        System.out.println(" ");
        ;

        System.out.println("After sorting by last name:");
        for (Student student : listOfStudents) {
            System.out.println(student.getName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getHeight());
        }
        CompareByAge comparator = new CompareByAge();
        Collections.sort(listOfStudents, comparator);
        System.out.println(" ");
        ;

        System.out.println("After sorting by last name and age:");
        for (Student student : listOfStudents) {
            System.out.println(student.getName() + " " + student.getLastName() + " " + student.getAge() + " " + student.getHeight());
        }

    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        return this.lastName.compareTo(student.lastName);

    }

}


