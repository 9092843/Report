import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
//	HashSet<String> has= new HashSet<String>();
//	has.add("Vijay");
//	has.add("bhuvi");
//	has.add("ashok");
//	has.add("Tg");
//	has.add("Vijay");
//	System.out.println(has);
	
//	LinkedHashSet<String> Linkhas= new LinkedHashSet<String>();
//	Linkhas.add("iuytfd");
//	Linkhas.add("ihgvhgb");
//	Linkhas.add("uhu");
//	Linkhas.add(null);
	
	TreeSet<Integer> tree = new TreeSet<Integer>();
	tree.add(53);
	tree.add(13);
	tree.add(23);
	tree.add(63);
	
System.out.println(tree);
System.out.println(tree.tailSet(23));
	
	}
}

