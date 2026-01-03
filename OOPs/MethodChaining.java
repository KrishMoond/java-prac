public class MethodChaining {

    private String name;
    private int price;

    // public MethodChaining(){
    //     setname("Pen");
    //     setprice(100);
    //     System.out.println("Name: "+name);
    //     System.out.println("Price: "+price);
    // }  

    // public MethodChaining setname(String name){
    //     this.name=name;
    //     return this;
    // }

    // public MethodChaining setprice(int price){
    //     this.price=price;
    //     return this;
    // }

    public MethodChaining setname(String name){
        this.name=name;
        return this;
    }

    public MethodChaining setprice(int price){
        this.price=price;
        return this;
    }

    public String getname(){
        return name;
    }

    public int getprice(){
        return price;
    }
    
    // Methods that display and return this for chaining
    public MethodChaining displayName(){
        System.out.println("Name: " + name);
        return this;
    }
    
    public MethodChaining displayPrice(){
        System.out.println("Price: " + price);
        return this;
    }
    
    public MethodChaining display(){
        System.out.println("Name: " + name + ", Price: " + price);
        return this;
    }

    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        // obj.setname(null).setprice(0);

        // PROBLEM: getname() returns String, cannot chain further
        // obj.setname("Pen").setprice(10).getname().getprice(); // ERROR!
        
        // NOW YOU CAN CALL EVERYTHING IN ONE LINE!
        obj.setname("Pen").setprice(10).display();
        
        // More one-line examples
        new MethodChaining().setname("Book").setprice(50).displayName().displayPrice();
        
        new MethodChaining().setname("Pencil").setprice(5).display();
        




    }
}
