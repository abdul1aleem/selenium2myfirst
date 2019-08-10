
public class oops {

String s;

void display(){
System.out.println("Display method");
s="Hell0";
System.out.println(s);
}

String showVehicleName(String pq){
	
	String vehicaleName=pq;
	if (vehicaleName.equalsIgnoreCase("Audi")){
		System.out.println("Found");
		return vehicaleName;
	}
	else {
		return "Nothing found";
	}
}
    public static void main(String[] args){
    	
    	oops obj= new oops();
    	//obj.display();
    	String v="honda";
    	String x=obj.showVehicleName(v);
    	System.out.println(x);
    }
	}


