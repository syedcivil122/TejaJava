package collections;

import java.util.Comparator;

public class BasedonPrice implements Comparator<BirlaProducts> {

	@Override
	public int compare(BirlaProducts o1, BirlaProducts o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;
	}

}
