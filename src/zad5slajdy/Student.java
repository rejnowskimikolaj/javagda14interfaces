package zad5slajdy;

public class Student implements Comparable {
    private int nrIndeksu;
    private String firstName;
    private String lastName;

    public Student(int nrIndeksu, String firstName, String lastName) {
        this.nrIndeksu = nrIndeksu;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public int compareTo(Object o) {
        return ((Student)o).nrIndeksu - this.nrIndeksu;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
