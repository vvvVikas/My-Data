package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class C1 {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		Object o1= new Object();
		Object o2=o1;
		m.put(o1, 1); 
		m.put(o2, 2);
		System.out.println(m.get(o1));
	}

}
