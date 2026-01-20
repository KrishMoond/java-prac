import java.util.*;


class Store{
    String name;
    int price;
    Store(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Name = "+name+", Price = "+price;
    }
}

class PriceComparator implements Comparator<Store>{
    public int compare(Store s1,Store s2){
        return Integer.compare(s1.getPrice(),s2.getPrice());
    }
}

class NameComparator implements Comparator<Store>{
    public int compare(Store s1,Store s2){
        return s1.getName().compareTo(s2.getName());
    }
}

//sort if price is same then sort by name
class StoreComparator implements Comparator<Store>{
    public int compare(Store s1,Store s2){
        int priceCompare = Integer.compare(s1.getPrice(),s2.getPrice());
        if(priceCompare==0){
            return s1.getName().compareTo(s2.getName());
        }
        return priceCompare;
    }
}

public class TreeeSett {
    public static void main(String[] args) {
        TreeSet<Store> ts = new TreeSet<>(new StoreComparator());
        ts.add(new Store("ItemA",300));
        ts.add(new Store("ItemB",200));
        ts.add(new Store("ItemC",300));
        ts.add(new Store("ItemD",100));

        System.out.println("After sorting by price and name:");
        for(Store s : ts){
            System.out.println(s);
        }

    }   
}
