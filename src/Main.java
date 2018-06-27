import zad5slajdy.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1234,"JOhnny","Cash");
        Student student2 = new Student(1237,"Muddy","Waters");
        Student student3 = new Student(1236,"BB","King");

        Student[] students = {student1,student2,student3};
        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
