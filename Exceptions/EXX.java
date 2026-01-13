public class EXX {
    public static void main(String[] args) {
        try{
            int[] arr = {1, 2, 3};
            System.out.println(10/0);  // ArithmeticException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException: " + ae.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("ArrayIndexOutOfBoundsException: " + ai.getMessage());
        }
        catch(NullPointerException n){
            System.out.println("NullPointerException: " + n.getMessage());
        }
        catch(Exception e){
            System.out.println("General Exception: " + e);
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}

 