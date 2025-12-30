public class Palindrome {
    public static void main(String args[]){
        int a=1221;

        int rev=0;
        int temp=a;

        while(a!=0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }

        if(temp==rev){
            System.out.println(temp+" is a palindrome");
        } else {
            System.out.println(temp+" is not a palindrome");
        }

        // String num= Integer.toString(a);
        // StringBuilder rev= new StringBuilder(num);
        // rev.reverse();
        // if(num.equals(rev.toString())){
        //     System.out.println(a+" is a palindrome");
        // } else {
        //     System.out.println(a+" is not a palindrome");
        // }
    }
}
