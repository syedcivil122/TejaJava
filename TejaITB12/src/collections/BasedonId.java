package collections;

import java.util.Comparator;

public class BasedonId implements Comparator<BirlaProducts>{

	@Override
	public int compare(BirlaProducts o1, BirlaProducts o2) {
		System.out.println();
		return o1.pid-o2.pid;
	}
	

}


