public class OverRiding extends Parent{
    void add(){
        System.out.println(20+20);
    }
    public static void main(String[] args) {
        OverRiding o = new OverRiding();
        o.add();
}
}
class Parent{
    void add(){
        System.out.println(10+10);
    }
}