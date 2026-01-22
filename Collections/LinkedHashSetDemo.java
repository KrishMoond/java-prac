import java.util.*;

/**
 * Teacher class representing a teacher with ID and name
 */
class Teacher {
    private int tid;
    private String tname;

    /**
     * Constructor for Teacher
     * @param tid Teacher ID
     * @param tname Teacher name
     */
    public Teacher(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public int getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }
    
    public void setTid(int tid) {
        this.tid = tid;
    }
    
    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{id=" + tid + ", name='" + tname + "'}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return tid == teacher.tid && Objects.equals(tname, teacher.tname);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(tid, tname);
    }
}

/**
 * Comparator to sort teachers by name
 */
class TeacherNameComparator implements Comparator<Teacher> {
    public int compare(Teacher t1, Teacher t2) {
        return t1.getTname().compareTo(t2.getTname());
    }
}

/**
 * LinkedHashSetDemo class demonstrating LinkedHashSet operations
 * with Teacher objects, maintaining insertion order and preventing duplicates.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Teacher> teacherSet = new LinkedHashSet<>();
        teacherSet.add(new Teacher(101, "Alice"));
        teacherSet.add(new Teacher(102, "Bob"));
        teacherSet.add(new Teacher(103, "Charlie"));
        teacherSet.add(new Teacher(103, "Charlie")); // Duplicate - will be ignored

        System.out.println("LinkedHashSet (maintains insertion order):");
        for (Teacher t : teacherSet) {
            System.out.println(t);
        }

        // Convert Set → List for sorting
        List<Teacher> teacherList = new ArrayList<>(teacherSet);

        // Sort list by name
        Collections.sort(teacherList, new TeacherNameComparator());

        System.out.println("\nAfter sorting by name:");
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
        
        System.out.println("\nSet size: " + teacherSet.size());
        System.out.println("Contains Teacher(102, 'Bob'): " + 
                          teacherSet.contains(new Teacher(102, "Bob")));
    }
}
