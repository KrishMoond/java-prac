public class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

try {
    throw new MyException("Error");
} catch (MyException e) {
    System.out.println(e.getMessage());
}
 {
    
}
