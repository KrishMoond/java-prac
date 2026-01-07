public class Solution{
    private String name;
    private Sim s;

    public Solution(String name, Sim s){
        this.name=name;
        this.s=s;
    }

    public void dis(){
        System.out.println(name+" with SIM "+s.getNo());
    }

    public static void main(String args[]){
        Sim s1= new Sim(9876543210L);
        Solution s2= new Solution("Samsung",s1);
        s2.dis(); 
    }
}

class Sim{
    private long number;

    public Sim(long number){
        this.number=number;
    }

    public long getNo(){
        return number;
    }
}