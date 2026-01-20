import java.util.*;

class Teacher {
    int tid;
    String tname;

    Teacher(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public int getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }

    @Override
    public String toString() {
        return tid + " " + tname;
    }
}

// Comparator to sort by Name
class NameComparator implements Comparator<Teacher> {
    public int compare(Teacher t1, Teacher t2) {
        return t1.getTname().compareTo(t2.getTname());
    }
}

public class LinkedhashSett {
    public static void main(String[] args) {

        LinkedHashSet<Teacher> hs = new LinkedHashSet<>();
        hs.add(new Teacher(101, "Dlice"));
        hs.add(new Teacher(102, "Aob"));
        hs.add(new Teacher(103, "Charlie"));
        hs.add(new Teacher(103, "Charlie"));

        // Convert Set → List
        List<Teacher> list = new ArrayList<>(hs);

        // Sort list
        Collections.sort(list, new NameComparator());

        System.out.println("After sorting by name:");
        for (Teacher t : list) {
            System.out.println(t);
        }
    }
}
