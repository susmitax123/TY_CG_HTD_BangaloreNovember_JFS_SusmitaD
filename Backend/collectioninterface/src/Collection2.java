import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
	c1.add("susmita");
	System.out.println(c1);
	c1.remove("susmita");
	System.out.println(c1);
	c1.add("madhumita");
	System.out.println(c1.isEmpty());
	System.out.println(c1.contains("susmita"));
	System.out.println(c1.size());
}
}
