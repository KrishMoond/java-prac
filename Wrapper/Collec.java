import java.util.*;
class Collec{   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> arr = new ArrayList<>();
		 
		while(sc.hasNext()){
			if (sc.hasNextInt()) {
				arr.add(sc.nextInt());
			} else if (sc.hasNextDouble()) {
				arr.add(sc.nextDouble());
			} else {
				arr.add(sc.next());
			}
			
		}
		System.out.println(arr);

		ArrayList al= new ArrayList<>();
		al.addAll(arr);
		System.out.println(al);

		al.add(0,"Start");
		System.out.println(al);

		al.removeAll(al);
		System.out.println(al);
		
	}
}