import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("mallaiah");
		s.add("budugu");
		s.add("rani");
		s.add("hari");
		s.add("rani");
		s.add("budugu");
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Object[] objects = s.toArray();
		for (Object object : objects) {
			System.out.print(object);
		}

	}

}
