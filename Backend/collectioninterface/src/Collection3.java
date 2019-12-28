import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add(21);
	c1.add(23);
	c1.add(25);
	System.out.println("c1: "+c1);
	Collection c2 = new ArrayList();
	c2.add(25);
	c2.add(26);
	c2.add(27);
	System.out.println("c2: "+c2);
	c1.addAll(c2);
	System.out.println("after addAll() c1: "+c1);
	c1.removeAll(c2);
	System.out.println("after removeAll c1: "+c1);
	Collection c3 = new ArrayList();
	c3.add(88);
	c3.add(69);
	c3.add(77);
	Collection c4 = new ArrayList();
	c4.add(88);
	c4.add(55);
	c4.add(77);
	c4.add(20);
	c3.retainAll(c4);
	System.out.println("after retainAll c3: "+c3);
	c3.clear();
	System.out.println(c3);
}
}
