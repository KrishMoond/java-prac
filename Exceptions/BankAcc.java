public class BankAcc {
     static void withdraw(int bal) throws CustomEx{
        if(bal!=100){
            throw new CustomEx("You can withdraw 100 rupee notes only");
        }
        else{
            System.out.println("You can withdraw");
        }
     }

     public static void main(String[] args) {
        try{
            withdraw(1010);
        }
        catch(CustomEx e){
            System.out.println(e.getMessage());
        }
     }
}


class CustomEx extends Exception{
    CustomEx(String message){
        super(message);
    }
}