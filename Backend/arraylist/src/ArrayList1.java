import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(45);
	a1.add(98);
	a1.add(88);
	
	System.out.println(a1);
	
	a1.remove(1);
	
	System.out.println(a1);
	
	System.out.println("-----for loop------");
	for(int i = 0; i<a1.size();i++) {
		System.out.println(a1.get(i));
	}
	
	System.out.println("-----for each loop-----");
	for(Integer i1:a1) {
		System.out.println(i1);
	}
	
	System.out.println("-----iterator method----");
	Iterator<Integer> itr = a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("---------list iterator----");
	ListIterator<Integer> itr1 =a1.listIterator();
	
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	
	while(itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}
}
}
