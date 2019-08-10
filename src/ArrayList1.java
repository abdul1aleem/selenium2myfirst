import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1 {


	public static void main(String[] args) {

/*			 ArrayList listed=new ArrayList();
		    Scanner sc = new Scanner(System.in);  
		    listed.add(sc.nextLine());
		    listed.add(sc.nextInt());
		    listed.add(sc.nextDouble());
		    for (Object i : listed){
		    	
		    	System.out.println(i);
		    }*/
		    
		    HashMap<String, Object> hm= new HashMap<>();
		    hm.put("SIN", "123456");
		    hm.put("Name", "Alpha");
		    hm.put("DOB", "13");
		    for (Map.Entry<String, Object> M: hm.entrySet()){
		    	System.out.println(M.getKey()+"---"+M.getValue());
		    }

	}
}