import java.io.*;

public class Studd {
    public static void main(String[] args) {

        StudentDriver s1 = new StudentDriver("Krish", 1);

       try {
            // Write object to file
            FileOutputStream fs = new FileOutputStream("Stud.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(s1);
            os.close();
            fs.close();
            System.out.println("Object written to file successfully");

            // Read object from file
            FileInputStream fis = new FileInputStream("Stud.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            StudentDriver s2 = (StudentDriver) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Object read from file successfully");
            System.out.println(s2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class StudentDriver implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;

    StudentDriver(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // For readable output
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}
