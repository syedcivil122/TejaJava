package fileHandling;

import java.io.Serializable;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12334567890L;
	int id;
	String name;
	
	transient int CVV;// can't serialize it
	static long caedno;// can't serialize it
	
	
	
	
	public Customer(int id, String name, int cVV) {
		super();
		this.id = id;
		this.name = name;
		CVV = cVV;
	}

	

}
