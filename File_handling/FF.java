import java.util.*;
import java.io.*;

public class FF {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // making file object
        File obj= new File("fitle.txt");
         try{
            // creating file
            if(obj.createNewFile()){
                System.out.println("File created: "+obj.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

        //reading file data
        try{
            FileReader fr=new FileReader("file.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.println((char)i);  //explicit type casting
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println(obj.getAbsolutePath());
        File objj= new File("C:\\Users\\Krish\\Desktop\\prac\\File_handling");
        File[] File_handling= objj.listFiles();
        if(File_handling!=null){
            for(File f:File_handling){
                System.out.println(f.getName());
            }
        }

        //writing in a file 
        try{
            FileWriter fw=new FileWriter("file.txt");
            fw.write("Hello");
            fw.write("Hello");
            fw.close();
        }
        catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }

        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt"));
            bw.write("hwll");
            bw.close();
        }
        catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }

        try{
            BufferedReader br= new BufferedReader(new FileReader("file.txt"));
            String i;
            while((i=br.readLine())!=null){ // read data line by line
                System.out.println(i);
            };
        }
        catch(IOException e){
            System.out.println(e.getLocalizedMessage());;
        }

        //deleting a file
        if(obj.delete()){
            System.out.println("File deleted: "+obj.getName());
        }
    }
}
