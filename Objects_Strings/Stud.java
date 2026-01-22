public class Stud {
    public static void main(String[] args) {
        int m1= 85;
        int m2= 90;
        int m3= 8;
        
         int total = m1 + m2 + m3;
        
        //  double average = total / 3.0;
        
         String res= (m1>=40 && m2>=40 && m3>=40) ? "Pass" : "Fail";
         System.out.println("Total Marks: " + total);
         System.out.println(res);
    }

}
