import java.util.LinkedList;
import java.util.List;

public class Linkedlistexample {
public static void main(String[] args) {
	
 List<String> linked = new LinkedList<String>();
    linked.add("Vijay");
    linked.add("Surya");
    
    System.out.println(linked);
    
    linked.remove(0);
    System.out.println(linked);
	}
}
