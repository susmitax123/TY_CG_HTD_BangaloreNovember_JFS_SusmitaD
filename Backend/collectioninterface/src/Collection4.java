import java.util.ArrayList;
import java.util.Collection;

public class Collection4 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add(99);
	c1.add(100);
	c1.add(76);
	
	Object a[] = c1.toArray();
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
}
}
