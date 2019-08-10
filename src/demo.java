
public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        String x="monday";
        char v='A';
        boolean z = true;
        float b = 48.12f;
	
       /* System.out.println("Integer=="+a+"String=="+x+"char=="+v+"boolean=="+z+"float=="+b);

	    if (a>10) {
	    	System.out.println("Greater");
	    
	    	
	    }	else {
	     	 System.out.println("Not Greater");
	     	 }
	if(x=="alpha") {
		System.out.println("Alpha");
	}else if(x=="bravo"){
		System.out.println("Nothing found");
	*/
	switch (x) {
	case "alpha":
	System.out.println("Alpha");    
	break;
	case "bravo":
		System.out.println("Bravo");
		break;
	case "Charlie":
		System.out.println("Charlie");
		break;
	default :
		System.out.println("Not found");
		break;
	}
	}
	

}
