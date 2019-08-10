
public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int b=2;
		int c=3;
		
		int array[] = new int [3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		System.out.println(array[0]+"]["+array[1]+"]["+array[2]);
		
		int array1[]={4,5,6};
		
		System.out.println(array1[0]+"]["+array1[1]+"]["+array1[2]);
		
		int array3[]=new int[10];
		
		for (int i=0; i< array3.length; i++) {
			array3[i]=i+1;
			
		}
	for (int i :array3){
		System.out.println(i);
	}
	
	String arrayString[]= {"hello","world","goodmorning"};
	Object arrayObject[]={"hello",8,7,5,'A'};
	
	for (Object i: arrayObject) {
		System.out.println("Object Array=="+i);
	}
	
	int multiArray[][]= new int[2][2];
	
	multiArray[0][0]=1;
	multiArray[0][1]=2;
	multiArray[1][0]=3;
	multiArray[1][1]=4;
	
	System.out.println(multiArray[0][0]+"["+multiArray[0][1]+"["+multiArray[1][0]+"["+multiArray[1][1]);
	
	int multiArray1[][]={{6,7},{8,9}};
	
	for (int i =0; i<multiArray1.length;i++) {
		
		for (int j = 0; j <multiArray1[i].length; j++){
	
			System.out.println(multiArray1[i][j]);
		}
		
		String s="Hello";
		System.out.println("String Lenght="+s.length());
		System.out.println(s.contains("11"));
		System.out.println(s.contains("World"));
		System.out.println(s.replace('1','0'));
	}
	}	
}