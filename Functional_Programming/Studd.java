import java.util.*;

public class Studd {
    private int marks;
    private String name;

    Studd(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        List<Studd> students = new ArrayList<>();
        students.add(new Studd(85, "Alice"));
        students.add(new Studd(92, "Bob"));
        students.add(new Studd(78, "Charlie"));
        students.add(new Studd(90, "David"));

        // Sort by marks in Ascending order
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getMarks(), s2.getMarks()));

        System.out.println("Students sorted by marks (Ascending):");
        for (Studd student : students) {
            System.out.println(student);
        }
    }
}
