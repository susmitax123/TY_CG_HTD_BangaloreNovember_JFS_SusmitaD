import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	//add element into the collection
	c1.add(12);
	System.out.println(c1);
	//remove the object from the collection
	c1.remove(12);
	System.out.println(c1);
	//check collection is empty or not
	System.out.println(c1.isEmpty());
	c1.add(12);
	//check is that value is present or not
	System.out.println(c1.contains(12));
	System.out.println(c1.size());
}
}
