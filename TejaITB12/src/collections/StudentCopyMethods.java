package collections;

import java.util.Collections;

public class StudentCopyMethods  implements Cloneable{
	int id;
	String name;
	long mobile;
	
	
	public StudentCopyMethods() {
		
	}
	
	public StudentCopyMethods(int id, String name, long mobile) {
		
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		StudentCopyMethods cm=new StudentCopyMethods(1, "syed", 123455666L); 
		System.out.println(cm.id + " " + cm.name + " " + cm.mobile);
		
		StudentCopyMethods cm1 =new StudentCopyMethods(); // deep copy
		cm1.id = cm.id;
		cm1.name = cm.name;
		cm1.mobile = cm.mobile;
		System.out.println(cm1.id + " " + cm1.name + " " + cm1.mobile);
		
		StudentCopyMethods cm2 =new StudentCopyMethods(); // shallow copy
		cm2 = cm;
		System.out.println(cm2.id + " " + cm2.name + " " + cm2.mobile);
		
		StudentCopyMethods cm3 = (StudentCopyMethods)cm.clone();// object copy - data cloning
		System.out.println(cm3.id + " " + cm3.name + " " + cm3.mobile);
			
	}
	
}
