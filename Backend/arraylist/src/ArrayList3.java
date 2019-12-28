import java.util.ArrayList;

public class ArrayList3 {
public static void main(String[] args) {
	ArrayList<Double> a1 = new ArrayList<Double>();
	a1.add(20.1);
	a1.add(60.2);
	a1.add(20.1);
	a1.add(55.00);
	a1.add(90.9);
	System.out.println("original array a1: "+a1);
	System.out.println("size of a1: "+a1.size());
	System.out.println("array is empty or not: "+a1.isEmpty());
	System.out.println("60.2 contains or not in the array: "+a1.contains(60.2));
	a1.remove(55.00);
	System.out.println(a1);
	
	ArrayList<Double> a2 = new ArrayList<Double>();
	a2.add(20.1);
	a2.add(60.2);
	a2.add(22.17);
	a2.add(550.00);
	a2.add(100.9);
	System.out.println("original array a2: "+a2);
	
	a1.addAll(a2);
	System.out.println("after adding a2: "+a1);
	
	ArrayList<Double> a3 = new ArrayList<Double>();
	a3.add(28.1);
	a3.add(60.2);
	a3.add(20.1);
	a3.add(55.00);
	a3.add(90.9);
	a3.containsAll(a2);
	System.out.println(a3);
	
}
}
