import java.util.*;

class Trainer {
    int tid;
    String tname;

    Trainer(int tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    @Override
    public String toString() {
        return tid + " " + tname;
    }
}

// Comparator to sort by ID
class IdComparator implements Comparator<Trainer> {
    public int compare(Trainer t1, Trainer t2) {
        return Integer.compare(t1.tid, t2.tid);
    }
}

// Comparator to sort by Name
class NameComparator implements Comparator<Trainer> {
    public int compare(Trainer t1, Trainer t2) {
        return t1.tname.compareTo(t2.tname);
    }
}

class TrainerComparator implements Comparator<Trainer> {
    public int compare(Trainer t1, Trainer t2) {

        // Compare by ID
        int idCompare = Integer.compare(t1.tid, t2.tid);

        // If IDs are equal, compare by Name
        if (idCompare == 0) {
            return t1.tname.compareTo(t2.tname);
        }

        return idCompare;
    }
}

// Main class
public class Compara {
    public static void main(String[] args) {

        ArrayList<Trainer> al = new ArrayList<>();

        al.add(new Trainer(103, "John"));
        al.add(new Trainer(101, "Alice"));
        al.add(new Trainer(102, "Bob"));
        al.add(new Trainer(102, "AL"));

        //Sort using ID
        Collections.sort(al, new IdComparator());
        System.out.println("After sorting using ID:");
        for (Trainer t : al) {
            System.out.println(t);
        }

        //Sort using Name
        Collections.sort(al, new NameComparator());
        System.out.println("\nAfter sorting using Name:");
        for (Trainer t : al) {
            System.out.println(t);
        }

        //Sort using both ID and Name
        Collections.sort(al, new TrainerComparator());
        System.out.println("\nAfter sorting using both ID and Name:");
        for (Trainer t : al) {
            System.out.println(t);
        }
    }
}
