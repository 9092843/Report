import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maping {
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();          
		      map.put(100,"Amit");    
		      map.put(101,"Vijay");    
		      map.put(102,"Rahul");  
		      for(Map.Entry i : map.entrySet()){    
		    	    System.out.println(i.getKey()+" "+i.getValue()); 
		     // map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(System.out::println);
}
}}