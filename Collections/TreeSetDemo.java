import java.util.*;

/**
 * Store class representing items with name and price
 */
class Store {
    private String name;
    private int price;
    
    /**
     * Constructor for Store
     * @param name Store item name
     * @param price Store item price
     */
    public Store(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Price = " + price;
    }
}

/**
 * Comparator to sort stores by price
 */
class PriceComparator implements Comparator<Store> {
    public int compare(Store s1, Store s2) {
        return Integer.compare(s1.getPrice(), s2.getPrice());
    }
}

/**
 * Comparator to sort stores by name
 */
class NameComparator implements Comparator<Store> {
    public int compare(Store s1, Store s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

/**
 * Comparator to sort by price first, then by name if prices are equal
 */
class StoreComparator implements Comparator<Store> {
    public int compare(Store s1, Store s2) {
        int priceCompare = Integer.compare(s1.getPrice(), s2.getPrice());
        if (priceCompare == 0) {
            return s1.getName().compareTo(s2.getName());
        }
        return priceCompare;
    }
}

/**
 * TreeSetDemo class demonstrating TreeSet with custom comparators
 * for sorting Store objects by different criteria.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Store> ts = new TreeSet<>(new StoreComparator());
        ts.add(new Store("ItemA", 300));
        ts.add(new Store("ItemB", 200));
        ts.add(new Store("ItemC", 300));
        ts.add(new Store("ItemD", 100));

        System.out.println("After sorting by price and name:");
        for (Store s : ts) {
            System.out.println(s);
        }
    }   
}
