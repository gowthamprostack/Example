import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Map<String, String> map = new HashMap<>();
		 
		 map.put("1","35");
		 map.put("2","34");
		 map.put("1=3","33");
		 map.put("4","32");
		 map.put("5","31");
		
       
		  
		
		
		 for (Map.Entry<String, String> e : map.entrySet())
	            System.out.println("Key: " + e.getKey()
	                               + " Value: " + e.getValue());
	    
	    }
	}


