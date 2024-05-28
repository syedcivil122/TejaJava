package collections;

public class ArrayTest {
	
	public static void main(String[] args) {
		//int - data type
		//[] - array symbol
		//arr - reference variable
		//new - keyword
		//[6] - length
		
	int[] arr=new int[6];
	      
          arr[0] = 10;
          arr[1] = 20;
          arr[2] = 30;
          arr[3] = 40;
          arr[4] = 50;
          arr[5] = 60;
          
	System.out.println(arr[0]);	
	System.out.println(arr[1]);	
	System.out.println(arr[2]);	
	System.out.println(arr[3]);	
	System.out.println(arr[4]);	
	System.out.println(arr[5]);	
	//System.out.println(arr[6]);	
	
	System.out.println("length is "+arr.length);
	int size = arr.length-1;
	System.out.println("size "+size);

	System.out.println("=============using for loop =====================");
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(i);
	}
	
	for(int i:arr) {
		System.out.println("**************"+"index"+arr[i]);
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.println("index is "+i+" = "+" value is "+arr[i]);
	}
		
	
	System.out.println("=============using for each loop =====================");
	
	for(int val:arr) {
		System.out.println(val);
	}
	}

}
