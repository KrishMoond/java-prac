import java.util.*;
public class Condition {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //  String in=sc.next();
        
        //  if(in.equals("Monday")){
        //     System.out.println("Roti Sabzi");
        //  }
        //  else if(in.equals("Tuesday")){
        //     System.out.println("Rice and Curry");
        //  }
        //  else if(in.equals("Wednesday")){
        //     System.out.println("Fried Rice");
        //  }
        //  else if(in.equals("Thursday")){
        //     System.out.println("Dal Chawal");
        //  }
        //  else if(in.equals("Friday")){
        //     System.out.println("Pasta");
        //  }
        //  else if(in.equals("Saturday")){
        //     System.out.println("Pizza");
        //  }
        //  else if(in.equals("Sunday")){
        //     System.out.println("Burger");
        //  }
        //  else{
        //     System.out.println("Invalid Day");
        //  }

        // int n =sc.nextInt();
        // String arr[]= {"Januart","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};

        // if(n==1){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==2){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==3){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==4){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==5){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==6){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==7){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==8){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==9){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==10){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==11){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }
        // else if(n==12){
        //     for(int i=n-1;i<arr.length;i++){
        //         System.out.println(arr[i]);
        //     }
        // }

        // else{
        //     System.out.println("null");
        // }
         
        // int n=sc.nextInt();
        // if(n%2==0){
        //     System.out.println("Even Number");
        // }
        // else{
        //     System.out.println("Odd Number");
        // }

        // int a=sc.nextInt();
         
        // for(int i=10;i<=20;i++){
        //      if(a==i){
        //         System.out.println("Yes");
        //         break;
        //      }
        //      else{
        //         System.out.println("No");
        //         break;
        //      }
        // }

        // int bal=1000;
        // int withdraw=sc.nextInt();
        // if(bal>=withdraw && withdraw%100==0){
        //     bal=bal-withdraw;
        //     System.out.println("Withdraw Successful");
        //     System.out.println("Remaining Balance: "+bal);
        // }
        // else{
        //     System.out.println("Insufficient Balance or Invalid Amount");
        // }

        int m=89;
        int income=30000;
        if(m>80 && income<=350000){
            System.out.println("Eligible for Scholarship");
        }
         
        else{
            System.out.println("Not Eligible for Scholarship");
        }
    }
}
