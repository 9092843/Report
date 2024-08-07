
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistexample extends Linkedlistexample {

	public static void main(String[] args)  {
		List<String> list = new ArrayList<String>();
		
		ArrayList<String> li = new ArrayList<String>();
		// More flexible , we can add, remove more num of elements easily
		                                             
		int a[] =new int[50];                        // Size is fixed in array ,we need to change the size each and and need to compile
		addArrayList(list);
		//removeArrayList(list,4);
		System.out.println("add"+list.add(""));
	list.clear();
//		System.out.println("equals"+list.equals(list));
//		System.out.println(list.contains(list));
//		System.out.println(list.get(0));
//		System.out.println(list.getClass());
//		System.out.println(list.hashCode());
//		System.out.println(list.indexOf(1));
//		System.out.println(list.isEmpty());
//		System.out.println(list.iterator());
//		System.out.println(list.lastIndexOf(list));
//		list.notifyAll();
//		System.out.println(list.remove(0));
//		System.out.println(list.removeAll(list));
//		list.replaceAll(null);
//		System.out.println(list.set(0, null));
//		System.out.println(list.size());
//		list.sort(null);
//		System.out.println(list.subList(0, 0));
//		System.out.println(list.toArray());
//		System.out.println(list.toString());
//		System.out.println(list.size());
//		List<String> reverse = new ArrayList<String>(); 
//		int i = list.size();
//		for ( int j =i ; j !=0; j--) {
//			System.out.println(list.get(j-1));
//			reverse.add(list.get(j-1));
//		}
//		
//		for (String rev : reverse) {
//			System.out.print(rev);
//		}
	}
	

//	public static void removeArrayList(List<String> list, int index) {
//		 list.remove(4);
//		
//	}

	public static void addArrayList(List<String> list) {
		 list.add("Vj");   // support redundancy - we can store same data multiple times 
		 list.add("Tg");
		 list.add("Bhuvi");
		 list.add("Ak");
		 list.add(null);
		 list.add("Vj");
		 System.out.println(list);
		 
	}
	
	}
