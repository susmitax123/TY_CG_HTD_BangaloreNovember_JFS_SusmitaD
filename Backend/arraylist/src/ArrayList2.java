import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayList2 {
	public static void main(String[] args) {
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(20);
		a.add(66);
		a.add(88);
		a.add(88);
		a.add(88);
		a.add(100);
		System.out.println("a: "+a);
		
		a.remove(new Integer(88));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(70);
		a1.add(45);
		a1.add(44);
		a1.add(88);
		a1.add(100);
		System.out.println("a1: "+a1);
		
		System.out.println(a.contains(78));
		System.out.println(a);
		
		a.addAll(a1);
		System.out.println(a);
		a.removeAll(a1);
		System.out.println(a);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(20);
		a2.add(66);
		a2.add(88);
		a2.add(88);
		a2.add(88);
		a2.add(100);
		System.out.println("a2: "+a2);
		a2.containsAll(a1);
		System.out.println("containsall"+a2);
		
		a2.retainAll(a1);
		System.out.println("a2 retainall a1 :" +a2);
	
		a.clear();
		System.out.println(a);
	
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("----for each----");
		for(Integer i1:a1) {
			System.out.println(i1);
		}
		
		System.out.println("----iterator method---");
		Iterator itr =a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----listIterator-----");
		ListIterator <Integer> ltr=a1.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		}
	}
	

