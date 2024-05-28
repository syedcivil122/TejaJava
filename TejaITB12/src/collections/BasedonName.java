package collections;

import java.util.Comparator;

public class BasedonName implements Comparator<BirlaProducts>{

	@Override
	public int compare(BirlaProducts o1, BirlaProducts o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
